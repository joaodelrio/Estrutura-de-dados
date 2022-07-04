class Contato{
  String nome;
  String telefone;

  public Contato(String n, String t){
   nome = n;
   telefone = t;
  }

  public String toString(){
    return nome+"-"+telefone;
  }
  
}