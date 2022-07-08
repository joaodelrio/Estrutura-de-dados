public class Fila{
  int ponteiro_final=-1;
  int inicio=0;

  Contato lista[];

  public Fila(int tamanho){
    lista = new Contato[tamanho];
  }

  public void insereFila(Contato ci){
    if(ponteiro_final<(lista.length-1)){ //Confere se a lista está cheia
      ponteiro_final++;
      lista[ponteiro_final] = ci; //Coloca no final da fila
      
    }
    else{
      System.out.println("Fila cheia");
    }
  }

  public void removeFila(){
    if(ponteiro_final!=-1){ //Confere se a lista está vazia
      
      for(int i=0;i<ponteiro_final;i++){
        lista[i] = lista[i+1]; //remove o primeiro da fila, passando todos para frente
      }
      ponteiro_final--;
    }
    else{
      System.out.println("Fila vazia");
    }
  }

  public void imprimeFila(){
    System.out.println("FILA: ");
    for(int i=0;i<ponteiro_final+1;i++){
      System.out.println(lista[i]);
    }
    System.out.println();
  }
}
