package week1.dailychallenge1;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Shiny";
String lower = name.toLowerCase();
char [] charArray = lower.toCharArray();
int length = name.length();
for (int i=1;i<=length-1;i=i+2)
{
		charArray[i]=(Character.toUpperCase(charArray[i]));
}
{System.out.println(new String(charArray));
	}
}
	}
