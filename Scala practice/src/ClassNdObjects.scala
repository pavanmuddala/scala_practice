
class Animal(){
  println("Creating animal class object...");
  val animalType:String = "mammals";
  def displayAnimal()={
    println("Hi my type is "+animalType);
  }
}
//every class has a primary constructor we can override it
class Person(val age:Int,val name:String){
  def this(age:Int){
    this(age,"pavan");
  }
  def this(){
    this(23,"sai pavan");
  }
  def display()={
    println("My name is : "+name+", age:"+age);
  }
}

object ClassNdObjects {
  def main(args:Array[String]):Unit={
   val animal = new Animal();
   println(animal.animalType);
   animal.displayAnimal();
   val person = new Person();
   person.display();
   val person2 = new Person(24,"Madhu");
   person2.display();
   val person3 = new Person();
   person3.display();
  }
}

