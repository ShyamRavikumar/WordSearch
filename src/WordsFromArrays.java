import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsFromArrays {
	
	static char[][] list=new char[10][10];
	/**
	 * @param list Char Array to be worked on
	 * Creates all possible word choices in each direction for each letter in array.
	 * Uses brute force atm
	 */
	static void combinationcreator(){
		int i=0,j=0,i1,k;
		
		List<String> a=new ArrayList<String>();
		char[] c = new char[10];
		for(i=0;i<=9;i++){
			for(j=1;j<=9;j++){
				i1=i;k=4;
				while(k<=10){
					
					a.clear();
				//	Horizontal right
					if(j+k<=10)
						a.add(String.valueOf(list[i],j,k).trim());
			
				//	BottomRight
		
						if(i+k<=10 && j+k<=10){
						int t=0;int j1=j;
						for(i1=i;i1<i+k;i1++)
							c[t++]=list[i1][j1++];
						
						a.add(String.valueOf(c).trim());
					}
						
			//	Bottom
					if(i+k<=10){
						int t=0;c= new char[10];
						for(i1=i;i1<i+k;i1++){
							c[t++]=list[i1][j];
						}
						a.add(String.valueOf(c).trim());
					}
				//	BottomLeft
					if((i+k<=10) && (j-k+1>=0)){
						int j1=j;
						int t=0;c= new char[10];
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
						int t=0;c= new char[10];int j1=j;
						for(i1=i;i1>=i-k+1;i1--)
							c[t++]=list[i1][j1--];
						a.add(String.valueOf(c).trim());
					}
				//	Top
					if(i-k+1>=0){
						int t=0;c= new char[10];
						for(i1=i;i1>=i-k+1;i1--)
							c[t++]=list[i1][j];
						a.add(String.valueOf(c).trim());
						
					}
			//	TopRight
					
					if((i-k+1>=0)&&(j+k<=10))
					{
						int j1=j;
						int t=0;c= new char[10];
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
		BufferedReader br = new BufferedReader(new FileReader("./src/dictfiles/Example.txt"));
		
		String s = new String();
		int i=0;
		while((s=br.readLine())!=null){
			list[i++]=s.toCharArray();
			
		}
		combinationcreator();
		//Check
		/*
		for(i=0;i<10;i++){
			System.out.println(Arrays.toString(list[i]).replace(" ", "-"));
			
		}*/
		br.close();
	}

}
