package com.berry.pro.StringsOps

class stringPatterns {
  val numericPattern = "[0-9]+".r
  val address = "123 R.T.Nagar Post Bangalore 560032"
  val addressWIthNoNumbers = "R.T.Nagar Post Bangalore"
  println("----------FindFirstIn----------")
  println(numericPattern.findFirstIn(address))
  println("----------FindAllIn----------")
  val matches = numericPattern.findAllIn(address)
  matches.foreach(println)
  val matchesall = numericPattern.findAllIn(address).toArray
  println(matchesall.mkString(","))
  println("----The string with no numbers-----")
  println(numericPattern.findFirstIn(addressWIthNoNumbers))
}
