import java.util.Random;
import java.util.Arrays;

public class SortTools {

    public static int[] createSequenceInc(int n) {
        int[] result = {};
        if (n > 0) {
            result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = i + 1;
            }
        }
        //System.out.println("ascending Array; - Test: 1 to " + n + "; - Result: " + Arrays.toString(result));
        return result;
    }

    public static int[] createSequenceDec(int n) {
        int[] result = {};
        if (n > 0) {
            result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = n - i;
            }
        }
        //System.out.println("descending Array; - Test: " + n + " to 1; - Result: " + Arrays.toString(result));
        return result;
    }

    public static int[] createSequenceRand(int n) {
        int[] result = {};
        if (n > 0) {
            result = new int[n];
            Random rand = new Random();
            for (int i = 0; i < n; i++) {
                int value = rand.nextInt(n) + 1;
                result[i] = value;
            }
        }
        //System.out.println("random Array; - Test: 1 to " + n + "; - Result: " + Arrays.toString(result));
        return result;
    }

    public static int[] createSequenceAlt(int n) {
        int[] result = {};
        if (n > 0) {
            result = new int[n];
            for (int i = 0; i < n; i++) {
                if (i%2 == 0) result[i] = 1;
                else result[i] = 2;
            }
        }
        //System.out.println("alternating Array; - Test: Length = " + n + "; - Result: " + Arrays.toString(result));
        return result;
    }

    public static void insertionSort(int[] a) {
        //System.out.print("insertionSort; - Test: " + Arrays.toString(a) + " - Result: ");
        for (int j = 1; j < a.length; j++) {
            int val = a[j];
            int i = j - 1;
            while(i >= 0 && a[i] > val) {
                a[i+1] = a[i];
                i -= 1;
            }
            a[i+1] = val;
        }
        //System.out.println(Arrays.toString(a));
    }

    public static <T extends Comparable<T>> void insertionSortGen(T[] GenArray) {
        //System.out.print("insertionSortGen; - Test: " + Arrays.toString(GenArray) + " " + GenArray.getClass().getName().substring(12) + " - Result: ");
        for (int j = 1; j < GenArray.length; j++) {
            T val = GenArray[j];
            int i = j - 1;
            while(i >= 0 && GenArray[i].compareTo(val) > 0) {
                GenArray[i+1] = GenArray[i];
                i -= 1;
            }
            GenArray[i+1] = val;
        }
        //System.out.println(Arrays.toString(GenArray));
    }

    public static void main(String[] args) {

        /* a)

        createSequenceInc(0); // ascending Array; - Test: 1 to 0; - Result: []
        createSequenceInc(1); // ascending Array; - Test: 1 to 1; - Result: [1]
        createSequenceInc(10); // ascending Array; - Test: 1 to 10; - Result: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        createSequenceInc(42); // ascending Array; - Test: 1 to 42; - Result: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42]

        createSequenceDec(0); // descending Array; - Test: 0 to 1; - Result: []
        createSequenceDec(1); // descending Array; - Test: 1 to 1; - Result: [1]
        createSequenceDec(10); // descending Array; - Test: 10 to 1; - Result: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        createSequenceDec(42); // descending Array; - Test: 42 to 1; - Result: [42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

        createSequenceRand(1); // random Array; - Test: 1 to 1; - Result: [1]
        createSequenceRand(3); // random Array; - Test: 1 to 3; - Result: [2, 3, 1]
        createSequenceRand(5); // random Array; - Test: 1 to 5; - Result: [4, 5, 3, 2, 5]
        createSequenceRand(10); // random Array; - Test: 1 to 10; - Result: [5, 10, 10, 9, 3, 8, 10, 5, 3, 6]

        createSequenceAlt(1); // alternating Array; - Test: Length = 1; - Result: [1]
        createSequenceAlt(2); // alternating Array; - Test: Length = 2; - Result: [1, 2]
        createSequenceAlt(5); // alternating Array; - Test: Length = 5; - Result: [1, 2, 1, 2, 1]
        createSequenceAlt(10); // alternating Array; - Test: Length = 10; - Result: [1, 2, 1, 2, 1, 2, 1, 2, 1, 2]

        */


        /* b)

        int[] intTestA = {8,1,4,2,5,3};
        insertionSort(intTestA);
        // insertionSort; - Test: [8, 1, 4, 2, 5, 3] - Result: [1, 2, 3, 4, 5, 8]

        int[] intTestB = {3,17,-96,69,-42};
        insertionSort(intTestB);
        // insertionSort; - Test: [3, 17, -96, 69, -42] - Result: [-96, -42, 3, 17, 69]

        int[] intTestC = {33,-19,24,27,0};
        insertionSort(intTestC);
        // insertionSort; - Test: [33, -19, 24, 27, 0] - Result: [-19, 0, 24, 27, 33]

        int[] intTestD = {-68,54,77,-26,5};
        insertionSort(intTestD);
        // insertionSort; - Test: [-68, 54, 77, -26, 5] - Result: [-68, -26, 5, 54, 77]

        */


        // c)

        int[] A = createSequenceDec(100);
        long[] ABegins = new long[10];
        long[] AEnds = new long[10];
        long[] ADurations = new long[10];
        long Duration = 0;
        for (int i = 0; i < 10; i++) {
            ABegins[i] = System.nanoTime();
            insertionSort(A);
            AEnds[i] = System.nanoTime();
            ADurations[i] = AEnds[i] - ABegins[i];
            Duration += ADurations[i];
        }
        //System.out.println(Arrays.toString(ADurations));
        //System.out.println(Duration);
        //System.out.println(Duration/10);

        // Test: 100
        // Durations: [103900, 4000, 3300, 3200, 2600, 3000, 3100, 3200, 3200, 3000]
        // Median: 13250

        // Test: 1.000
        // Durations: [2829300, 4300, 3800, 3600, 3600, 3600, 5100, 3700, 3900, 3700]
        // Median: 286460

        // Test: 10.000
        // Durations: [20694100, 39900, 35600, 106300, 57100, 45200, 38100, 51800, 36000, 58400]
        // Median: 2116250

        // Test: 100.000
        // Durations: [1482097800, 414600, 355800, 371100, 347300, 366100, 357400, 355000, 366900, 181400]
        // Median: 148521340

        // Test: 200.000
        // Durations: [5897435200, 790800, 697700, 722100, 740900, 318700, 316600, 314900, 314800, 317400]
        // Median: 590196910


        /* d)

        Integer[] IntegerTest = {8,1,4,2,5,3};
        insertionSortGen(IntegerTest);
        // insertionSortGen; - Test: [8, 1, 4, 2, 5, 3] Integer; - Result: [1, 2, 3, 4, 5, 8]

        String[] StringTest = {"abc","cba","acb","bac","bca","cab"};
        insertionSortGen(StringTest);
        // insertionSortGen; - Test: [abc, cba, acb, bac, bca, cab] String; - Result: [abc, acb, bac, bca, cab, cba]

        Double[] DoubleTest = {0.42, 6.66, 2.13, -5.49};
        insertionSortGen(DoubleTest);
        // insertionSortGen; - Test: [0.42, 6.66, 2.13, -5.49] Double; - Result: [-5.49, 0.42, 2.13, 6.66]

        Float[] FloatTest = {-1.1f, -2.2f, -3.3f, -4.4f};
        insertionSortGen(FloatTest);
        // insertionSortGen; - Test: [-1.1, -2.2, -3.3, -4.4] Float; - Result: [-4.4, -3.3, -2.2, -1.1]

        Character[] CharacterTest = {'w','r','l','C','W'};
        insertionSortGen(CharacterTest);
        // insertionSortGen; - Test: [w, r, l, C, W] Character; - Result: [C, W, l, r, w]

        */

    }

}
