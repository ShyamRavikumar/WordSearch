import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/*
 * The main file which calls all other functions..
 * Asks the user if he wants to use Binary search, or a HashMap search by calling DetermineSearchAlgorithm.java
 * Calls importDictionary and DetermineSearchAlgorithm
 * 
 */
public class WordsFromArrays {
	public static Map<String,String> mp =new HashMap<>();
	static int searchchoice;
	public static List<String> s1=new ArrayList<>();
	public static int count=0;
	static int siz;
	public static long endtime,starttime;
	
	
	/**
	 * @param list Char Array to be used as the input matrix
	 * Creates all possible word choices in each direction for each letter in array.
	 * Uses brute force atm
	 */
	static void combinationcreator(char[][] list){
		int i=0,j=0,i1,k;
		String[] b;
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
					b =new String[a.size()];
					
				for(int l=0;l<a.size();l++){
						b[l]=a.get(l).toString();
						
				}
					try
					{
						if(searchchoice==1)
							BinarySearchTest.binsearch(b);
						
						else
							HashMapTest.hashsearch(b);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				k++;
				}
			}
		}
		System.out.println("Program Execution Finished");
	}
	public static void main(String[] args) throws Exception{
	//Determine Search Algorithm
		int cho=1;
		
//Get the input matrix
		BufferedReader br = new BufferedReader(new FileReader("./src/dictfiles/Example2.txt"));
		siz=br.readLine().toString().length();
		br.close();
		br=new BufferedReader(new FileReader("./src/dictfiles/Example2.txt"));
		char[][] list=new char[siz][siz];
		String s = new String();
		int i=0;
		while((s=br.readLine())!=null)
			list[i++]=s.toCharArray();
		br.close();
		while(cho==1){
			
			count++;
			DetermineSearchAlgorithm.determine();
			
			
	//	Call combinationcreator() and pass the matrix input to create all combinations
			combinationcreator(list);
	//	SORT THE RESULT AND PRINT THE STORE THE RESULT
			SortTheResult.sortres();
			endtime = System.currentTimeMillis();
			System.out.println("Time taken to execute : " + (endtime-starttime)+" ms");
			System.out.println("Do you want to execute again?? (1/0) : ");
			cho = new Scanner(System.in).nextInt();
		}
	}	

}
