package com.hh.scala.hello

import scala.collection.mutable.ArrayBuffer

object list_Ops {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  List()                                          //> res0: List[Nothing] = List()
  Nil                                             //> res1: scala.collection.immutable.Nil.type = List()
  var thrill = "Will"::"fill"::"until"::Nil       //> thrill  : List[String] = List(Will, fill, until)
  List("a", "b") ::: List("c", "d")               //> res2: List[String] = List(a, b, c, d)
  thrill(2)                                       //> res3: String = until
  thrill.count(s => s.length == 4)                //> res4: Int = 2
  thrill.length                                   //> res5: Int = 3
  thrill.lengthCompare(3)                         //> res6: Int = 0
  thrill.drop(2)                                  //> res7: List[String] = List(until)
  thrill.dropRight(2)                             //> res8: List[String] = List(Will)
  thrill.exists(s => s == "until")                //> res9: Boolean = true
  thrill.filter(s => s.length == 4)               //> res10: List[String] = List(Will, fill)
  thrill.forall(s => s.endsWith("l"))             //> res11: Boolean = true
  thrill.foreach { s => print(s) }                //> Willfilluntil
  thrill.foreach(s => print(s))                   //> Willfilluntil
  thrill.foreach(print)                           //> Willfilluntil
  thrill.head                                     //> res12: String = Will
  thrill.tail                                     //> res13: List[String] = List(fill, until)
  thrill.init                                     //> res14: List[String] = List(Will, fill)
  thrill.last                                     //> res15: String = until
  thrill.isEmpty                                  //> res16: Boolean = false
  thrill.map(s => s + "y")                        //> res17: List[String] = List(Willy, filly, untily)
 // thrill.remove(s => s.length == 4)
 // thrill.reverse
  //thrill.sortWith(((s, t) =>
   //s.charAt(0).toLowerCase <
   //t.charAt(0).toLowerCase)
   
   val c = Array(1, 2, 3)                         //> c  : Array[Int] = Array(1, 2, 3)
   for(elem <- c) println(elem * 2)               //> 2
                                                  //| 4
                                                  //| 6
   for(i <- 0 until c.length)
   println(i + ": " + c(i))                       //> 0: 1
                                                  //| 1: 2
                                                  //| 2: 3
   val result = for(elem <- c) yield elem * 2     //> result  : Array[Int] = Array(2, 4, 6)
   val result2 = for(elem <- c if elem % 2 ==0) yield elem * 2
                                                  //> result2  : Array[Int] = Array(4)
   c.filter(_ % 2 == 0).map(_ * 2)                //> res18: Array[Int] = Array(4)
   c.sum                                          //> res19: Int = 6
   val d = ArrayBuffer(1, 7, 3, 4)                   //> d  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 7, 3)
   val dSorted = d.sorted                         //> dSorted  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 3, 7)
                                                  //| 
   scala.util.Sorting.quickSort(c)
   
   c.mkString(" & ")                              //> res20: String = 1 & 2 & 3
   c.mkString("<<", ", ", ">>")                   //> res21: String = <<1, 2, 3>>
   
   val matrix = Array.ofDim[Double](3, 4)         //> matrix  : Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0
                                                  //| , 0.0, 0.0, 0.0), Array(0.0, 0.0, 0.0, 0.0))
   matrix(2)(1) = 33
   matrix                                         //> res22: Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0, 0
                                                  //| .0, 0.0, 0.0), Array(0.0, 33.0, 0.0, 0.0))
   
   var tri = new Array[Array[Int]](10)            //> tri  : Array[Array[Int]] = Array(null, null, null, null, null, null, null, 
                                                  //| null, null, null)
   for(i <- 0 until tri.length)
   tri(i) = new Array[Int](i + 1)
   tri                                            //> res23: Array[Array[Int]] = Array(Array(0), Array(0, 0), Array(0, 0, 0), Arr
                                                  //| ay(0, 0, 0, 0), Array(0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0), Array(0, 0, 
                                                  //| 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0), Array(0, 0, 0, 0, 0, 0, 0, 0
                                                  //| , 0), Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
}