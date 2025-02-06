
//runtime polymorphism
class Car1{
  def start()={
    println("Car started...");
  }
}
class Toyota1 extends Car1{
  override def start()={
    println("Toyota Started...");
  }
}


object Polymorphism {
  def sum(a:Int,b:Int)={
    println("Sum of a and b :"+(a+b));
  }
  def sum(a:Int,b:Int,c:Int)={
    println("Sum of a,b and c:"+(a+b+c));
  }
  def main(args:Array[String]):Unit={
    sum(10,20);
    sum(10,20,30);
    val car = new Car1();
    val toyota = new Toyota1();
    car.start();
    toyota.start();
  }
}