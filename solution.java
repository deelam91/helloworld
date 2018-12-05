import java.io.*;
import java.util.*;
class solution
{
	public static void main(String[] args)
	{
		try
		{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String R[]=new String[10];
		String T[]=new String[10];
		int count =0;
		int cr=0;
		double testscore;
		long tests;
		int uniquegroup=0;
		int group[]=new int[25];
		
		R[1]="BAD";
		T[1]="TEST1";
		R[2]="OK";
		T[2]="TEST2";
		R[3]="WELL";
		T[3]="TEST3A";
		R[4]="GOOD";
		T[4]="TEST2A";
		R[5]="OK";
		T[5]="TEST3";
		int Tlen=T.length;
		int Rlen=R.length;
		for(int i=0;i<Rlen;i++)
		{
			if(R[i]=="OK")
			{
				count=count+1;
			}
				
		}
		for(int i=0;i<Tlen;i++)
		{
			for(int j=0;j<T[i].length();j++)
			{
				if(Character.isDigit(T[i].charAt(j)))
				{
					group[cr]=(int)T[i].charAt(j);
					cr++;
				}
			}
		}
		for(int i=0;i<group.length;i++)
		{
			if (i != group.length - 1) 
			{
       			 	if (group[i] != group[i+1]) 
				{
           			 uniquegroup++;
        			}
        			else {
           			 // Nothing! 
        			}
    			}
			 else 
			{
        			uniquegroup++;
    			}				
		}
		System.out.println("Total number of groups : " +uniquegroup);
		testscore= ((double)count*100)/(double)uniquegroup;
		tests=(long)testscore;
		System.out.println("testscore" +tests);
		}
		catch(Exception e)
		{
			System.out.println(e);
		} 
	}
}