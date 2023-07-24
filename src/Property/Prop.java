package Property;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Prop {

	public static void main(String[] args) throws IOException
	{
	  WebDriver driver=new ChromeDriver();
	  
      String filepath="/Prop/src/Property/Prop.java";
      Properties pr;
      String url;
      String br;
      pr=new Properties();
      FileInputStream fis=new FileInputStream(filepath);
      pr.load(fis);
      
      url=pr.getProperty("url");
      System.out.println();
       

	}

}
