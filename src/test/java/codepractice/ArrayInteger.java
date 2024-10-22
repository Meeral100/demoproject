package codepractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length= sc.nextInt();
		System.out.println("Enter array of integers");
		List<Integer> numArray = new ArrayList<Integer>();
		
		for (int i=0;i<length;i++)
		{
			System.out.println("Number "+(i+1));
			numArray.add(sc.nextInt());
			
		}
		System.out.println("Array input given by you is "+numArray);

		
		System.out.println("Enter the threshold below which all the numbers will be erased");
		List<Integer> newArray = new ArrayList<Integer>();
		int thresh = sc.nextInt();
		sc.close();
		for(int v:numArray)
		{
			if(v<thresh)
			{
				continue;
			}
			else
			{
				newArray.add(v);
			}
		}
		System.out.println("Updated array is "+newArray);
		

	}

}
