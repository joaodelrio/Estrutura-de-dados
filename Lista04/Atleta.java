public class Atleta{
  private String nome, esporte, patrocinadores;
  private double altura, peso;


  public Atleta(){

  }
  public Atleta(String nome, String esporte, String patrocinadores, double altura, double peso){
    this.nome=nome;
    this.esporte=esporte;
    this.patrocinadores=patrocinadores;
    this.altura=altura;
    this.peso=peso;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setEsporte(String esporte){
    this.esporte = esporte;
  }

  public void setPatrocinadores(String patrovinadores){
    this.patrocinadores = patrocinadores;
  }

  public void setAltura(double altura){
    this.altura = altura;
  }

  public void setPeso(double peso){
    this.peso = peso;
  }

  public String toString(){
    return "Nome: "+ nome + " Altura: "+altura+ " Peso: "+peso+" Esporte: "+esporte+" Patrocinadores: "+patrocinadores;
  }

}
