public class InsertionSort {
    public int[] insertionSort(int arr[]){
        int tam = arr.length;
        for (int externo = 1; externo < tam; externo++) {
            for (int interno = externo; interno >0 ; interno--) {
                if (arr[interno] < arr[interno-1]){
                    //fazer a troca
                    int aux = arr[interno];
                    arr[interno] = arr[interno-1];
                    arr[interno-1] = aux;
                }
                else
                    break;

            }
        }
        return arr;
    }
}
