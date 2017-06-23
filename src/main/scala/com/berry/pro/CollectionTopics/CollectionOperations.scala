package com.berry.pro.CollectionTopics

import org.slf4j.LoggerFactory

object CollectionOperations extends App {
  val logger = LoggerFactory.getLogger(getClass)

  logger.info("----- The Map Operations -----")
  val mapOp = new Map
  mapOp.fetchDBData()
}
