public class ListaConta extends ListaEstatica{
  Conta lista[];
  int fim=-1;

  public ListaConta(int tam){
    lista = new Conta[tam];
  }

  public void insere(Conta c){
    if(fim<lista.length-1){
      fim++;
      lista[fim]=c;
    }
    else{ System.out.println("Lista cheia");
    }
  }

  public void limpaLista(){
      for(int i =0; i < fim; i++){
          lista[i] = null;
      }
    fim=-1;
  }

  public String busca(String s){
    for(int i=0;i<fim+1;i++){
      if(lista[i].nomeTitular.contains(s)){
        return lista[i].toString();
      }
    }
    System.out.print("Não achamos");
    return null;
  }

  public void remove(String r){
    int posR=-1;
    for(int i=0;i<fim+1;i++){
      if(lista[i].nomeTitular.contains(r)){
        posR = i;
      }
    }
      if (posR!=-1){
          for (int i = posR; i < fim; i++) {
              lista[i] = lista[i+1];
          }
          fim--;
          System.out.println(" Item removido com sucesso! " + r);
      }
      else{
          System.out.println(" Elemento nao localizado! ");

      }
  }

  public void imprimeLista(){
    for(int i=0;i<fim+1;i++){
      System.out.println(i+":"+lista[i].toString());
    }
  }
}
