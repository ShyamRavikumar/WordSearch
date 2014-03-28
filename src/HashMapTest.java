import java.io.BufferedWriter;
import java.io.FileWriter;


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
