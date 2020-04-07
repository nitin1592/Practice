	package practice;

import java.util.Arrays;
import java.util.List;

public class KthSmallestNumber {
	
	static class MaxHeap{
		private int[] heapArray;
		private int size;
		private int maxSize;
		public MaxHeap(int maxSize) {
			this.maxSize = maxSize;
			this.size = 0;
			heapArray = new int[this.maxSize];
		}
		private int parent(int i) {
			return (i-1)/2;
		}
		private int leftChild(int i) {
			return 2*i+1;
		}
		private int rightChild(int i) {
			return 2*i+2;
		}
		public int getMax() {
			return heapArray[0];
		}
		private void swap(int i, int j) {
			int temp = heapArray[i];
			heapArray[i] = heapArray[j];
			heapArray[j] = temp;
		}
		public void printHeap() {
			for(int i=0; i<size; i++) {
				System.out.print(heapArray[i] + " ");
			}
		}
		public void insetInMaxHeap(int x) {
			int current = size;
			heapArray[size] = x;
			size++;
			
			while(heapArray[current] > heapArray[parent(current)]) {
				swap(current, parent(current));
				current = parent(current);
			}
		}
		public void replaceMax(int value) {
			heapArray[0] = value;
			maxHeapify(0);
		}
		public void maxHeapify(int index) {
			int l = leftChild(index);
			int r = rightChild(index);
			int largest = index;
			
			if(l<size && heapArray[l]>heapArray[largest])
				largest = l;
			if(r<size && heapArray[r]>heapArray[largest])
				largest = r;
			if(largest != index) {
				swap(index, largest);
				maxHeapify(largest);
			}
		}
	}
	
	public int kthsmallest(final List<Integer> A, int B) {
		
		MaxHeap maxHeap = new MaxHeap(B);
		for(int i=0; i<B; i++) {
			maxHeap.insetInMaxHeap(A.get(i));
		}
		for(int i=B; i<A.size(); i++) {
			if(A.get(i) <= maxHeap.getMax()) {
				maxHeap.replaceMax(A.get(i));
			}
		}
		
		maxHeap.printHeap();
		
		return maxHeap.getMax();
    }

}
