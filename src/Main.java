public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 7;

        suma(a,b,c);

        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();

        System.out.println("Puertas del Coche = " +miCoche.puertas);

    }

    public static void suma(int a, int b, int c) {

        int suma= a + b + c;
        System.out.println("Suma = " +suma);
    }
}

class Coche {
    public int puertas = 0;

    public void AgregarPuertas(){
        this.puertas++;
    }
}