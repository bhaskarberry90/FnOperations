package com.berry.pro.CommonUtils

class DatabaseConnBuilder {
  private val defaultIntegratedSecurity = false

  def buildDatabaseConnString(database: Database): String = {
    val portNumber = database.port.map(p => s":$p").getOrElse("")
    val instancePart =
      database.instanceName.map(in => s"instanceName=$in;").getOrElse("")
    val dbNamePart = s"databaseName= ${database.database};"
    val integratedSecurity =
      database.useIntegratedSecurity.getOrElse(defaultIntegratedSecurity)
    val (usernamePart, pwdPart) = if (!integratedSecurity) {
      (for {
        username <- database.userName
        password <- database.pwd
      } yield (s";user=$username", s";password=$password"))
        .getOrElse(throw new IllegalArgumentException(
          "Username and Pwd must be provided in this configuration file ,if UserIntegritySecurity is set to false"))
    } else ("", "")
    s"jdbc:sqlserver://${database.serverName}$portNumber;$instancePart;$dbNamePart" +
      s"integratedSecurity=$integratedSecurity$usernamePart$pwdPart"
  }
}
