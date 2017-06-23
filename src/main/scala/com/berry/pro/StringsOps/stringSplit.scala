package com.berry.pro.StringsOps

/**
  * Created by BBerry on 6/21/2017.
  */
class stringSplit {
  val sampleString = "Hey Berry"
  println("----String Splitting based on spaces : " + sampleString)
  sampleString.split(" ").foreach(println)
  val csvString = "IT, DEV , UACC , TESTING , PROD"
  println("----String Splitting based on comma :" + csvString)
  csvString.split(",").foreach(println)
  println("----String Splitting based on comma with the limit 4 :" + csvString)
  csvString.split(",", 4).foreach(println)
  println("----String Splitting based on comma along with trim:" + csvString)
  csvString.split(",").map(_.trim).foreach(println)
  val regString = "Hey berry, this world is crazy!!!"
  println("----String Splitting based on regular expression" + regString)
  regString.split("\\s+").foreach(println)
}
