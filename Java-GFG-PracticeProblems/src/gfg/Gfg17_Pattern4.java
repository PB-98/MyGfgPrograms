package gfg;

public class Gfg17_Pattern4 {

	/*col r
	 * 1  1    *
	 * 2  2    * *
	 * 3  3    * * *
	 * 4  4    * * * *
	 * 5  5    * * * * *
	 * 4  6    * * * *
	 * 3  7    * * *
	 * 2  8    * *
	 * 1  9    *
	 *now, we have to first see the number of rows
	 *after that, create a relation between rows and column 
	 *here n=5, if n<=5, column=rows , else, column=2*n-row 
	 *n is the highest number of columns in a row
	 */	
    		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=5;
         for(int row=1;row<=2*n-1;row++) {
          	if(row<=5) {
          		for(int col=1;col<=row;col++) {
          			System.out.print("*");
          		}
          		System.out.println();
          	}
          	else if(row>5){
          		for(int col=1;col<=2*n-row;col++) {
          			System.out.print("*");
          		}
          		System.out.println();
          	}
         }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
