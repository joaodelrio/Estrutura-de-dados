public class Conta{
  String nomeTitular;
  int numeroConta, numeroAgencia, saldoConta;

  public Conta(String nomeTitular, int numeroConta, int numeroAgencia, int saldoConta){
    this.nomeTitular = nomeTitular;
    this.numeroConta = numeroConta;
    this.numeroAgencia = numeroAgencia;
    this.saldoConta = saldoConta;
  }

  public String toString(){
    return "Nome: "+nomeTitular+" Numero Conta: "+numeroConta+" Numero Agencia: "+numeroAgencia+" Saldo Conta: "+saldoConta;
  }
}
