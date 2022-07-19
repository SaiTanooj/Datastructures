package Striversde;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,4,5};
		int slow=arr[0];
		int fast=arr[0];
		do {
			slow=arr[slow];
			fast=arr[arr[fast]];
		}while(fast!=slow);
		fast=arr[0];
		while(fast!=slow) {
			slow=arr[slow];
			fast=arr[fast];
		}
		System.out.println(slow);

	}

}
