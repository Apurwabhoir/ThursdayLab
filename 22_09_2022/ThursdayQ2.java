/*Q2: Write a program to accept choice from user and perform the operation:
1: factorial
2:sum of digit
3:Armstrong number or not
4:Fibonacci series
5:Prime no or Not
*/
import java.util.*;

public class ThursdayQ2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);			//class variable
		char ans;
		int num,fact=1,n,r,og,temp=0,fdg=0,sdg=0,res=1;		//initialize the variable
		do 
		{
			System.out.println("1.factorial \n2.sum of digit \n3.Armstrong number or not \n4.Fibonacci series \n5.Prime no or Not");
			System.out.println("enter choice:");
			int c;
			c = sc.nextInt(); 
			
			switch(c)
			{
			case 1:
			    System.out.println("... factorial ...");
				 
				System.out.println("Enter The Number ");				//take number from user
				num = sc.nextInt();
				while(num>=1)
				{
				fact=fact*num;						//fact variable initialize as 1 
				num--;
				}
				System.out.println("The factorial is ="+fact);
				break;
			
			case 2:												
				System.out.println("... Sum of digit ...");
				int sum=0,d;
				System.out.println("Enter The Number ");
				num = sc.nextInt();
			
				while(num!=0)			//for stop this loop when number is not equal != to 0 
				{
					d=num%10;   
					sum=sum+d;
					num=num/10;
				}
				System.out.println("sum of digit " +sum);
				break;
				
			
			case 3:
				System.out.println("... Armstrong number or not ...");
				System.out.println("Enter The Number ");
				num = sc.nextInt();
				og=num;													//number is store in og variable
				do
				{
					r=num%10;
					temp= temp+(r*r*r);
					num=num/10;
				}
				while(num>0);
				if(temp==og)										//checking temp is equal to og 
				{
					System.out.println("It is an armstrong no\t" +temp);        //if yes then no. armstrong
				}
				else
				{
					System.out.println("It is not an armstrong no" +temp);		//if not then no. not armstrong 
				}
				break;
			
			case 4:
				System.out.println("... Fibonacci series ...");
				System.out.println("Enter The Number ");
				num = sc.nextInt();
				for(int i = 1; i <= num; i++)							
		        {
		            fdg = sdg;								//fdg is initialize as 0,sdg as 0, res as 1
		            sdg = res;
		            res = fdg + sdg;
		            System.out.print(fdg+" \t\n ");         // printing fibonacci series
		        }

				break;
			
			case 5:
				System.out.println("... Prime no or Not ...");
				System.out.println("Enter The Number ");
				num = sc.nextInt(); 
				int i,count=0;
				for(i=2;i<num;i++)			  	//prime number is no divided by itself and 1 so start from 2
				{
					if(num%i==0)
					{
						count++;
						break;
					}
				}
				if(count==0)                       //check count is equal to 0 
			           System.out.println(+num+" is a Prime Number.");                                                               
			        else
			           System.out.println(+num+" is not a Prime Number."); 
				break;
			
			}
				
			 
			System.out.println("Do you want to continue y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
	}

}
