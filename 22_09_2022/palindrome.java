//Q1: Write a program to accept a number from the user and check if a given number is palindrome or not.
import java.util.Scanner;

public class palindrome 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);            //class variable
		System.out.println("Enter a Number");          
		int num = sc.nextInt();                        
		int rev= 0, a ,temp = num;						//variable temp is use to store the value form user
														//variable rev is initialize with 0 
		
		while(num>0)									
		{
			a = num % 10;
			rev =(rev*10)+a;
			num = num/10;
		}
		if(temp==rev)								//if else is use to check the no. is palindrome or not
		{
			System.out.println("Number is Palindrome ");
		}
		else
		{
			System.out.println("Number is not Palindrome ");
		}
			
	}

}
