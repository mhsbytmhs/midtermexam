public class HelloWorld 
{
	
   private String name = "";

   public String getName() 
   {
      return name;
   }

   public String getMessage() 
   {
      if (name == "") 
      {
         return "Hello 040420222012!";
      }
      else 
      {
         return "Hello " + name + "!";
      }
   }

   public void setName(String name) 
   {
      this.name = name;
   }
		
}
