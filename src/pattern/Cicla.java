
package pattern;

public abstract class Cicla {
    private String llantas;
    private String cambios;
    private String frenos;
    private String marca;
    private int precio;

    public Cicla (){}
    protected Cicla (Cicla c){
        this.llantas=c.llantas;
        this.cambios=c.cambios;
        this.frenos=c.frenos;
        this.marca=c.marca;
        this.precio=c.precio;
        
    }
    
    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract Cicla clonar();
    
    
}
