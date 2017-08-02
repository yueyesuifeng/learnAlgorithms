/**
 * 作者:匠心
 * 选择排序：每次从未排序的剩余元素中找到最小的元素放在未排序剩余元素的前面
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 逻辑：数组被分成两部分，未排序的和排好序的（开始的时候，整个数组被认为是未排序的）
 * 步骤：
 * 1. 在剩余数组元素(未排序的数组)中找到最小的元素
 * 2. 将这个最小元素放在未排序的数组开始的位置
 * 3. 重复以上步骤，只到还剩一个元素
 */
package wang.sortAlog.com;

public class SelectionSort {
	void sort(int arr[]){
		int n=arr.length;
		for(int i=0;i<n-1;i++){//做n-1次找到最小元素的操作
			int min_idx=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min_idx]){//比当前的最小元素小，就把这个元素当成当前最小元素
					min_idx=j;
				}
			int temp=arr[min_idx];//将这个最小元素放在未排序的数组开始的位置
			arr[min_idx]=arr[i];
			arr[i]=temp;
			}
		}
	}
	void printArray(int arr[]){
		int n=arr.length;
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		SelectionSort ob=new SelectionSort();
		int arr[]={64,25,12,22,11};
		ob.sort(arr);
		System.out.println("排序好的数组如下：");
		ob.printArray(arr);
	}
}
