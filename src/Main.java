
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1,4,5,2,6,7,3,9,8,2,3,1,3,1,4,5,2,6,3};

        DSA sort1 = new DSA();

        // sort 2 (selection sort)
        sort1.selectionSort(array1);
        System.out.println("Selection Sort Algo");
        System.out.println(Arrays.toString(array1));

    }
}
