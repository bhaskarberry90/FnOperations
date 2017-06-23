package com.berry.pro.CollectionTopics

import com.berry.pro.CommonUtils.DatabaseSettings
import com.typesafe.config.Config
import com.zaxxer.hikari.HikariDataSource
import scalikejdbc.{ConnectionPool, DataSourceConnectionPool}

class AppModule(override val cf: Config) extends DatabaseSettings {
  initializeConnectionPool()

  private def initializeConnectionPool() = {
    val hikariDs = new HikariDataSource()
    hikariDs.setJdbcUrl(connString)
    ConnectionPool.singleton(new DataSourceConnectionPool(hikariDs))
  }
}