import java.util.Scanner;
public class Frog 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int metersReached = 0;
		int metersBack = 0;
		int f = 0;
		   
		   int d;
		   System.out.println("enter the depth of well");
		   d = scan.nextInt();
		      
		      int a;
		      System.out.println("Enter the number of meters the frog jumps:");
		      a = scan.nextInt();
		   
		        int b ;
		        System.out.println("Enter the number of meters the frog slips:");
		        b = scan.nextInt();
		        if (b>=a){
	        		System.out.println("The jump size must be bigger than the slip. The frog is stuck!");
	        	}
		        else
		        {
		        System.out.println("The frog starts here");
		       for(int i = a;i<=d;i+=a){
			   for(int j = 0;j<=b;j+=b){
				   f++;
				   
				    metersReached=i+j;
				    metersBack=(i+j)-b;
				    
				    System.out.println("jump "+f+" and it has reached "+ metersReached+" meters");
				    if(metersReached<d){
				    System.out.println("It slips and is back at "+metersBack+" meters");}   
				    }
			   if(  metersReached==d)
			   {
			   System.out.println("The frog is out!");}
		  
		       }
		       
		        }	
	}
}
