package ruleta;

public class RuletaRusa {
    public static void main(String[] args) {
        
        Juego juego = new Juego(6);
        
        while( !juego.finJuego() ){
            juego.ronda();            
        }
        
        System.out.println("El juego ha terminado");
        
    }

}
