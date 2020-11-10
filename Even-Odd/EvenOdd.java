import java.util.Scanner;
class EvenOdd
{
	public static void main(String[]args) {
	    System.out.println("This Programm will print all the numbers" +
	    "\nto the number you insert and it will show you if its odd or even");
		Scanner scan=new Scanner(System.in);
		
		System.out.println("\nEnter an integer");
			int a=scan.nextInt();
		System.out.println("The numbers are");	 
			
			for (int i=0; i<=a; i++) {
			    System.out.println(i + ", ");
			 }
	
			
if (a%2==0) {
			System.out.println("Your number is even");
			}
else if(a%2!=0) {
			System.out.println("Your number is odd");
			}
}
}
