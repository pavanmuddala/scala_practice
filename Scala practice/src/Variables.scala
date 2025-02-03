

object Variables {
  //There are two types of variables mutable and immutable
  //1. mutable var
  //2.immmutable val
  def main(args:Array[String])={
    val imm:String = "I'm immutable one";
    var mut:String = "I'm mutable one";
    val imm1 = "Compiler can decide my type";
    var mut2 = "Compiler will decide my type";
    println(imm);
    println(mut);
    println(imm1);
    println(mut2);
    mut = "Oops my value changed";
    println(mut);
    
  }
}