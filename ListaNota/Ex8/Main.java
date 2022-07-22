class Main {
  public static void main(String[] args) {
    ListaConta banco = new ListaConta(10);
    Conta c1 = new Conta("Joao", 122, 165, 0);
    Conta c2 = new Conta("Gabriel", 143, 155, 0);
    Conta c3 = new Conta("Gallo", 233, 45, 0);
    Conta c4 = new Conta("Marques", 666, 666, 0);

    banco.insere(c1);
    banco.insere(c2);
    banco.insere(c3);
    banco.insere(c4);
    banco.depositar("Gabriel", 100);
    banco.imprime();
    banco.retirar("Gabriel", 100);
    banco.imprime();
  }
}
