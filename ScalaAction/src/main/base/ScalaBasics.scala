/**
 * @author Administrator
 */
object ScalaBasics {
	def doWhile(): Unit = {
			var line = ""
					do {
						line = readLine()
								println("Read: " + line)
					} while (line != "")
	}

	def max(x: Int, y: Int): Int = {
			if (x > y) x
			else y
	}
  
	def main(args: Array[String]){
//		doWhile
//		var triple = (100, "a", "b")
//		println(triple._2)
//    
//    println(max(8, 6))
    val big = new java.math.BigInteger("123456")
    println(big)
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ","
    greetStrings(2) = "world\n"
    for (i <- 0 to 2)
      print(greetStrings(i)) 
      
    for (i <- 0.to(2))
      print(greetStrings(i))
      
     println(1 + 2)
     println(1.+(2))
     
     val oneTwo = List(1, 2)
     val threeFour = List(3, 4)
     val one_four = oneTwo ::: threeFour
     println(oneTwo + " and " + threeFour)
     println(one_four)
     println(3 :: oneTwo)
     println(oneTwo.::(3))
	}
}