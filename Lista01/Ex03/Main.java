class Main {
  public static void main(String[] args) {
    Carro carro1 = new Carro("Ford", "Fiesta", 2019, 4);
    Carro carro2 = new Carro("Ford", "KA", 2018, 4);
    Carro carro3 = new Carro("Fiat", "Uno", 2001, 2);
    System.out.println(carro1.mostrarDados());
    System.out.println(carro2.mostrarDados());

    System.out.println(carro3.mostrarDados());
  }
}
