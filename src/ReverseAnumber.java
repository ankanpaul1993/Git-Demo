
public class ReverseAnumber {
	
	public void reverseAnumber(){
		
		int a = 123;
		int reverse = 0;
		
		while (a!=0){
			
		int rem = a%10;
		
		reverse = reverse*10 + rem;
		
		//System.out.println(reverse);
		
		a = a/10;
		
		System.out.println(a);
		}
		
		System.out.println(reverse);
	}
	
}

