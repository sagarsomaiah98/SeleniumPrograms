import java.util.HashSet;
import java.util.Set;

public class Hacker2 {
	
	public void test1(int[] price) {
		
		long val=0;
		int r=2;
		int p=5;
		int pay = 0;
		Set<Integer> s = new HashSet<Integer>();

        for(int i=0;i<price.length;i++){
           s.add(price[i]) ;

        }
        int d= s.size();
        
        
        int item=price.length;
        
        System.out.println(d+ " set size");
        System.out.println( "array" + item);
        int distinct=item-d;
		System.out.println(distinct);
		if(distinct==1)
			pay=p;
		else if(distinct>0)
			
		 pay= (distinct-r)*p;
		
		System.out.println("distinct -- "+distinct);
		System.out.println(" pay -- "+ pay);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hacker2 h = new Hacker2();
		
		int[] p= {1,2,3,1};
		h.test1(p);

	}

}
