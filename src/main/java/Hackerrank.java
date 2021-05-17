
public class Hackerrank {
	
	public void test(String s) {
		
		
		if(s.length()>0)
		
		{
		long count=0;
		String n = null;
		for(int i=0;i<s.length();i++) {
			
			for(int j=0;j<s.length();j++)
			{
				if(i==j)
					continue;
				
				if(s.charAt(i)==s.charAt(j))
				{
					//System.out.println("equal "+s.charAt(i));
				count++;
			 s=s.replace(s.charAt(i), ' ');
				}
			}
			
		}
		System.out.println(count);
		test(s);
		
	}}
	

	
	

	public static void main(String[] args) {
		
		Hackerrank r = new Hackerrank();
		r.test("acbcc");

		// TODO Auto-generated method stub
	}	

}
