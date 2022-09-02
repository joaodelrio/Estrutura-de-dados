class Main {
  public static void main(String[] args) {
    int g[]={2,1,3,3,3,2,1,1,2,3,1,2,1};
    int r[]={2,1,3,3,3,2,1,1,2,3,1,2,1};
    int acerto=0;

    for(int i=0;i<13;i++){
      if(r[i]==g[i]){
        acerto++;
      }
    }

    System.out.println("Quantidade de acertos: "+acerto);    
    if(acerto==13){
      System.out.println("GANHADOR, PARABENS");
    }
  }
}
