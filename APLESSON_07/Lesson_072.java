import java.util.Scanner;
public class Lesson_072
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a sentence ");
		sentence = kb.nextLine();
		
		
		while(sentence.indexOf(" ") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + sentence.substring(sentence.indexOf(" ") +1);
				
		}
		
		
		System.out.println("without spaces..." + sentence);
	}
}