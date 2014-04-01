import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * imports the dictionary into the hashmap mp if hashmap is selected.
 */
public class importDictionary {

	public static void imp(){
		try{
		BufferedReader br = new BufferedReader(new FileReader("./src/dictfiles/wordlist.txt"));
		String s=new String();
		System.out.println("Creating Hashmap");
		while((s=br.readLine())!=null)
			WordsFromArrays.mp.put(s,s);
		System.out.println("HashingCompleted");
		br.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
