package practice;

public class descendingOrder {

	public static void main(String[] args) {
		int a[]={1,2,3,45,6,3,6,7,74,};

		for(int i=0; i<a.length; i++){
		for (int j=i+1; j<a.length; j++){

		if(a[i]<a[j]){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
		}
		for(int i=0; i<a.length; i++){
		System.out.println(a[i]);

		}
		}
}
