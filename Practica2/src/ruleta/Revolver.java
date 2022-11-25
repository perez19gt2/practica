package ruleta;

public class Revolver {
    private int LBalDis;
    private int LB;

    //Constructor
    public int aleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }
    public Revolver() {
    	LBalDis = aleatorio(1, 6);
        LB = aleatorio(1, 6);
    }
    public boolean disparar() {

        boolean exito = false;

        if (LBalDis == LB) {
            exito = true;
        }
        siguienteBala();
        return exito;
    }
    public void siguienteBala() {

        if (LBalDis == 6) {
        	LBalDis = 1; 
        } else {
        	LBalDis++;
        }

    }
}
