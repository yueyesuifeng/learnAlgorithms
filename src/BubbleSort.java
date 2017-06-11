/**
 * 对于一个int数组，请编写一个冒泡排序算法，对数组元素排序
 * 给定一个int数组A及数组大小n，请返回排序后的数组
 * */
public class BubbleSort {
	public static int[] bubbleSort(int[] A,int n){
		int temp=0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				if(A[j]>A[j+1]){
					temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
		}
		return A;
	}
	public static void main(String[] args) {
		int [] B={1,2,3,5,2,3,10,9,2,6,12,67,34};
		int len=B.length;
		B=bubbleSort(B,len);
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+" ");
		}
	}

}
