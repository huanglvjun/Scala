/**
 * @author Administrator
 */
/*object University{
  private var studentNo = 0
  def newStudentNo = {
    studentNo += 1
    studentNo
  }
}
object Object {
  def main(args: Array[String]): Unit = {
    println(University.newStudentNo)
    println(University.newStudentNo)
  }
}*/

class University{
  val id = University.newStudentNo
  private var number = 0
  def aClass(number: Int){
    this.number += number
  }
}

object University{
  private var studentNo = 0
  private def newStudentNo = {
    studentNo += 1
    studentNo
  }
}