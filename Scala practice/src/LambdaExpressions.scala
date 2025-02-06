
//val lambda_exp = (variable:Type) => Transformation_Expression

object LambdaExpressions {
  def main(args:Array[String])={
     val func = (a:Int,b:Int) => {a+b};
     println(func(10,20));
     println(func(20,50));
     val transform = (a:Int) => a*a;
     val intArr = List(10,20,30,40);
     val transformedArr = intArr.map(transform);
     println(intArr);
     println(transformedArr);
  }
}