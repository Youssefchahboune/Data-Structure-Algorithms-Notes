# Data-Structure-Algorithms-Notes
This repository will act as a study guide for data structures and algorithms.

# Sorting Algorithms
Various sorting algorithms will be covered in this section such as SELECTION sort, QUICK sort, MERGE sort, INSERTION sort, and numerous other sorting algorithms. Also, Java will be utilised as the programming language to create those algorithms.

## Slection Sort
Identifying the lowest element on the list and placing it in the right spot by swapping the current element with the following lowest element is the fundamental principle of selection sort.

![Selection sort img](https://user-images.githubusercontent.com/99833243/178199013-8704fa67-9ddf-4353-9371-bb0e53e382ca.png)

> Code Analysis (Selection sort)

We can see from the code below that we've created a method called selectionSort that accepts an array of type integers as a parameter. First, we must declare five variables inside that method, all of which are of the integer data type. The first variable, "i," will act as the counter for the outer for loop, and the second variable, "j," will act as the counter for the inner for loop. We also have a variable called "minValue" that has to be used to hold the array's lowest element. The index of the lowest member in the list must be stored in a variable called "minIndex," which we must also declare. The final variable is "temp," which will be used to temporarily hold a value for a swap.

We now build our first for loop using the "i" variable as a countrer after defining the appropriate variables. Within the outer for loop, we will store (first element = array[i]) in the variable named "minvalue" and its index ( i ) in the variable called "minIndex."

Following that, we construct our second for loop, which will run over each element in the array and compare it to the minvalue; if it finds an element (array[j]) that is lower than the current "minvalue," we will save the new lowest value inside of "minvalue" and its index inside of "minIndex".

From that, we'll see if the minValue we've saved is less than the most farthest left unsorted value (array[i]) If yes, we will perform a swap by first storing the most farthest left value inside of "temp" so that we do not lose that value, and then we make that value (array[i]) equal to the lowest value we found, which is array[minIndex], and then we make that value equal to the value that is stored inside of "temp," and now that element (array[i]) is now sorted and at the right spot.

Finally, we go to the next unsorted and farthest left element of the list ( array[i + 1] ) and repeat the process until the selection sort is complete.

> Code Example (Selection sort)

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
```
    
## Insertion Sort
    
