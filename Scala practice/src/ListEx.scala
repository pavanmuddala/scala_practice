
//list is immutable and represents linked list in scala
object ListEx extends App{
  val list1 = List(1,2,3,3,4,4,5);
  println(list1);
  println(list1.isEmpty);
  println(list1.reverse);
  println(list1.distinct);
  val uniformList = List.fill(3)("Videograph");
  println(uniformList);
  println(list1.head);
  println(list1.tail);//return all elements except the first one
  println("******* list buffer *********");
  // A List is immutable, if we need to create a list that is constantly changing, the preferred approach is to use a ListBuffer.
  import scala.collection.mutable.ListBuffer;
  val listBuff1 = ListBuffer(1,2,3,4,5);
  val listBuff2 = new ListBuffer[Int]();
  listBuff2+=20;
  listBuff2+=30;
  listBuff2+=40;
  val list = listBuff2.toList;
  println(listBuff1);
  println(listBuff2);
  println(list);
  println(listBuff2(2));
  listBuff2-=20;
  println(listBuff2);
  listBuff2.append(99,88,77,66);
  println(listBuff2);
  listBuff2.remove(0);
  println(listBuff2);
  listBuff2.insert(2,10000);
  println(listBuff2);
  listBuff2.update(2,999999);
  println(listBuff2);
}