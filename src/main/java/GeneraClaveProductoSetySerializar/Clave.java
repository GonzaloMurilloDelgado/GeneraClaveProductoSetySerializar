package GeneraClaveProductoSetySerializar;

public class Clave {
    private String clave;

    public Clave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String toString() {
        return clave;
    }

    public int hashCode() {
        return (this.clave).hashCode();
    }
}