public class No{
  Atleta a;
  No proximo;

  public No(Atleta a){
    this.a=a;
  }

  public String toString(){
    if(proximo!=null){
      return this.hashCode()+"-> Obj atleta: "+a.toString() + "| Proximo: "+proximo.hashCode();
    }
    else{
      return this.hashCode()+"-> Obj atleta: "+a.toString() + "| Proximo: Vazio";
    }
  }
}
