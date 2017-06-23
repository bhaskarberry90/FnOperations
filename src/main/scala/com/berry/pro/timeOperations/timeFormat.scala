package com.berry.pro.timeOperations


import java.sql.Timestamp
import java.time.LocalDate

/**
  * Created by BBerry on 6/22/2017.
  */
trait timeFormat {
  val sampleTime : Timestamp = Timestamp.valueOf(LocalDate.now()+" 00:00:00")
}
