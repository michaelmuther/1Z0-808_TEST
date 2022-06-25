public class Default1 {

    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i : intArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        boolean[] boolArray = new boolean[10];
        for (boolean i : boolArray) {
            System.out.print(i + " ");
        }
    }
}
