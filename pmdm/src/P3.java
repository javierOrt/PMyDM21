import java.util.ArrayList;
import java.util.List;

public class P3 {
    public static void main(String[] args) {

        List<String> marcas = new ArrayList<String>();
        marcas.add("Seat");
        marcas.add("Fiat");
        marcas.add("Ford");
        marcas.add("Audi");
        marcas.add("Citroen");
        marcas.add("Bmw");
        marcas.add("Mercedes");
        marcas.add("Opel");
        marcas.add("Porché");
        marcas.add("Lamborghini");
        marcas.add("Renault");

        List<String> bingo=generarCarton(marcas);

        imprimirCarton(bingo);

        ArrayList<List<String>> contenedorCartones = new ArrayList<>();

        int numeroTotalCartones=5;
        for (int i = 0; i < numeroTotalCartones; i++) {
            System.out.println();
            List<String> cartonInt=generarCarton(marcas);
            if (!existeCarton(cartonInt,contenedorCartones)){
                contenedorCartones.add(cartonInt);
                imprimirCarton(cartonInt);
            }
        }
    }

    private static boolean existeCarton(List<String> cartonInt, ArrayList<List<String>> contenedorCartones) {
        for (int i = 0; i < contenedorCartones.size(); i++) {
            List<String> cartonAux = contenedorCartones.get(i);
            if (compararCartones(cartonInt,cartonAux)){
                return true;
            }
        }
        return false;
    }

    private static boolean compararCartones(List<String> cartonInt, List<String> cartonAux) {
        for (int i = 0; i < cartonInt.size(); i++) {
            if (!cartonInt.contains(cartonAux.get(i))){
                return false;
            }
        }
        return true;
    }

    private static void imprimirCarton(List<String> cartonInt) {
        String sComa="";
        for (String carton: cartonInt) {
            System.out.print(sComa+carton);
            sComa=",";
        }
        System.out.println();
    }

    private static List<String> generarCarton(List<String> cartonInt) {
        List<String> carton=new ArrayList<String>();
        int aleatorio = 0;
        for (int i = 0; i < 5;) {
            aleatorio=(int)(Math.random()*9);
            if (!carton.contains(cartonInt.get(aleatorio))) {
                carton.add(cartonInt.get(aleatorio));
                i++;
            }
        }
        return carton;
    }
}

