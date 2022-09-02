import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    ListaDinamica lista = new ListaDinamica();

    int n=0;

    Scanner scanf = new Scanner(System.in);

    int count=0;

    while(n!=3){

      System.out.println("1 - inserir" + "\n" + "2 - imprimir" + "3 - finaizar programa");

      n = scanf.nextInt();

      switch(n){
      case 1:
        Atleta acount = new Atleta();

        System.out.println("digite o nome do atleta");
        acount.setNome(scanf.nextLine());
        System.out.println("digite o esporte do atleta");
        acount.setEsporte(scanf.nextLine());
        System.out.println("digite o patrocinador do atleta");
        acount.setPatrocinadores(scanf.nextLine());
        System.out.println("digite a altura do atleta(exemplo 1.72)");
        acount.setAltura(scanf.nextDouble());
        System.out.println("digite a altura do atleta(exemplo 1.72)");
        acount.setPeso(scanf.nextDouble());

        lista.insere(new No(acount));
        count++;
      case 2:
        lista.imprime();

      }

    }
  }
}
