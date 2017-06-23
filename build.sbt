name := "ScalaAction"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.2"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.2"

libraryDependencies += "com.typesafe" % "config" % "1.3.1"

//Database-related dependencies
val scalikejdbcVersion = "2.5.0"

libraryDependencies += "org.scalikejdbc" %% "scalikejdbc" % scalikejdbcVersion

libraryDependencies += "org.scalikejdbc" %% "scalikejdbc-config" % scalikejdbcVersion

libraryDependencies += "com.zaxxer" % "HikariCP" % "2.5.1"

libraryDependencies += "com.microsoft.sqlserver" % "sqljdbc4" % "4.0"

//libraryDependencies += ("com.microsoft.sqlserver" % "mssql-jdbc" % "6.1.0.jre8")
//  .exclude("javax.xml.stream", "stax-api")
//  .exclude("stax", "stax-api")   //STAX comes with Java 1.6

//libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.6"

//libraryDependencies += "com.h2database" % "h2" % "1.4.192"

//libraryDependencies += "com.zaxxer" % "HikariCP" % "2.5.1"

// https://mvnrepository.com/artifact/log4j/log4j
libraryDependencies += "log4j" % "log4j" % "1.2.17"
