package metodos;

public class SelectionSort {

    public int[] selectionSort(int[] arraySelection) {
        int indiceMin;
        for (int i = 0; i < arraySelection.length; i++) {
            indiceMin = i;
            for (int j = i + 1; j < arraySelection.length; j++) {
                if (arraySelection[j] < arraySelection[indiceMin]) {
                    indiceMin = j;
                }
            }

            int tmp = arraySelection[indiceMin];
            arraySelection[indiceMin] = arraySelection[i];
            arraySelection[i] = tmp;
        }

        return arraySelection;
    }
}
