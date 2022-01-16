package datastructure;

public class Arrayrotation {

	public static void main(String[] args) {
		Arrayrotation obj=new Arrayrotation();
		int arr[]= {1,2,4,5,7};
		int temp[]= obj.rotatearray(arr,3);
		obj.printarray(temp);

  public void printarray(int num[]) {
			 for(int i=0;i<num.length;i++)
			 {
				 System.out.print(num[i]+"");
			 }
}
  
public int[] rotatearray(int num[],int k)
{
	int n=num.length;
	int temp[] =new int[n];
	for(i=0;i<n;i++)
	{
		temp[(i+k)%n]=num[i];
	}
	return temp;
}  

	}

}
