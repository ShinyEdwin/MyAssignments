package week1.day2;

public class ReverString {

	public static void main(String[] args) {
		String name="TestLeaf";
		char[] charArray=name.toCharArray();
		int length = charArray.length;
		for (int i=length-1;i>=0;i--)
		{
			System.out.println(charArray[i]+",");
		}

	}

}
