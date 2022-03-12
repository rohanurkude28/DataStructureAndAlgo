# Data structures and Algorithms

![](src/main/resources/SortingAlgorithmComplexity.png)

## Arrays
- Contiguous Block of memory
- Each array is allocated same memory (in case of objects references are stored)

## _Big O of an Array_

![](src/main/resources/ArrayBigO.png)

## Sorting Algorithms

## _Stable vs Unstable_

If there are duplicates in the array and the relative order of equal elements is preserved then algo is stable

## _Bubble Sort - O(n^2)_
- iterate each element over the whole array while swapping adjacent index if greater than current value, we move from right to left
- lastUnsortedIndex will make it more efficient but worst case is O(n^2)
- Stable Algorithm

## _Selection Sort - O(n^2)_
- lastUnsortedIndex is last index of unsorted partition, we move from right to left
- assume largest element is at 0th location (largeLoc) and then compare it across the array starting from index 1 while changing largeLoc if we find a larger element
- at end of each iteration swap the largeLoc with lastUnsortedIndex
- does less swapping compared to bubble sort
- Unstable Algorithm

## _Insertion Sort - O(n^2)_
- firstUnsortedIndex is 1, we traverse from left to right, we insert the number to the lowest possible location and replace the existing location with number stored in start
- works great with already sorted list, linear time
- Stable Algorithm

## _Shell Sort - O(n^2)_
- Basically in Insertion Sort we have a gap value of 1 (we compare with adjacent data), whereas in Shell we increase the gap
- Knuth Algo says gap should be - (3^k-1)/2
- We do this to minimize the no of insertions
- Unstable Algorithm

## _Merge Sort - O(nlogn)_
- Divide and Conquer Algorithm - recursive
- Splitting and merge.
- Split till 1 element array and merge them back (while sorting) into original size, keep on doing till sorting is complete
- Stable Algorithm

## _Quick Sort - O(nlogn)_
- Divide and Conquer Algorithm - recursive
- Uses Pivot to partition the array
- Put all element smaller than the pivot to left, larger than pivot to the right, pivot is in correct sortedPosition
- Worst is O(n^2)
- Unstable Algorithm

## _Counting Sort - O(n)_
- Assumes range of number present
- Doesn't compare, works only with positive numbers , Will have to create an array with maxValue present better for smaller range
- Creates a tempArray and increments count at index for a particular value in input. for eg: val 10, increment count at index 10
- Unstable Algorithm