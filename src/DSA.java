public class DSA {

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

    public void quickSort() {
    }

}
