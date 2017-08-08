package wang.sortAlog.com;

public class SelectionSort1 {
	//我们的算法不允许产生任何实例
//	private void SeletionSort1(){}
	public static void sort(int[] arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			//寻找[i,n)区间里的最小值得索引
			int minIndex=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[minIndex]){
					minIndex=j;
				}
			}
			swap(arr,i,minIndex);
		}
	}
	private static void swap(int[] arr,int i,int j){
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	public static void main(String[] args) {
		int[] arr={10,9,8,17,6,5,54,3,2,1};
		SelectionSort1.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			System.out.println(' ');
		}
		System.out.println();
	}

}
