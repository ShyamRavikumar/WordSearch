import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordsFromArrays {
	static int siz;
	
	/**
	 * @param list Char Array to be worked on
	 * Creates all possible word choices in each direction for each letter in array.
	 * Uses brute force atm
	 */
	static void combinationcreator(char[][] list){
		int i=0,j=0,i1,k;
		
		List<String> a=new ArrayList<String>();
		char[] c = new char[siz];
		for(i=0;i<=siz-1;i++){
			for(j=1;j<=siz-1;j++){
				i1=i;k=4;
				while(k<=siz){
					
					a.clear();
				//	Horizontal right
					if(j+k<=siz)
						a.add(String.valueOf(list[i],j,k).trim());
			
				//	BottomRight
		
						if(i+k<=siz && j+k<=siz){
						int t=0;int j1=j;
						for(i1=i;i1<i+k;i1++)
							c[t++]=list[i1][j1++];
						
						a.add(String.valueOf(c).trim());
					}
						
			//	Bottom
					if(i+k<=siz){
						int t=0;c= new char[siz];
						for(i1=i;i1<i+k;i1++){
							c[t++]=list[i1][j];
						}
						a.add(String.valueOf(c).trim());
					}
				//	BottomLeft
					if((i+k<=siz) && (j-k+1>=0)){
						int j1=j;
						int t=0;c= new char[siz];
						for(i1=i;i1<i+k;i1++){
							c[t]=list[i1][j1--];t++;}
						a.add(String.valueOf(c).trim());
					}
				//	Horizontal left
					if(j-k+1>=0)
						a.add(new StringBuilder(String.valueOf(list[i], j-k+1, k)).reverse().toString());
						//a.add(String.valueOf(list[i], j-k+1, k));
				//	TopLeft
					if((i-k+1>=0)&&(j-k+1>=0)){
						int t=0;c= new char[siz];int j1=j;
						for(i1=i;i1>=i-k+1;i1--)
							c[t++]=list[i1][j1--];
						a.add(String.valueOf(c).trim());
					}
				//	Top
					if(i-k+1>=0){
						int t=0;c= new char[siz];
						for(i1=i;i1>=i-k+1;i1--)
							c[t++]=list[i1][j];
						a.add(String.valueOf(c).trim());
						
					}
			//	TopRight
					
					if((i-k+1>=0)&&(j+k<=siz))
					{
						int j1=j;
						int t=0;c= new char[siz];
						for(i1=i;i1>=i-k+1;i1--){
							c[t]=list[i1][j1++];t++;
						}
						a.add(String.valueOf(c).trim());
					}
		
					
					System.out.println(a.toString());
		
					
					
					String[] b =new String[a.size()];
					
				for(int l=0;l<a.size();l++){
						b[l]=a.get(l).toString();
						
				}
					
					
					
		//DONE
					//PASS THE STRING a TO THE CHECKER
					try{
						BinarySearchTest.binsearch(b);
					}
					catch(Exception e){
						e.printStackTrace();
					}
				k++;
				}
				
			}
		}
		System.out.println("Program Execution Finished");
	}
	public static void main(String[] args) throws Exception{
		// TODO Check each and every possible scenario for each letter
		BufferedReader br = new BufferedReader(new FileReader("./src/dictfiles/Example2.txt"));
		siz=br.readLine().toString().length();
		br.close();
		br=new BufferedReader(new FileReader("./src/dictfiles/Example2.txt"));
		char[][] list=new char[siz][siz];
		String s = new String();
		int i=0;
		while((s=br.readLine())!=null){
			
			list[i++]=s.toCharArray();
			
		}
		combinationcreator(list);
		//Check
		/*
		for(i=0;i<siz;i++){
			System.out.println(Arrays.toString(list[i]).replace(" ", "-"));
			
		}*/
		br.close();
		br = new BufferedReader(new FileReader("./src/dictfiles/searchoutput.txt"));
		List<String> a = new ArrayList<String>();
		
		i=0;
		while((s=br.readLine())!=null)
			a.add(s);
		Collections.sort(a);
		BufferedWriter bw=new BufferedWriter(new FileWriter("./src/dictfiles/searchoutput.txt"));
		for(i=0;i<a.size();i++)
			bw.write(a.get(i)+"\n");
		bw.close();br.close();
	}	

}
