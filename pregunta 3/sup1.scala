object FIBO
{

 def superior(funcion:(Int)=>Int):Unit={
   println("Dame un valor : ")
   val n = scala.io.StdIn.readInt()
   println(funcion(n))
 }
 def fibo (n:Int):Int={
    if(n==1 || n==2) 1 else fibo(n-1)+fibo(n-2)
 }
 
 def fbn(n: Int): Int = {
    if (n == 1) {
      return 1
    }
    if (n == 2) {
      return 1
    }
    var a = 1
    var b = 1
    var c = 0
    for (i <- 3 to n) {
      c = a + b
      a = b
      b = c
    } 
     return c
 }
 
 def main(args:Array[String]):Unit = {
   println("recursivo : ")
   superior(fibo)
   println("estructurado : ")
   superior(fbn)  	
 }
}