package test;

public class VowelsCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str = "Clean World Green World";
		
		str = str.toLowerCase();
		
		//char[] array = {'a' , 'p' ,'e' , 'x'};
		
		int count = 0;
		
		for(int index=0;index<str.length();index++) {
			
			char ch = str.charAt(index);
			
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
			
		}
		
		System.out.println("The Vowel count is " + count);

	}

}
