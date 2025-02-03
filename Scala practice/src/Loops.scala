
import scala.util.control._;
object Loops extends App{
  var i = 0;
  while(i<10){
    println(i);
    i+=1;
  }
  //do while
  println("------------ end of while loop -----------------");
  i=0;
  do{
    i+=1;
    println(i);
  }while(i<10);
  println("---------- end of do while loop ---------");
  
  //for loop
  var y=1;
  for(y <-1 to 10){
    println("in for loop i-->"+i+", y"+y);
  }
  println("------------end of loops -------------");
  val loops = new Breaks();
  loops.breakable{
    var k = 0;
    for(k <- 0 to 10){
      if(k==5){
        loops.break;
      }
      println(k);
    }
  }
  
}