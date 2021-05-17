
public class Reverse_String_Without_Changing_Special_Char {
	
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		String str= "@#ABc!!opj*u&ty%";
		 
		char[] ch = str.toCharArray();
		
		int l=0;
		int r=str.length()-1;
		
		while(l<r) {
			
			if(!Character.isAlphabetic(str.charAt(l)))
				l++;
			else if(!Character.isAlphabetic(str.charAt(r)))
				r--;
			
			else 
			{
				char temp=ch[l];
			     ch[l]=ch[r];
			     ch[r]=temp;
			     l++;
			     r--;
			}    
			     
			
			
			
		}
		System.out.println(ch);

	}

}
