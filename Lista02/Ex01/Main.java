class Main {
  public static void main(String[] args) {
    int vetor[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};


    System.out.println("Lista: ");
    for(int aux:vetor){
      System.out.println(aux);
    }
    
    System.out.println("Lista invertida: ");
    for(int i=0, j=19;i<10;i++,j--){
      int aux;
      aux=vetor[i];
      vetor[i]=vetor[j];
      vetor[j]=aux;

    }
    
    for(int aux:vetor){
      System.out.println(aux);
    }

  }
}
