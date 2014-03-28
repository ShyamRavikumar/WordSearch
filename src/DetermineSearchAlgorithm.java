import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class DetermineSearchAlgorithm {
	public static void determine(){
		System.out.print("1.Use Binary Search\n2.Use HashMap\nEnter Choice : ");
		if(new Scanner(System.in).nextInt() == 1){
			WordsFromArrays.searchchoice=1;
			System.out.println("Using Binary Search...");
			try{
			BufferedReader br = new BufferedReader(new FileReader("./src/dictfiles/wordlist.txt"));
			
			String s;
			while((s=br.readLine())!=null)
				WordsFromArrays.s1.add(s);
			br.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		else{
			
			importDictionary.imp();
			System.out.println("Using HashMap for search...");
		}
	}
}
