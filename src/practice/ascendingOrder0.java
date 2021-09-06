package practice;

public class ascendingOrder0 {

	public static void main(String[] args) {
		int a[]={1,2,3,45,6,3,6,7,74,};

		for(int i=0; i<a.length; i++){
		for (int j=i+1; j<a.length; j++){

		if(a[i]>a[j]){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
		}
		for(int i=0; i<a.length; i++){
		System.out.println(a[i]);

		}
		System.out.println(a[1]);
		System.out.println(a[a.length-2]);
		}
}
