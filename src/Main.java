
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1,4,5,2,6,7,3,9,8,2,3,1,3,1,4,5,2,6,3};
        int[] array2 = {3,9,8,2,3,1,4,5,2,6,7,3,1,4,5,2,6,3,1,};
        int[] array3 = {1,4,5,2,4,5,2,6,36,7,1,3,1,3,9,8,2,3};
        DSA sort = new DSA();
        DSA sort1 = new DSA();
        DSA sort2 = new DSA();

        // sort 1 ( ??? )
        sort.sortAlgorithm(array1);
        System.out.println("??? Sort Algo");
        System.out.println(Arrays.toString(array1));

        // sort 2 (selection sort)
        sort1.selectionSort(array2);
        System.out.println("Selection Sort Algo");
        System.out.println(Arrays.toString(array2));

    }
}
