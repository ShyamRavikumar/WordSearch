import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Collections;


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
	    
	    BufferedWriter bw = new BufferedWriter(new FileWriter("./src/dictfiles/searchoutput.txt",true));
		int j=0,index;
	    
		
		for(j=0;j<list.length;j++){
			
			
			index=Collections.binarySearch(WordsFromArrays.s1,list[j]);

			index=(index>=0)?index:-1;
				if(index!=-1){
					
					bw.append(WordsFromArrays.s1.get(index).toUpperCase()+"\n");
				}
			}
		
		bw.close();
		
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
