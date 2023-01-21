import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task0 () {
        System.out.println("Task 0, theory");

        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {90, 91, 83, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        //int[] weightsCopy = weights;
        //weightsCopy[0] = 832;

        int januaryWeight = weights [0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        System.out.println(weights[11]);
        System.out.println(weights.length);
        int january = 0;
        System.out.print(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + " ");
        }
        System.out.println(Arrays.toString(weightsCopy));
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        for (int i : weightsCopy) {
            System.out.print(i + " ");
        }
        if (arraysAreEqual) {
            System.out.println("\nArrays are equal");
        } else {
            System.out.println("\nArrays are different");
        }
        int maxWeight = -1;
        for (int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);

        //Ctrl + Alt + T = highlight a line to choose operation
        //Ctrl + Alt + V = change the name of all variables with the given name
        // Ctrl + W = highlight
        //Ctrl + shift + Delete = delete the whole operator (for or while, etc.)
    }



    public static void task1 () {
        System.out.println("\nTask 1");
        int[] sums = new int [30];


    }

    public static void task2 () {
        System.out.println("\nTask 2");
    }

    public static void task3 () {
        System.out.println("\nTask 3");
    }

    public static void task4 () {
        System.out.println("\nTask 4");
    }

    public static void task5 () {
        System.out.println("\nTask 5");
    }

    public static void task6 () {
        System.out.println("\nTask 6");
    }

    public static void task7 () {
        System.out.println("\nTask 7");
    }

    public static void task8 () {
        System.out.println("\nTask 8");
    }
}