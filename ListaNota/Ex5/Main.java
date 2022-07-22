class Main {
  public static void main(String[] args) {
    int G[]={1,2,3,2,3,1,2,3,2,3,1,2,3};
    int R[]={1,2,3,2,3,1,2,3,2,3,1,2,3};
    int acerto=0;
    int i=0;
    
    for(int aux:G){
        if(R[i]==aux){
            acerto++;
        }
        i++;
    }
    
    if(acerto==13){
        System.out.println("GANHADOR, PARABENS");
    }
  }
}
