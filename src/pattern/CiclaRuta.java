
package pattern;

public class CiclaRuta extends Cicla{

    
    public CiclaRuta(){}
    
    private CiclaRuta(CiclaRuta cr){
        super(cr);
    }
    
    @Override
    public Cicla clonar() {
        return new CiclaRuta(this);
    }

    
    
}
