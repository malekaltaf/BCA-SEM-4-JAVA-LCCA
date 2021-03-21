class prog2_reversearray{
	public static void main(String []args){
		int array[]={1,2,3,4,5};
		int i,j,temp;
		System.out.println("Arrayy Elements: ");
		for(i=0;i<5;i++)
			System.out.print(array[i]+" ");
			j=array.length-1;
			i=0;
			while(i<j){
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j--;
			}
			System.out.println("\nArray Elements in reverse Order are: ");
			for(i=0;i<5;i++)
				System.out.print(array[i]+" ");
	}
}