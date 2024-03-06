public class Main {

    public static void main(String[] args) {
        int[] array1 = {6,20,9,15,33,27};
        System.out.println("Array original: ");
        for(int i:array1){
            System.out.println(i + "");
        }
        System.out.println();
        selectionSort(array1);

        System.out.println("Array ordenado em ordem decrescente:");
        for(int i:array1){
            System.out.println(i + "");
        }
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j; // procura do index mais baixo
                }
            }
            if (index != i){
                int menorNumero = array[i];
                array[i] = array[index];
                array[index] = menorNumero;
            }

        }
    }
}