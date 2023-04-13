import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[1000];
        Random random = new Random();
        for (int i=0; i< array.length;i++) {
            array[i]= random.nextInt(10000);
        }
        System.out.println("Starting ");
        printArray(array);
        sortArray(array);
        System.out.println("Sorting ");
        printArray(array);

    }

    public static void sortArray(int[] array) {
        int arrayLength = array.length;

        if (arrayLength<2) {
            return;
        }
        int[] left = new int[arrayLength/2];
        int[] right = new int[arrayLength - (arrayLength/2)];

        for (int i=0;i<arrayLength/2;i++) {
            left[i]=array[i];
        }
        for (int i=arrayLength/2; i<arrayLength;i++) {
            right[i-arrayLength/2]=array[i];
        }

        sortArray(left);
        sortArray(right);
        merge(array,left,right);
    }
    public static void merge(int[] array, int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;

        int i=0;
        int j=0;
        int x=0;

        while (i<leftLength && j<rightLength) {
            if (left[i] <=right[j]) {
                array[x]=left[i];
                i++;
            } else {
                array[x]=right[j];
                j++;
            }
            x++;
        }
        while (i < leftLength) {
            array[x] = left[i];
            i++;
            x++;
        }
        while (j < rightLength) {
            array[x] = right[j];
            j++;
            x++;
        }
    }
    public static void printArray(int[] array) {
        for (int i=0;i< array.length;i++) {
            System.out.println(array[i]);
        }
    }
}
