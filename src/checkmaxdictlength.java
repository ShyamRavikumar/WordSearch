import java.io.BufferedReader;
import java.io.FileReader;
/**
 * @deprecated Not in use since the dictionary has been implemented.Exists only for backup.
 */

public class checkmaxdictlength {

	/**
	 * @deprecated Not in use since the dictionary has been implemented.Exists only for backup.
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("./src/dictfiles/backupdict.txt"));
		String s = new String();int i=0;
		while((s=br.readLine())!=null){
			if(s.length()>i)
				i=s.length();
		}
		System.out.println(i);
		br.close();
	}

}
