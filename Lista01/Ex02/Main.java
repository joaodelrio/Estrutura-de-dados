import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Aluno aluno1 = new Aluno("Joao", 70);
    Aluno aluno2 = new Aluno("Icaro", 80);
    Aluno aluno3 = new Aluno("Lucas", 90);
    Aluno aluno4 = new Aluno();
    Aluno aluno5 = new Aluno();

    //RECEBENDO DADOS DO ALUNO 4
    System.out.println("Digite o nome do aluno 4: ");
    aluno4.nome = sc.nextLine();
    System.out.println("Digite a nota do aluno 4: ");
    aluno4.mediaNotas = sc.nextInt();

    //RECEBENDO DADOS DO ALUNO 5
    System.out.println("Digite o nome do aluno 5: ");
    sc.nextLine();
    aluno5.nome = sc.nextLine();
    System.out.println("Digite a nota do aluno 5: ");
    aluno5.mediaNotas = sc.nextInt();

    //MOSTRANDO OS DADOS DE TODOS OS ALUNOS

    //Aluno 1
    System.out.println("\nAluno 1:");
    System.out.println(aluno1.nome);
    System.out.println(aluno1.mediaNotas);

    //Aluno 2
    System.out.println("\nAluno 2:");
    System.out.println(aluno2.nome);
    System.out.println(aluno2.mediaNotas);

    //Aluno 3
    System.out.println("\nAluno 3:");
    System.out.println(aluno3.nome);
    System.out.println(aluno3.mediaNotas);

    //Aluno 4
    System.out.println("\nAluno 4:");
    System.out.println(aluno4.nome);
    System.out.println(aluno4.mediaNotas);
    
    //Aluno 5
    System.out.println("\nAluno 5:");
    System.out.println(aluno5.nome);
    System.out.println(aluno5.mediaNotas);

    
  }
}
