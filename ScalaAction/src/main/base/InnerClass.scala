/**
 * @author Administrator
 */
class Outer(val name: String){ outer =>
  class Inner(val name: String){
    def foo(b: Inner) = println("Outer: " + outer.name + "\t" +
    "Inner: " + b.name)
  }
}
object InnerClass {
  def main(args: Array[String]){
    val outer1 = new Outer("spark")
    val outer2 = new Outer("hadoop")
    val inner1 = new outer1.Inner("scala")
    val inner2 = new outer2.Inner("java")
    inner1.foo(inner1)
    inner2.foo(inner2)
    
  }
  
}