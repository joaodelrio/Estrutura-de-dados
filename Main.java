class Main {
  float v1, v2, v3;

  Main(float v1, float v2, float v3){
    this.v1=v1;
    this.v2=v2;
    this.v3=v3;
  }

  float media(){
    return (v1+v2+v3)/3;
  }

  public static void main(String[] args) {
      Main aluno = new Main(75, 80, 75);
          System.out.println(aluno.media());
  }
}
