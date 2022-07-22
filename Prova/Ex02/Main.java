import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int vetor[] = new int[15];
    int impares[] = new int[15];

    for(int i=0;i<15;i++){
      System.out.print("Vetor["+i+"]: ");
      vetor[i] = input.nextInt();
    }

    int i=0;
    for(int aux:vetor){
      if(aux%2!=0){
        impares[i]=aux;
        i++;
      }
    }

    int soma=1;
    for(int z=0; z<i;z++){
      soma*=impares[z];
    }
    System.out.println(soma);
  }
}
