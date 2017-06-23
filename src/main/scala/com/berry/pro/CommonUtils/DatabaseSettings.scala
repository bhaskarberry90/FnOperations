package com.berry.pro.CommonUtils

import com.typesafe.config.Config
import scala.util.Try

trait DatabaseSettings {
  val cf: Config

 lazy val connString: String =
    new DatabaseConnBuilder().buildDatabaseConnString(createDbConfig())

 private def createDbConfig() = {
    val databaseConfig = cf.getConfig("database")
    Database(
      //The order from case class does not matter here but name should be same as case class name-- Just a note
      serverName = databaseConfig.getString("serverName"),
      database = databaseConfig.getString("databaseName"),
      instanceName = Try(databaseConfig.getString("instanceName")).toOption,
      port = Try(databaseConfig.getInt("port")).toOption,
      useIntegratedSecurity =
        Try(databaseConfig.getBoolean("useIntegratedSecurity")).toOption,
      userName = Try(databaseConfig.getString("userName")).toOption,
      pwd = Try(databaseConfig.getString("pwd")).toOption
    )
  }
}
