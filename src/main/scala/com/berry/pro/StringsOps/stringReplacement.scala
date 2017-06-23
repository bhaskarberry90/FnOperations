package com.berry.pro.StringsOps

/**
  * Created by BBerry on 6/21/2017.
  */
class stringReplacement {
  val name = "Bhaskar Berry"
  var age = 26
  val weight = 34.56
  val initial = 'B'
  println(s"My name is $name and age is $age")
  println(
    s"using braces{for calculating expressions}:: My name is $name and age is ${age + 2}")
  println(
    s"Using the expression for comapring :My name is $name and age is $age and that is ${age + 2 == 28}")
  println(
    f"using the fomatspecifies :My name is $name and age is $age and weighs around $weight%.1f pound")
  println("My name is %c Bhaskar".format(initial))
}
