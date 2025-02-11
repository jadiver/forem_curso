public class MainFinal {
    public static void main(String[] args) {
        final int numero = 10;
        //numero = 20; Esto descomentado causara un error de compilación.
        //El método final en Java es el método que no se puede cambiar ni anular una vez definido
        System.out.println(numero);
    }
}
