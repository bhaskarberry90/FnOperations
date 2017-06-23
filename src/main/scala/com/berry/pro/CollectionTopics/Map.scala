package com.berry.pro.CollectionTopics


import scalikejdbc._
import com.typesafe.config.ConfigFactory
import com.berry.pro.DbTestDataCreation.DbTestData
import org.apache.log4j.{Level, Logger}

class Map extends DbTestData {
//
//  val logger = LoggerFactory.getLogger("com.zaxxer.hikari.HikariConfig")
//
//  logger

  //Logger.getLogger("com.zaxxer").setLevel(Level.SEVERE)
  //Logger.getLogger("").setLevel(Level.ERROR);

  private implicit val dbSession = AutoSession
  def fetchDBData(): Unit = {
    val applicationModule = new AppModule(ConfigFactory.load())
    println("Calling the appid method ")
    val appInstanceID = fetchAppInstanceCode("IMS SHOP CODE")
    println("The Application ID is : " + appInstanceID)

    val applicationKanjiName = fetchApplicationKnajiName("IMS SHOP CODE")
    println("The applicationKanjiName is : " + applicationKanjiName)
  }
}
