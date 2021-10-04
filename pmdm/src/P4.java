import java.util.ArrayList;
import java.util.HashMap;

public class P4 {
    public static void main(String[] args) {
        HashMap<String, String> hmJugadores = new HashMap<String, String>();

        hmJugadores.put("Faker", "T1");
        hmJugadores.put("Teddy", "T1");
        hmJugadores.put("Clid", "T1");
        hmJugadores.put("Rekkles", "EnElParo");
        hmJugadores.put("Flakked", "Gigantes");
        hmJugadores.put("Miniduke", "Gigantes");
        hmJugadores.put("Giorno", "Passione");

        HashMap<String, String> hmJugadoresNacionalidad = new HashMap<String, String>();

        hmJugadoresNacionalidad.put("Faker", "Kr");
        hmJugadoresNacionalidad.put("Teddy", "Kr");
        hmJugadoresNacionalidad.put("Clid", "Kr");
        hmJugadoresNacionalidad.put("Rekkles", "It");
        hmJugadoresNacionalidad.put("Flakked", "Es");
        hmJugadoresNacionalidad.put("Miniduke", "Es");
        hmJugadoresNacionalidad.put("Giorno", "It");

        System.out.println(sacarValores("Passione",hmJugadores));
        System.out.println(nacionalidades("T1","Kr",hmJugadores,hmJugadoresNacionalidad));



    }
    //Escribir los jugadores del Madrid utilizando un metodo o funcion que devuelva las claves
    private static ArrayList<String> sacarValores(String sValue, HashMap<String,String> hmJugadores){
        ArrayList<String> jugadores = new ArrayList<String>();
        for (String i: hmJugadores.keySet()) {
            if (hmJugadores.get(i).equals(sValue)){
                jugadores.add(i);
            }
        }
        return jugadores;
    }
    //Escribir el equipo y la nacionalidad y devolver que jugadores son
    private static int nacionalidades(String sEquipo, String sPais, HashMap<String,String> hmJugadoresLocal, HashMap<String,String> hmJugadoresNacionalidadesLocal){
        ArrayList<String> alJugadores = sacarValores(sEquipo,hmJugadoresLocal);
        int contador = 0;
        for (String jugador: alJugadores) {
            if (hmJugadoresNacionalidadesLocal.get(jugador).equals(sPais)){
                contador++;
            }
        }
        return contador;
    }
}
