
trait Trait1{
  var name="pavan";
  val age = 23;
  def displayDetails();
  def getName()={
    println("name -->"+name);
  }
}
trait Trait2{
  val village = "Medapadu";
}
class ClassWithTrait extends Trait1 with Trait2{
  name = "sai";
  def displayDetails()={
    println(name+"-->"+age+" from "+village);
  }
}
object TraitExample extends App{
  val classRef = new ClassWithTrait();
  classRef.getName();
  classRef.displayDetails();
  println(classRef.name+","+classRef.village);
}