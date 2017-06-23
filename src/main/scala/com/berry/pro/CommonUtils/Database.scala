package com.berry.pro.CommonUtils

case class Database(
    serverName: String,
    database: String,
    instanceName: Option[String] = None,
    port: Option[Int] = None,
    useIntegratedSecurity: Option[Boolean] = None,
    userName: Option[String] = None,
    pwd: Option[String] = None
)
