/**
 * @author Administrator
 */
object HelloScala {
  def main(args: Array[String]): Unit = {
    println("Hello Scala!")
    for(arg <- args) print(arg)
  }
  
}