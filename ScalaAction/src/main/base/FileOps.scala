import scala.io.Source
/**
 * @author Administrator
 */
object FileOps {
  def main(args: Array[String]) {
    //    val file = Source.fromFile("F:\\02_scala\\scala.txt")
    //    lazy: 只有在第一次使用时才会被实例化
//        lazy val file = Source.fromFile("F:\\02_scala\\scala.txt")
    val file = Source.fromURL("http://www.baidu.com/")
    for (line <- file.getLines()){
      println(line)
      //    }
    }
  }
}