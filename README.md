# Data-Structure-Algorithms-Notes
This repository will act as a study guide for data structures and algorithms.

# Sorting Algorithms
Various sorting algorithms will be covered in this section such as SELECTION sort, QUICK sort, MERGE sort, INSERTION sort, and numerous other sorting algorithms. Also, Java will be utilised as the programming language to create those algorithms.

## Slection Sort
Identifying the lowest element on the list and placing it in the right spot by swapping the current element with the following lowest element is the fundamental principle of selection sort.

![Selection sort img](https://user-images.githubusercontent.com/99833243/178199013-8704fa67-9ddf-4353-9371-bb0e53e382ca.png)

### Code Example (Selection sort)
```

public void selectionSort(int[] array){
        int i, j, minvalue,minIndex;
        int temp = 0;

        for (i = 0; i < array.length; i++){
            minvalue = array[i];
            minIndex = i;

            for (j = i; j < array.length; j++){
                if (array[j] < minvalue){
                    minvalue = array[j];
                    minIndex = j;
                }
            }

            if (minvalue < array[i]){
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
