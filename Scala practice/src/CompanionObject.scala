

class companionClass(val name:String){
  def display()={
    companionClass.getNameNdAge(name);
  }
}
object companionClass{
  val age = 25;
  private def getNameNdAge(name:String)={
    println("Name -->"+name+",Age --->"+age);
  }
  def apply(name:String):companionClass={
    val p = new companionClass(name);
    p;
  }
}

class Person1(val name:String,val age:Int)
object Person1{
  def unapply(p:Person1)={
    val tup = (p.name,p.age);
    tup;
  }
}
//companion object is a singleton object that have same name as class.
//they both can access each others private members.
//we can create a class without using new keyword this will call the apply method inside the object internally.
//we can create multiple apply methods for constructors.
//we can create unapply method to destructure the provided class 
object CompanionObject {
  def main(args:Array[String]):Unit={
    val cc = companionClass("pavan");//the compiler will call apply() method internally like companionClass.apply("pavan")
    cc.display;
    val person = new Person1("Pavan",23);
    val t = Person1.unapply(person);
    println(t);
  }
}