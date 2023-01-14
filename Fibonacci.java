package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=1,c=0;
System.out.println(a+" "+ b);
for (int i=2;i<=12;i++)
{
	c = a + b;
	System.out.println(""+ c);
	a=b;
	b=c;
}
	}

}
