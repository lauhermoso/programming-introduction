public class Main {
    public static void main(String[] args) {
        Persona ana = new Persona();
        ana.setEdad(20);
        ana.setNombre("Ana");
        ana.setTelefono(234343434);

        System.out.println(ana.getEdad());
        System.out.println(ana.getNombre());
        System.out.println(ana.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;


    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad (){
        return this.edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
    public int getTelefono (){
        return this.telefono;
    }
}
