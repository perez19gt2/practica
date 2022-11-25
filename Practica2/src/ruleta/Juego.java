package ruleta;

public class Juego {
    private Jugador[] jugadores;
    private Revolver revolver;

    public Juego(int NJugadores) {
        jugadores = new Jugador[comprobarJugadores(NJugadores)];
        hacerJugadores();
        revolver = new Revolver();
    }

    private int comprobarJugadores(int NJugadores) {

        if (!(NJugadores >= 1 && NJugadores <= 6)) {
            NJugadores = 6;
        }

        return NJugadores;
    }

    private void hacerJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(i + 1);
        }
    }
    public boolean finJuego() {

        for (int i = 0; i < jugadores.length; i++) {
            if (!jugadores[i].isVivo()) {
                return true;
            }
        }
        return false;
    }
    public void ronda() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].disparar(revolver);
        }
    }
}
