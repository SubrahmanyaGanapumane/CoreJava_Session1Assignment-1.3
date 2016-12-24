package session1;

public class Assignment1_3 {
	
	public static void main(String arrgs[])
	{
		int a=10, b=20;
		char ch1='S', ch2='G';
		new Assignment1_3().swap(a,b);
		new Assignment1_3().swap(ch1, ch2);
		
	}

	private void swap(int x,int y) {
		System.out.println("Before Swap two elements are: "+x+ " "+y);
		x=x^y;
	    y=x^y;
	    x=x^y;
	    System.out.println("After the Swapping: "+x+" "+y);
	}
	private void swap(char x,char y) {
		System.out.println("Before Swap two elements are: "+x+ " "+y);
		x=(char) (x^y);
	    y=(char) (x^y);
	    x=(char) (x^y);
	    System.out.println("After the Swapping: "+x+" "+y);
	}
}