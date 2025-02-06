
//Scala Closures are functions which uses one or more free variables and the return value of this function is dependent of these variable. 
//The free variables are defined outside of the Closure Function and is not included as a parameter of this function. 
object Closures extends App{
  val a = 10;
  def sum(b:Int)={
    println("Sum --> " + (a+b));
  }
  sum(10);
  sum(10);
  var c = 20;
  def multi(b:Int)={
    println("Multi --> "+(c*b));
  }
  multi(20);
  c = 30;
  multi(20);
  //closures which uses 
}