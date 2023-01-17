public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Ulises");
        cliente.setEdad(24);
        cliente.setTelefono(33105093);
        cliente.setCredito(500.65);

        System.out.println("El nombre del cliente es: "+cliente.getNombre());
        System.out.println("Su edad es: "+cliente.getEdad());
        System.out.println("Su telefono es: "+cliente.getTelefono());
        System.out.println("Su credito disponible es: "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Diego");
        trabajador.setEdad(20);
        trabajador.setTelefono(18980876);
        trabajador.setSalario(1500.65);

        System.out.println("El nombre del trabajador es: "+trabajador.getNombre());
        System.out.println("Su edad es: "+trabajador.getEdad());
        System.out.println("Su telefono es: "+trabajador.getTelefono());
        System.out.println("Su salario es: "+trabajador.getSalario());
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona{
    double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona{
    double salario;

    public Trabajador() {
        System.out.println("______________________________________________________");
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}