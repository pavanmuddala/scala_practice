

object StringsExample extends App{
  val a = 13;
  val b = 14;
  def sum()={
    a+b;
  }
  val s1 = s"Sum of $a and $b is $sum";
  println(s1);
  val s2 = "pavan";
  val result = s1+s2;
  val result2 = s1.concat(s2);
  println(s2);
  println(s1);
  println(result);
  println(result2);
  val len1 = result.length;
  println(len1)
  val strArr = result.split(" ");
  println(strArr.toList);
}