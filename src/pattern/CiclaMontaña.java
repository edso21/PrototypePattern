
package pattern;

public class CiclaMontaña extends Cicla{
 

    public CiclaMontaña(){}
    
    private CiclaMontaña(CiclaMontaña cm){
        super(cm);
       
    }
    
    @Override
    public Cicla clonar() {
        return new CiclaMontaña(this);
    }

}


