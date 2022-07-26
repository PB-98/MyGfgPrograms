package gfg;

class Gfg5_Return
{
    public static void main(String args[])
    {
        
        System.out.println("Before the return.");
    
      for(int i=0;i<10;i++)
      {
          
      if (i>5)
            return;

        // Compiler will bypass every statement 
        // after return when i becomes greater than 5
        System.out.print(i+" ");
      }
   }
}
