package Striversde;

public class RepeatedANdMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5,1};
		int n=5;
		int orgsum=(n*(n+1))/2;
		int sumarr=0;
		for(int i=0;i<arr.length;i++) {
			sumarr=sumarr+arr[i];
		}
	    int den=(orgsum-sumarr);
		int orgsumsq=((n)*(n+1)*((2*n)+1))/6;
		int sumsq=0;
		for(int i=0;i<arr.length;i++) {
			sumsq=sumsq+(arr[i]*arr[i]);
		}
		int num=(orgsumsq-sumsq);
		int x=(den+(num/den))/2;
		int y=((num/den)-den)/2;
		System.out.println(x+" "+y);

	}

}
