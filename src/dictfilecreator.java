import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @deprecated Not in use since the dictionary has been implemented.Exists only for backup.
 */




public class dictfilecreator {

	
	public static void main(String[] args) throws Exception {
		  BufferedReader br = new BufferedReader(new FileReader("./src/dictfiles/wordlist.txt"));
	      int t;
	      FileWriter aw;
	      char d;
	      
	      String s = new String();
	      while((s=br.readLine())!=null){
	    	  d=s.charAt(0);t=s.length();
	    	  if(t<=10){
	    		  //Commented to avoid mishaps
	    		  //aw = (new FileWriter("./src/dictionary/"+d+t+".txt",true));
	    		  //aw.write(s+"\n");
	    		  
	    		  //aw.close();
	    	  
	    	  }
	      }
	      
	      br.close();

	}

}
