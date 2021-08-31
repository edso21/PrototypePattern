
package pattern;

public class CiclaMontaña extends Cicla{
 
    
    public CiclaMontaña(){}
    private String suspension;
    
    private CiclaMontaña(CiclaMontaña cm){
        super(cm);
       this.suspension=cm.suspension;
    }
    
    @Override
    public Cicla clonar() {
        return new CiclaMontaña(this);
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }
    
}


