public class P1 {
    public static void main(String[] args){
        //imprimir la lista de palabras de tamaño impar de un texto

        String sNombre = "alberto javi perro laveeeeeeerga nosej lambebicho asi se habla bbsitas";
        String[] partes = sNombre.split(" ");

        for (int i=0;i< partes.length;i++){
            if(partes[i].length()%2 != 0) System.out.println(partes[i]);
        }
    }
}
