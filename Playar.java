class Player {
  Arma arma;
  int forca;
  float posicaoX;
  float posicaoY;
  int pontosDeVida;
  String nome; 

  Player(String n, int ptsDeVida, float posInicialX, float posInicialY, int  forca, Arma novaArma){
    System.out.println("Construtor do player");
    nome = n;
    pontosDeVida = ptsDeVida;
    posicaoX = posInicialX;
    posicaoY = posInicialY;
    this.forca = forca;
    arma = novaArma;
  
  void mover(float posX, float posY){
    

    posX = posX + 5;
    posY = posY + 5;
}
  public float posicaoX(float posX) {
  System.out.println ("Sua posição em X:" + posX);
  return posX;
}
   public float posicaoY(float posY) {
   System.out.println ("Sua posição em Y:" + posY);
   return posY;
} 
   public void dano(int damage)
   damage = pontoDeVida damage; 
  
}
    public int pontosDeVida()
    pontoVida = 100;
    return pontoVida;
}
  public String status() {
  System.out.println("Nome personagem: " + nome + "/" + 
  pontoVida + "Life");
  return status();

  static void batalha(){
  int pontosDeVidaPlayer = 150;
  int pontosDeVidaMostro =11;
  int contagemEspecial =5;

 System.out.println(pontosDeVida > 0 && pontoVidaPlayer >0 ){
   
 } 
}    


