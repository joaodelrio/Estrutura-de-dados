public class Pilha{
  int ponteiro_final=-1;
  Contato lista[] = new Contato[10];
  int inicio = 0;

  public void inserePilha(Contato ci){
    if(ponteiro_final<(lista.length-1)){//Confere se a lista está cheia
      
      if(ponteiro_final==-1){
        lista[inicio]=ci;
      }
      else{
        for(int i=ponteiro_final;i>=0;i--){
          lista[i+1] = lista[i];
        }
        lista[inicio]=ci;
      }
      ponteiro_final++;
    }
    else{
      System.out.println("Pilha cheia");
    }
  }

  public void removePilha(){
    if(ponteiro_final!=-1){//Confere se a lista está vazia
      for(int i=0;i<ponteiro_final+1;i++){
        lista[i] = lista[i+1];
      }
      ponteiro_final--;
    }
    else{
      System.out.println("Pilha vazia");
    }
  }

  public void imprimePilha(){
    System.out.println("Pilha: ");
    for(int i=0;i<ponteiro_final+1;i++){
      System.out.println(lista[i]);
    }
    System.out.println();
  }
}