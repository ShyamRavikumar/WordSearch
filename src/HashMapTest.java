import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 * Compares the words in the array list with the dictionary if hashsearch is chosen, and if the word exists, the word is written
 * into the file searchoutput.txt
 */
public class HashMapTest {
	static public void hashsearch(String[] list) throws Exception{
		
		    
			BufferedWriter bw = new BufferedWriter(new FileWriter("./src/dictfiles/searchoutput.txt",true));
			String s=new String();
			for(int j=0;j<list.length;j++){
				if((s=WordsFromArrays.mp.get(list[j]))!=null)
					bw.append(s.toUpperCase()+"\n");
			}
			bw.close();
	}
}
