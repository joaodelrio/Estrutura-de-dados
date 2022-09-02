public class Carro{
  String marca, modelo;
  int ano, portas;
  
  Carro(String marca, String modelo, int ano, int portas){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.portas = portas;
  }

  String mostrarDados(){
    String dados = "Marca: "+marca+"\nModelo: "+modelo+"\nAno de Fabricação: "+ano+"\nPortas: "+portas+"\n";
    return dados;
  }
}
