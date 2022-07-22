class Main {
  public static void main(String[] args) {
    ListaLivro biblioteca = new ListaLivro(10);
    Livro c1 = new Livro(10, "Jose", "Porquinho", 23, "Infantil", "Lucas");
    Livro c2 = new Livro(11, "Armando", "Cinderela", 23, "Infantil", "Sophia");
    Livro c3 = new Livro(12, "Cesar", "Pequeno Principe", 23, "Infantil", "Joao");
    Livro c4 = new Livro(13, "Chico", "Buarque", 23, "Adulto", "HS");

    biblioteca.insere(c1);
    biblioteca.insere(c2);
    biblioteca.insere(c3);
    biblioteca.insere(c4);
    biblioteca.imprime();
    System.out.println(biblioteca.busca("Cinderela"));

  }
}
