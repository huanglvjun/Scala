/**
 * @author Administrator
 */
class Person {
  private var age = 0
  def increment(){age += 1}
  def current = age
}

class Student {
  var age = 0
}

//class Teacher {
//  var name: String = _
//  private var age = 27
//  private[this] var gender = "male"
//  
//  def this(name:String){
//    this()
//    this.name = name
//  }
//  
//  def sayHello(){
//    println(this.name + ":" + this.age + ":" + this.gender)
//  }
//}

class Teacher(val name: String, val age: Int){
  println("primary constructor")
  var gender: String = _
  println(gender)
  def this(name: String, age: Int, gender: String){
    this(name, age)
    this.gender = gender
  }
}

object HelloOOP {
  def main(args: Array[String]): Unit = {
    val person = new Person()
    person.increment()
    person.increment()
    println(person.current)
    
    val student = new Student()
    println(student.age)
    student.age = 28
    
    println(student.age)
    
//    var teacher = new Teacher("Wang")
//    teacher.sayHello()
    
//    val teacher = new Teacher("wang", 27, "male")
//    teacher.gender
  }
  
  
}