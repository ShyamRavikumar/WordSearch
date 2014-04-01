import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Collections;

/*
 * Search the files in the list list with the dictionary using binary search algorithm.
 */
public class BinarySearchTest {
	static public void binsearch(String[] list) throws Exception{
	
	
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
	
}
