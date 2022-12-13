public class Main {
    public static void main(String[] args) {
        Cliente ana = new Cliente();
        ana.edad = 20;
        ana.nombre = "Ana";
        ana.telefono = 234567890;
        ana.credito= 15000;

        Trabajador elena = new Trabajador ();
        elena.edad = 25;
        elena.nombre = "Elena";
        elena.telefono = 897654323;
        elena.salario= 24000;

        System.out.println();
        System.out.println("La cliente se llama " + ana.nombre);
        System.out.println("tiene " + ana.edad + " años");
        System.out.println("su teléfono es " + ana.telefono);
        System.out.println("y tiene un crédito de " + ana.credito + "€");
        System.out.println();
        System.out.println("La trabajadora se llama " + elena.nombre);
        System.out.println("tiene " + elena.edad + " años");
        System.out.println("su teléfono es " + elena.telefono);
        System.out.println("y tiene un salario de " + elena.salario + "€");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(){};

}

class Cliente extends Persona {
    int credito;

    public Cliente(){
        //System.out.println("constructor de Cliente");
    }
}

class Trabajador extends Persona {
    int salario;

    public Trabajador(){
        //System.out.println("constructor de Trabajador");
    }
}
