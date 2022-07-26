package gfg;

public class Gfg1_Precise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=100,y=200;
        double k= 2.123456;
        System.out.format("value of x is %d\n",x);
        float z= (float)Math.PI;
        System.out.println(z);
        System.out.format("Value of PI=%.2f\n",z);
        System.out.format("Value of PI=%5.2f\n",z);
        System.out.format("VaLUE OF PI=%05.2f\n",z);
        System.out.printf("x=%d,y=%d",x,y);
        
        
        System.out.printf(x+""+"%1.4d",k);
	}

}
