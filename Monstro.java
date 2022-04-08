public class Monstro {
  String nome;
  int forca;
  int pontosDeVida;

  int causarDano(){;
    int dano = forca * 3;
    return dano;
  }
  String rugir(){
    return "ROOOOOUUUU";
    }
  
  void receberDano(int dano) {;
    pontosDeVida = pontosDeVida - dano;
    if(pontosDeVida <= 0){ 
    }
    
    }
  void morrer(){
    System.out.println("morreu.");
    }
    String exiberStatus(){
      String status = "nome:" + nome +"Vida:" + pontosDeVida;
        return status;
 
  }
  }
