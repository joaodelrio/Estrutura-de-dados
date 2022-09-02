public class Pilha{
  int ponteiro_final=-1;
  Contato pilha[];

  public Pilha(int tamPilha){
    pilha = new Contato[tamPilha];
  }
  
  public void inserePilha(Contato ci){
    if(ponteiro_final<(pilha.length-1)){//Confere se a lista está cheia
      ponteiro_final++;
      pilha[ponteiro_final]=ci;
    }
    else{
      System.out.println("Pilha cheia");
    }
  }

  public void removePilha(){
    if(ponteiro_final!=-1){//Confere se a lista está vazia
      pilha[ponteiro_final]=null;
      ponteiro_final--;
    }
    else{
      System.out.println("Pilha vazia");
    }
  }

  public void imprimePilha(){
    System.out.println("Pilha: ");
    for(int i=ponteiro_final;i>-1;i--){
      System.out.println(pilha[i]);
    }
    System.out.println();
  }
}
