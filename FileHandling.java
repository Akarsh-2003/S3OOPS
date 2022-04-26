import java.io.*;

class Main
{
  public static void main(String[] args)
  {
   String[] names = {"Akarsh", "Angel", "Agnal"};
   
   try
   {
      BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
      
      for (String name : names)
      {
        bw.write("\n" + name);
      }
      
      bw.close();
   }

   catch (IOException e) 
   {
      e.printStackTrace();
   }
    
   try
   {
      BufferedReader br = new BufferedReader(new FileReader("output.txt"));
      
      String line;
      
      while((line = br.readLine()) != null)
      {
        System.out.println(line);
      }
      
      br.close();
   }
   
   catch (IOException e)
   {
      e.printStackTrace();
   }
  

  }
}
