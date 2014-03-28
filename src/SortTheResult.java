import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortTheResult {
	public static void sortres(){
		try{
			BufferedReader br = new BufferedReader(new FileReader("./src/dictfiles/searchoutput.txt"));
			String sa=new String();
			List<String> a = new ArrayList<String>();
		
		
			while((sa=br.readLine())!=null)
				a.add(sa);
			Collections.sort(a);
			BufferedWriter bw=new BufferedWriter(new FileWriter("./src/dictfiles/searchoutput.txt"));
			for(int i=0;i<a.size();i++)
				bw.write(a.get(i)+"\n");
			bw.close();br.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
