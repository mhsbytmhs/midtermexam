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
         return "Hello 040420222037!";
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
