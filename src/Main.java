public class Main {
    public static void main(String[] args) {
        int param1 = 10;
        int param2 = 30;
        int param3 = 10;

        var valor =suma(param1, param2, param3);

        System.out.println(valor);

        Coche miCoche = new Coche();
        miCoche.sumarPuerta();

        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 4;

    public void sumarPuerta() {
        this.puertas++;
    }
}
