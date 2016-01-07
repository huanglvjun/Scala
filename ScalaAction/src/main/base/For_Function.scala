/**
 * @author Administrator
 */
object For_Function {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 5; j <- 1 to 2) print((100*i + j) + " ")
    println()
    for(i <- 1 to 2; j <- 1 to 2 if i != j) print((i*100 +j) + " ")
    
//    # 函数是有值的
    def addA(x: Int) = x + 100
//    # 匿名函数
    val add = (x: Int) => x + 200  
    println("The result from a function is : " + addA(2))
    println("The result from a val is : " + add(2))
    
//    递归函数调用必须声明函数返回值类型，其它情况可不声明类型，scala会进行类型推断
    def fac(n: Int): Int = if(n <= 1) 1 else n * fac(n - 1)
    println(fac(5))
    
    def combine(content: String, left: String = "[", right: String = "}") = left + content + right
    println(combine("I love spark!", "<<"))
//    可变参数
    def connected(args: Int*) = {
      var result = 0
      for(arg <- args) result += arg
      result
    }
    println(connected(1, 2, 3, 4))
    
  }
}