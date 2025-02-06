

object AnonymousFunc extends App{
  val a = (v1:String,v2:String)=>{println(v1+"  "+v2);}
  val b = (_:String) + (_:String)
  a("pavan","Sai");
  b("Sai ...","Pavan...");
}