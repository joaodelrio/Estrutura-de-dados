class Main {
  public static void main(String[] args) {
    int[][] matriz= new int[5][5];
    int preenchedor=0;
    int soma=0;

    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        if(preenchedor==3){
          preenchedor=0;
        }
        preenchedor++;
        matriz[i][j]=preenchedor;
      }
    }

    for(int i=0;i<5;i++){
      System.out.print("\n");
      for(int j=0;j<5;j++){
        System.out.print(matriz[i][j]+" ");
      }
    }

    //SOMA DA LINHA 4 da MATRIZ
    
    for (int i=3,j=0;j<5;j++){
      soma = soma + matriz[i][j];
    }
    System.out.println("\nSOMA DA LINHA 4 da MATRIZ: "+soma);

    //SOMA DA COLUNA 2 da MATRIZ

    soma=0;
    for (int i=0,j=1;i<5;i++){
      soma = soma + matriz[i][j];
    }
    System.out.println("\nSOMA DA COLUNA 2 da MATRIZ: "+soma);

    //SOMA DA DIAGONAL PRINCIPAL da MATRIZ

    soma=0;
    for (int i=0;i<5;i++){
      soma = soma + matriz[i][i];
    }
    System.out.println("\nSOMA DA DIAGONAL PRINCIPAL da MATRIZ: "+soma);

    //SOMA DA DIAGONAL SECUNDARIA da MATRIZ

    soma=0;
    for (int i=0,j=4;i<5;i++,j--){
      soma = soma + matriz[i][j];
    }
    System.out.println("\nSOMA DA DIAGONAL SECUNDARIA da MATRIZ: "+soma);
    //SOMA DE TODOS OS ELEMENTOS da MATRIZ

    soma=0;
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        soma= soma+matriz[i][j];
      }
    }
    System.out.println("\nSOMA DE TODOS OS ELEMENTOS da MATRIZ: "+soma);
  }
}
