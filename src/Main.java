public class Main {
    public static void main(String[] args) {
        int numeroif = 4;

        if (numeroif > 0) {
            System.out.println("Es positivo");
        } else if (numeroif < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }
        int numerowhile = 0;

        while (numerowhile < 3) {
            System.out.println(numerowhile);
            numerowhile = numerowhile + 1;
        }

        int numerodowhile = 2;

        do {
            System.out.println(numerodowhile);
            numerodowhile = numerodowhile + 1;
        } while (numerodowhile < 3);

        for(int numerofor = 0; numerofor <= 3; numerofor = numerofor + 1) {
            System.out.println (numerofor);
        }

        var estacion= "otoño";

        switch(estacion) {
            case "invierno":
                System.out.println("es invierno");
                break;
            case "verano":
                System.out.println("es verano");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            default:
                System.out.println("estoy en default");

        }
    }
}
