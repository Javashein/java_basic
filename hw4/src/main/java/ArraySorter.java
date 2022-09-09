public class ArraySorter {
    public static void insertionsSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMinElement = i;
            int minElement = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (minElement > array[j]) {
                    minElement = array[j];
                    indexOfMinElement = j;
                }
            }
            array[indexOfMinElement] = array[i];
            array[i] = minElement;
        }
    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}

