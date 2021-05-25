import java.util.Scanner;

public class PrimeNumber {

	public void primeNumber(){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		
		for (int i = 2; i<=10;i++){
			
			
			
			if (num%i==0 && num!=i){
				
				System.out.println(num + "is not a prime number");
				
				break;
			}
			
			else if (i==10){
					
				
				System.out.println(num + "is a prime number");
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
