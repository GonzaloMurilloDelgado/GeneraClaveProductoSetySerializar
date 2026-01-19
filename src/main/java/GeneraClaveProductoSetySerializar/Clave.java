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

    public boolean equals(Object clv) {
        boolean igual = false;
        if (clv != null && getClass() == clv.getClass()) {
            Clave clave = (Clave) clv;
            if (this.clave.equals(clave.clave)) {
            igual = true;
            }
        }
        return igual;
    }
}