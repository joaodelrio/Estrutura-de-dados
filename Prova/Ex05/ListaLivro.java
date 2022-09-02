public class ListaLivro{
  Livro lista[];
  int fim=-1;

  public ListaLivro(int tam){
    lista = new Livro[tam];
  }

  public void insere(Livro l){
    if(fim<lista.length-1){
      fim++;
      lista[fim]=l;
    }
    else{ System.out.println("Lista cheia");
    }
  }

  public String busca(String nomeB){
    for(int i=0;i<fim+1;i++){
      if(lista[i].nome.contains(nomeB)){
        System.out.println("Achamos está na posicao "+ i);
        return lista[i].toString();
      }
    }
    System.out.println("Não achamos!");
    return null;
  }

  public void imprime(){
    for(int i=0;i<fim+1;i++){
      System.out.println(i+":"+lista[i].toString());
    }
  }
}
