class ListaContatos{
  int ponteiro_final = -1;

  Contato lista[] = new Contato[10];

  public ListaContatos(){
    
  }

  public void insere_lista(Contato ci){
    if (ponteiro_final < this.lista.length){
      ponteiro_final ++;

      lista[ponteiro_final] = ci;
    } 
    else {
      System.out.println("lista cheia");
    }
  }

  public void imprime_lista(){
    for(int i=0;i<ponteiro_final+1;i++){
      System.out.println(lista[i]);
    }
  }

  public int busca(String nomeB){
    for(int i = 0; i <= ponteiro_final ; i++) {
      if (lista[i].nome.contains(nomeB))
        return i;
    }
      return -1;
  } 

  public void remove(String nomeR){
    int posR = busca(nomeR);
    if(posR!=-1){
      for(int i=posR;i<ponteiro_final;i++){
        lista[i] = lista[i+1];
      }
      ponteiro_final--;
    }
  }

  public void insere_inicio(Contato ci){
    if(ponteiro_final==-1){
      insere_lista(ci);
    }
      
    else if(ponteiro_final<(lista.length-1)){
      
      for(int i=ponteiro_final;i>=0;i--){
        lista[i+1] = lista[i];
      }
      
      lista[0]=ci; 
      ponteiro_final++;
    }
      
    else{
      System.out.println("Lista cheia");
    }
  }

  public void insere_ordenado(Contato ci){
    //Localizar posicao de insercao >>
    //Percorre a lista a procura de um elemento maior que o elemento a ser inserido
    if(ponteiro_final==-1){
      insere_lista(ci);
    }
      
    else if(ponteiro_final<(lista.length-1)){
      int posInsercao = ponteiro_final+1;
      
      for(int i=0;i<=ponteiro_final;i++){
        if(ci.nome.compareTo(lista[i].nome)<0){
          posInsercao=i;
          break;
        }
      }
      
      for(int i=ponteiro_final;i>=posInsercao;i--){
        lista[i+1] = lista[i];
      }
      
      lista[posInsercao] = ci;
      ponteiro_final++;
    }
      
    else{
      System.out.println("Lista cheia");
    }
    
  }
}
