package week1.dailychallenge1;

public class Palindrome {

	public static void main(String[] args) {
		String phrase = "juno";
		String str1 = phrase.replaceAll(" ", "");
		char[] charArray = str1.toCharArray();
        int length= str1.length();
        String str2="";
     boolean x=true;
       // System.out.println(length);
        for (int j=length-1;j>=0;j--)
        {
        	str2 = str2 + str1.charAt(j);
        }
        System.out.println(str2);
        if (str1.equals(str2))
        {
        	System.out.println(x);
        }
        else
        {System.out.println(!x);
	}
}
}

