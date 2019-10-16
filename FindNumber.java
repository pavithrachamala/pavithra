package programs;

import java.util.*;

public class FindNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[]{10,20,30};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println("true");
			}
		}
	}

}
