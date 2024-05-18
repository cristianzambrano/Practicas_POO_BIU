import Clases_EjHerencia.Entrenador;
import Clases_EjHerencia.Jugador;
import Clases_EjHerencia.Masajista;

public class EjemploHerencia {
    public static void main(String[] args) {

        Jugador player1 = new Jugador(1, "Cristian", "López",
                20, 5, "Delantero");

        System.out.println("Objeto Jugador "  + player1.getNombres());

        Entrenador entrenador = new Entrenador(1, "José", "López",
                20, 5);

        System.out.println("Objeto Entrenador "  + entrenador.getNombres());

        Masajista masajista = new Masajista(1, "Carlos", "López",
                20, "Eperto en Terapia Muscular Deportiva", 10);

        System.out.println("Objeto Masajista "  + masajista.getNombres());


    }
}
