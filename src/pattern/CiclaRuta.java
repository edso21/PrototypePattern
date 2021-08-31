
package pattern;

public class CiclaRuta extends Cicla{
    
    private boolean fibraCarbon;
    
    public CiclaRuta(){}
    
    private CiclaRuta(CiclaRuta cr){
        super(cr);
        this.fibraCarbon=cr.fibraCarbon;
    }
    
    @Override
    public Cicla clonar() {
        return new CiclaRuta(this);
    }

     public boolean isFibraCarbon() {
        return fibraCarbon;
    }

    public void setFibraCarbon(boolean fibraCarbon) {
        this.fibraCarbon = fibraCarbon;
    }
    
    
}
