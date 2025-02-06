
import java.io.File
import java.io.PrintWriter
import scala.io.Source
object FileOperations extends App{
  
  val file = new File("abc.text");
  val printWriter = new PrintWriter(file);
  printWriter.write("Writing abc in this file.mmfoaodfiamdoaiognoanooa");
  printWriter.close();
  
  val source = Source.fromFile(file);
  for(line <- source.getLines){
    println(line);
  }
  source.close();
}