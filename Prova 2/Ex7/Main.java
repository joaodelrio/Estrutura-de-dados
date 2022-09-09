class Main {
  public static void main(String[] args) {
    int vet[]={10,1,2,3};
    int ordenada[] = new int[10];
    InsertionSort a = new InsertionSort();

    ordenada = a.insertionSort(vet);

    for(int aux:ordenada){
      System.out.print(aux + "|");
    }
  }
}
