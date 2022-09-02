public class Livro{
    long isbn;
    String autor;
    String nome;
    int numPaginas;
    String categoria;
    String emprestado;

  public Livro(long isbn, String autor, String nome, int numPaginas, String categoria, String emprestado){
    this.isbn=isbn;
    this.autor=autor;
    this.nome=nome;
    this.numPaginas=numPaginas;
    this.categoria=categoria;
    this.emprestado=emprestado; 
  }

    public String toString() {
        return " isbn=" + isbn + "\n autor=" + autor + "\n nome=" + nome + "\n numPaginas=" + numPaginas + "\n categoria=" + categoria + "\n emprestado=" + emprestado + "\n";
    }
}
