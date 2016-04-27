
public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int oddLimit = 99;
		int evenLimit = 100;
		
		System.out.println("Odd numbers betwwen 0 and 100");
		for (int i=1; i <= oddLimit; i++){
			if (i%2 !=0){
				System.out.println(i + " ");
			}
		}
		
		System.out.println("Even numbers between 0 and 100");
		int j = 2;
		while (j  <= evenLimit){
			System.out.println(j + " ");
			j+=2;
		}
	
	
		
		
		
		
		
	/*	  int n = 0;
		for(int i=0;i<n;i++)
		  {
		      for(int a=0;a<(n-(i+1));a++)
		      {
		          System.out.print(" ");
		      }
		      System.out.print("*");
		      for(int b=0; b<(i*2);b++)
		      {
		          System.out.print("-");
		      }
		      System.out.print("*");
		      System.out.println();
	*/
		
		int a =1;
		while (a<=3){
			int b=0;
			while (b<(3-a)){
				System.out.print(" ");
				b++;
			}
			int c = 1;
			while (c<=a){
				System.out.print("*");
				c++;
			}
			int d = 1;
			while (d<a){
				System.out.print("*");
				d++;
			}
			System.out.println();
				a++;
		}
		int z = 2;
		while (z>=1){
			int y=0;
			while (y<(3-z)){
				System.out.print(" ");
				y++;
			}
			int x =1;
			while (x <=z){
				System.out.print("*");
				x++;
			}
			int w = 1;
			while (w<z){
				System.out.print("*");
				w++;
			}
			System.out.println();
			z--;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	}
}
