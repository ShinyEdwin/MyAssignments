package DailyChallenge;

public class Majority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {4,5,4,4,8,8,8,8};
		int i;
		int j;
		int length=nums.length;
	int n =length/2;
   int count =0;
   int majority=0;
		for (i=0;i<length-1;i++)
		{
			for (j=1;j<length-1;j++)
			{					
		if	 (nums[i]==nums[j]);
		
			count=count+1;		
		
		if (count > n)
		{
			System.out.println(nums[i]);
	}
			}
		}
	}
}
	
		


		
	