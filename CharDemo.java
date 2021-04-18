public class CharDemo {
	public static void main(String[] args) {
		CharDemo cd = new CharDemo();
		cd.digitTest();				
	}
	
	public void digitTest() {
		String test = "ABCabc0123456789';#!";
		for(int k=0; k<test.length(); k++) {
			char ch = test.charAt(k);
			if(Character.isDigit(ch)) {
			System.out.println(ch+" is a digit");				
			}
			if(Character.isAlphabetic(ch)) {
				System.out.println(ch+" is alphabetic");
			}
		}
	}

}



