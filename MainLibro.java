import java.util.Scanner;

public class MainLibro {
    public static void main(String[] args) {
        Libro librito = new Libro();
        String a, e;
        int i, o;

        Scanner op = new Scanner(System.in);
        System.out.println("Ingresa el Titulo del libro: ");
        a = op.nextLine();
        System.out.println("Ingresa el nombre del Autor: ");
        e = op.nextLine();
        System.out.println("Ingresa el ISBN: ");
        i = op.nextInt();
        System.out.println("Ingresa El numero de paginas: ");
        o = op.nextInt();

        librito.titulo = a;
        librito.autor = e;
        librito.isbn = i;
        librito.numpag = o;

        librito.MostrarTitulo();
        librito.MostarAutor();
        librito.MostrarISBN();
        librito.MostarNumeroDePaginas();
        Libro libro1 = new Libro("el oceano"  ,   "Alfonso"  ,   50  ,   250);

    }
}