import java.util.Arrays;

public class SortingTestingSystem {
    public static void main(String[] args) {
        int[] firstArray = ArrayCreator.createAndAddRandomIntegerInRange(10000, -15, 15);
        int[] secondArray = firstArray.clone();
        int[] thirdArray = firstArray.clone();

        long starTimeForBubbleSort = System.currentTimeMillis();
        ArraySorter.bubbleSort(firstArray);
        long endTimeForBubbleSort = System.currentTimeMillis();
        System.out.println("Bubble sort lasted " + (endTimeForBubbleSort - starTimeForBubbleSort) + " milliseconds");

        long starTimeForInsertionsSort = System.currentTimeMillis();
        ArraySorter.insertionsSort(secondArray);
        long endTimeForInsertionsSort = System.currentTimeMillis();
        System.out.println("Insertions sort lasted " + (endTimeForInsertionsSort - starTimeForInsertionsSort) + " milliseconds");

        long starTimeForCollectionsSort = System.currentTimeMillis();
        Arrays.sort(thirdArray);
        long endTimeForCollectionsSort = System.currentTimeMillis();
        System.out.println("Arrays sort lasted " + (endTimeForCollectionsSort - starTimeForCollectionsSort) + " milliseconds");
    }
}
