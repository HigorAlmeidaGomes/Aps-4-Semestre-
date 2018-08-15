package metodos;

public class InsertionSort {

    public int[] insertionSort(int[] arrayInsertion) {
        int auxInsertion;
        for (int i = 0; i < arrayInsertion.length; i++) {
            auxInsertion = arrayInsertion[i];
            int j = i - 1;
            while (j >= 0 && arrayInsertion[j] >= auxInsertion) {
                arrayInsertion[j + 1] = arrayInsertion[j];
                j--;
            }
            arrayInsertion[j + 1] = auxInsertion;
        }

        return arrayInsertion;
    }
}
