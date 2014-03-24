import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class Timepass {
	public static void main(String args[]) throws Exception
	   {
	      BufferedReader br = new BufferedReader(new FileReader("./src/backupdict.txt"));
	      BufferedWriter bw = new BufferedWriter(new FileWriter("./src/timepass.txt"));
	      String s = new String();
	      while((s=br.readLine())!=null){
	    	  if(s.endsWith("t") && s.startsWith("t"))
	    		  bw.write(s+"\n");
	    	  
	      }
	      br.close();
	      bw.close();
	   }

}
