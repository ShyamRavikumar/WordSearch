import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class BinarySearchTest {
	static public void binsearch(String[] list) throws Exception{
		
	//Remove null elements from input list	.NOT REQUIRED ATM
		/*
		List<String> listtemp = new ArrayList<String>();

	    for(String s : list) {
	       if(s != null && s.length() > 0) {
	          listtemp.add(s);
	       }
	    }

	    list = listtemp.toArray(new String[listtemp.size()]);
	  */  
	//Create File Handlers and variables
	    String[] a ={"born","zoom","baby"};
	    BufferedWriter bw = new BufferedWriter(new FileWriter("./src/dictfiles/searchoutput.txt",true));
		int j=0,index;
	    BufferedReader br = new BufferedReader(new FileReader("./src/dictfiles/wordlist.txt"));
		List<String> s1=new ArrayList<>();
		String s;
		while((s=br.readLine())!=null)
			s1.add(s);
		
		for(j=0;j<list.length;j++){
			
			
			index=Collections.binarySearch(s1,list[j]);

			index=(index>=0)?index:-1;
				if(index!=-1){
					
					bw.append(s1.get(index)+"\n");
				}
			}
		
		bw.close();
		br.close();
	}
	/**
	 * @deprecated Test Function not in use since found working
	 */
	/*
	public static void main(String[] args){
		String[] a ={"born","baby","boom"};
		
		try{binsearch(a);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	*/
}
