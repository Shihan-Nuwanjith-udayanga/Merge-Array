import java.util.*;
public class Example {
	public static int[] mergeArrays(int[] x, int[] y){
		int[] z=new int[x.length+y.length];
		System.arraycopy(x,0,z,0,x.length);
		System.arraycopy(y,0,z,x.length,y.length);
		return z;
	}
	public static void main(String[] args) {
		int[] xr1={1,2,3,4,5};
		int[] xr2={10,20,30,40,50};
		System.out.println(Arrays.toString(xr1));
		System.out.println(Arrays.toString(xr2));
		
		int[] xr3=mergeArrays(xr1,xr2);
		System.out.println(Arrays.toString(xr3));
    }
}
