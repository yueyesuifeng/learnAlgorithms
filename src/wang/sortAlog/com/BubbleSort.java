/**
 * 作者：匠心
 * 冒泡排序：一种简单地排序算法，重复比较相邻元素，顺序不对时，将位置蒋欢(小的在前，大的在后)
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 */
package wang.sortAlog.com;

public class BubbleSort {
	public static int[] bubbleSort(int[] A,int n){
		int temp=0;
		for (int i = 1; i < n; i++) {////做n-1次比较交换操作，每次都能找到最大的元素，将其放在上一次最大元素的前面
			for (int j = 0; j < n-i; j++) {//n-i到n的元素位置都已经排好了
				if(A[j]>A[j+1]){//前面的元素比后面的元素大，就交换位置
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