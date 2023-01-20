import java.util.Scanner;
public class Assesment_5 {

	public static void main(String[] args) {
		 

					String s = "Hello world please";
					char[] ref = "Help".toCharArray();
					
					for(char e: ref)
					{
					String value = s.replaceAll(" ", "");
					
					int count= value.length();
					
					String removeCount = value.replaceAll(Character.toString(e), "");
					
					int current = removeCount.length();
					
					System.out.print(e + ":" + (count-current));
					
					if(e !=  'p')
					{
					System.out.print(",");
					}
					}
				
				
			
			
			}
		


	}


