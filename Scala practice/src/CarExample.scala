

class Car (val manufacturer: String, brand: String, var model: String) {
  var speed: Double = 0;
  var gear: Any = 0;
  var isOn: Boolean = false;

  def start(keyType: String): Unit = {
    println(s"Car started using the $keyType")
  }

  def selectGear(gearNumber: Any): Unit = {
    gear = gearNumber
    println(s"Gear has been changed to $gearNumber")
  }

  def accelerate(rate: Double, seconds: Double): Unit = {
    speed += rate * seconds
    println(s"Car accelerates at $rate per second for $seconds seconds.")
  }

  def brake(rate: Double, seconds: Double): Unit = {
      speed -= rate * seconds
      println(s"Car slows down at $rate per second for $seconds seconds.")
  }

  def stop(): Unit = {
    speed = 0;
    gear = 0;
    isOn = false;
    println("Car has stopped.")
  }
}

class Toyota(transmission: String, brand: String, model: String) extends Car("Toyota", brand, model) { 
  override def start(keyType: String): Unit = { 
    if (isOn) {
      println(s"Car is already on.") 
      return
    } 
    if (transmission == "automatic") { 
      println(s"Car started using the $keyType") 
    } else { 
      println(s"Please ensure you're holding down the clutch.") 
      println(s"Car started using the $keyType") 
    } 
    isOn = true  
  } 
}

object CarExample {
  def main(args:Array[String])={
    val car = new Car("Tata","Nano","13.0");
    car.start("pavan's Key");
    car.accelerate(10,5);
    car.selectGear(2);
    car.accelerate(20,5);
    car.selectGear(3);
    car.accelerate(30,5);
    car.brake(0, 5);
    car.stop();
    
    val toyota = new Toyota("automatic","Tata","SUV");
    toyota.start("Sai");
    toyota.accelerate(10, 5);
    toyota.selectGear(2);
    toyota.start("sai");
    println("Speed ---> "+toyota.speed);
    toyota.stop();
  }
}