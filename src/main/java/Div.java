
public class Div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int sum=0;
		
		for(int i=1;i<n;i++) {
			//System.out.println(n%i);
			if(n%i==0)
				//System.out.println(i);
			
			sum=sum+i;	
			
			
		}
		System.out.println(sum);
		if(n==sum)
			System.out.println("divisilbe");
		else
			System.out.println("not divisible");

	}
	}


