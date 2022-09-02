class Main {
  public static void main(String[] args) {
    int M[][] = new int[5][5];
    int somaL4=0;
    int somaC2=0;
    int somaDP=0;
    int somaDS=0;
    int somaT=0;
    int preenchedor=0;

    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        M[i][j]=preenchedor;
        if(preenchedor>3){
          preenchedor=0;
        }
        preenchedor++;
      }
    }
    
    for(int i=0;i<5;i++){
      System.out.println();
      for(int j=0;j<5;j++){
        System.out.print(M[i][j]+"|");
      }
    }

    for(int i=0;i<5;i++){
      somaL4 = somaL4 + M[3][i];
      somaC2 = somaC2 + M[i][1];
      somaDP = somaDP + M[i][i];
    }

    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        somaT = somaT + M[i][j];
      }
    }
    


    System.out.println();
    System.out.println("SomaL4: "+somaL4);
    System.out.println("SomaC2: "+somaC2);
System.out.println("SomaDP: "+somaDP);
System.out.println("SomaT: "+somaT);
  }
}
