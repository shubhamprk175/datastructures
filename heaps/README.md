# Heap

## Introduction
A Heap is a special Tree-based data structure in which the tree is a complete binary tree. Generally, Heaps can be of two types:

1. **Max-Heap:** In a Max-Heap the key present at the root node must be greatest among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.
2. **Min-Heap:** In a Min-Heap the key present at the root node must be minimum among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.

![Heap](https://upload.wikimedia.org/wikipedia/commons/3/38/Max-Heap.svg)


## List of Programs
- ### [Max Heap](Heap.java)  
  The program [Heap.java](Heap.java) contains the implementation of Max Heap. The program [HeapImplementer.java](HeapImplementer.java) utilizes the datastructure and provide you create and heapify functionality, also giving you the functionality to print the Heap.

- ### [Find K Largest](FindKLargest.java)
  Given an input stream of n integers, find the k<sup>th</sup> largest element for each element in the stream.

- ### [HeapSort](HeapSort.java)
  Heapsort is a comparison-based sorting algorithm. Heapsort can be thought of as an improved selection sort: like selection sort, heapsort divides its input into a sorted and an unsorted region, and it iteratively shrinks the unsorted region by extracting the largest element from it and inserting it into the sorted region. Unlike selection sort, heapsort does not waste time with a linear-time scan of the unsorted region; rather, heap sort maintains the unsorted region in a heap data structure to more quickly find the largest element in each step.
  ![HeapSort](https://upload.wikimedia.org/wikipedia/commons/1/1b/Sorting_heapsort_anim.gif)
- ### [PriorityQueue](PriorityQueue.java)
  Priority Queue is an extension of queue with following properties.

  - Every item has a priority associated with it.
  - An element with high priority is dequeued before an element with low priority.
  - If two elements have the same priority, they are served according to their order in the queue.
- ### [PriorityHeap](PriorityHeap.java)
   Heaps are great for implementing a priority queue because of the largest and smallest element at the root of the tree for a max-heap and a min-heap respectively. We use a max-heap for a max-priority queue and a min-heap for a min-priority queue.
  
