package week1.dailychallenge1;

public class LastWord {

	public static void main(String[] args) {
		String name = "luffy is still joyboy";
		String[] str = name.split(" ");
		int length = str.length;
		int i=length-1;
		
System.out.println ("The last word is " + str[i]);
String last = str[i];
int count = last.length();
System.out.println("The length of the last word is " + count);

	}

}
