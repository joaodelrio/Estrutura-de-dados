class Main {
  public static void main(String[] args) {
    Fila lf = new Fila(10);
    Pilha lp = new Pilha(10);
    Contato c1 = new Contato("Romas", "19987");
    Contato c2 = new Contato("Joao", "1998");
    Contato c3 = new Contato("Faria", "19999");
    Contato c4 = new Contato("Ana", "43564");
    Contato c5 = new Contato("Lucas", "145478");
    Contato c6 = new Contato("Sophia", "1999911321");
    lf.removeFila();
    lf.insereFila(c4);
    lf.insereFila(c2);
    lf.insereFila(c3);
    lf.insereFila(c1);
    lf.imprimeFila();
    lf.removeFila();
    lf.imprimeFila();



    lp.inserePilha(c4);
    lp.inserePilha(c2);
    lp.inserePilha(c3);
    lp.inserePilha(c1);
    lp.imprimePilha();
    lp.removePilha();
    lp.imprimePilha();
    lp.removePilha();
    lp.imprimePilha();
    lp.removePilha();
    lp.imprimePilha();
    
  }
}
