public class ListaConta{
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

  public int busca(String nomeB){
    for(int i=0;i<fim+1;i++){
      if(lista[i].nomeTitular.contains(nomeB)){
        return i;
      }
    }
    return -1;
  }

  public void depositar(String nomeB, int valor){
    int i = busca(nomeB);
    lista[i].saldoConta+=valor;
  }

  public void retirar(String nomeB, int valor){
    int i = busca(nomeB);
    lista[i].saldoConta-=valor;
  }

  public void imprime(){
    for(int i=0;i<fim+1;i++){
      System.out.println(i+":"+lista[i].toString());
    }
  }
}
