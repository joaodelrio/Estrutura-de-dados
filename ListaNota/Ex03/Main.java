class Main {
  public static void main(String[] args) {
    int vetor[] = {1,2,3,4,5};
    int vetor2[] = new int[5];
    int i=0;
    
    for(int aux:vetor){
      vetor2[i] = aux;
      i++;
    }

    for(int aux:vetor2){
      System.out.print(aux+"|");
    }
  }
}
