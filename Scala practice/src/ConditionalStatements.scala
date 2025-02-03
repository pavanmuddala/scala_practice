

object ConditionalStatements extends App{
  //The last statement that is going to be executed will be the return statement no need to write return keyword.
   val a = 10;
   val b = 20;
   val greater = if(a>b){
     a;
   }else{
     b;
   }
   println(greater);
}