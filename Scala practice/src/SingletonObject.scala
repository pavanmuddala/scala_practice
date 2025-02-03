
// Scala has an object keyword that we can use when defining a singleton object.
//When we say singleton, we mean an object that can only be instantiated once.
//Creating an object requires just the object keyword and an identifier:

object Pavan{
  val age=23;
  val name = "pavan";
  var location = "hyderabad";
  def getName()={
    println("name --->"+name);
  }
  def getAge()={
    println("age ----->"+age);
  }
  def changeLocation(tempLoc:String)={
    location = tempLoc
  }
  def getLocation()={
    println("location ------>"+location);
  }
}

object SingletonObject {
  def main(args:Array[String])={
    Pavan.getName();
    Pavan.getAge();
    Pavan.getLocation();
    Pavan.changeLocation("Medapadu");
    Pavan.getLocation();
  }
}