import java.util.Scanner;

public class FindSubSequence {

	public static String[] subSquence(String input)
	{
		if(input.length()==0)
		{
			String[] outPut=new String[1];
			outPut[0]="";
			return outPut;
		}
		
		String[] smallOutput=subSquence(input.substring(1));
		String outPut[]=new String[smallOutput.length*2];
		
		for(int i=0;i<smallOutput.length;i++)
		{
			outPut[i]=smallOutput[i];
		}
		for(int i=0;i<smallOutput.length;i++)
		{
			outPut[smallOutput.length+i]=input.charAt(0)+smallOutput[i];
		}
		
		return outPut;
	}
	
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String input=sc.nextLine();
		sc.close();
		String[] result=subSquence(input);
		for(String str:result)
		{
			System.out.println(str);
		}
	}
}
