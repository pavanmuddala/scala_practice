
//Note :- We place * on the last argument to make it variable length.
//Syntax : –
//
//
//def Nameoffunction(args: Int *) : Int = { s foreach println. }
//Below are some restrictions of varargs :
//
//The last parameter in the list must be the repeating argument.
//def sum(a :Int, b :Int, args: Int *)
//No default values for any parameters in the method containing the varargs.
//All values must be same data type otherwise error.
//> sum(5, 3, 1000, 2000, 3000, "one")
//> error: type mismatch;
//found : String("one")
//required: Int
//Inside the body args is an array, so all values are packed into an array

object varArgs {
  def main(args:Array[String]):Unit = {
    val sum1 = sum(10,20,30,40,50);
    println(sum1);
  }
  def sum(a :Int, b :Int, args: Int *) : Int =
    { 
        var result = a + b 
      
        for(arg <- args) 
        { 
            result += arg 
        } 
      
        return result 
    } 
}