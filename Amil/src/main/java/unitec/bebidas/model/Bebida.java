package unitec.bebidas.model;

public class Bebida {
    private String tipo;
    private String nombre;

    @Override
    public String toString() {
        return "Bebida{" + "tipo=" + tipo + ", nombre=" + nombre + '}';
    }

    public Bebida() {
    }

    public Bebida(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}