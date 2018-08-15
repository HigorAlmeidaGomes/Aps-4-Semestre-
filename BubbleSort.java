package metodos;

public class BubbleSort {

    public int[] bubbleSort(int[] arrayBubble) {
        int auxBubble;
        for (int i = 0; i < arrayBubble.length; i++) {
            for (int j = 0; j < (arrayBubble.length - 1); j++) {
                if (arrayBubble[j] > arrayBubble[j + 1]) {
                    auxBubble = arrayBubble[j];
                    arrayBubble[j] = arrayBubble[j + 1];
                    arrayBubble[j + 1] = auxBubble;
                }
            }
        }
        return arrayBubble;
    }
}
