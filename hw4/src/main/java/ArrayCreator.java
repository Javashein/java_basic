public class ArrayCreator {

    public static int[] createAndAddRandomIntegerInRange(int length, int minRange, int maxRange) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * (Math.abs(maxRange) + Math.abs(minRange) + 1) + minRange));
        }
        return array;
    }
}
