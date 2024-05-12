public class sort {
    public static void main(String[] args) {
        int[] ar = {21, 5, 9, -4};
//        bubbleSort(ar);
        insertSort(ar);
        arPrint(ar);
    }

    public static void bubbleSort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int tmp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = tmp;
                }
            }
        }
    }

    public static void insertSort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            for (int j = i; j > 0 && ar[j - 1] > ar[j]; j--) {
                int tmp = ar[j - 1];
                ar[j - 1] = ar[j];
                ar[j] = tmp;
            }
        }
    }


    public static void arPrint(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

}
