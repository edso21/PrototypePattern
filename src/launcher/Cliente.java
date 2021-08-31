
package launcher;

import pattern.CiclaMontaña;
import pattern.CiclaRuta;

public class Cliente {
    public static void main (String[]args){
        CiclaRuta ciclaRuta1=new CiclaRuta();
        ciclaRuta1.setCambios("shimano");
        ciclaRuta1.setFrenos("hidraulicos");
        ciclaRuta1.setMarca("GW");
        ciclaRuta1.setPrecio(1990000);
        ciclaRuta1.setLlantas("Kenda, 700x25C");
        ciclaRuta1.setFibraCarbon(false);
        
        CiclaRuta ciclaRuta2= (CiclaRuta)ciclaRuta1.clonar();
        ciclaRuta2.setMarca("Specialized");
        ciclaRuta2.setPrecio(4245000);
        ciclaRuta2.setLlantas("Ruedas axis sports 700");
        ciclaRuta2.setFibraCarbon(true);
        
        
        CiclaMontaña ciclaMontaña1=new CiclaMontaña();
        ciclaMontaña1.setCambios("Shimano EZ-Fire 24 velocidades");
        ciclaMontaña1.setFrenos("De disco mecanico");
        ciclaMontaña1.setMarca("Schwinn");
        ciclaMontaña1.setPrecio(6912000);
        ciclaMontaña1.setLlantas("29-Inch");
        ciclaMontaña1.setSuspension("Full Dual");
        
        CiclaMontaña ciclaMontaña2= (CiclaMontaña)ciclaMontaña1.clonar();
        ciclaMontaña2.setPrecio(3822386);
        ciclaMontaña2.setLlantas("27.5-Inch");
        ciclaMontaña2.setCambios("shimano ez-fire 21 velocidades" );
        
        System.out.println("\033[31m**Ciclas de Ruta** \n");
        System.out.println("\u001B[35mCicla #1 \n");
        System.out.println("Cambios: "+ciclaRuta1.getCambios());
        System.out.println("Frenos: "+ciclaRuta1.getFrenos());
        System.out.println("Llantas: "+ciclaRuta1.getLlantas());
        System.out.println("Marca: "+ciclaRuta1.getMarca());
        System.out.println("Precio: "+ciclaRuta1.getPrecio());
        System.out.println("Fibra de carbon: "+ciclaRuta1.isFibraCarbon());
        
        
        System.out.println("\n\u001B[35mCicla #2 \n");
        System.out.println("Cambios: "+ciclaRuta2.getCambios());
        System.out.println("Frenos: "+ciclaRuta2.getFrenos());
        System.out.println("Llantas: "+ciclaRuta2.getLlantas());
        System.out.println("Marca: "+ciclaRuta2.getMarca());
        System.out.println("Precio: "+ciclaRuta2.getPrecio());
        System.out.println("Fibra de carbon: "+ciclaRuta2.isFibraCarbon());
        
         System.out.println("\n\033[31m**Ciclas de Montaña** \n");
        System.out.println("\u001B[35mCicla #1 \n");
        System.out.println("Cambios: "+ciclaMontaña1.getCambios());
        System.out.println("Frenos: "+ciclaMontaña1.getFrenos());
        System.out.println("Llantas: "+ciclaMontaña1.getLlantas());
        System.out.println("Marca: "+ciclaMontaña1.getMarca());
        System.out.println("Precio: "+ciclaMontaña1.getPrecio());
        System.out.println("Suspension: "+ciclaMontaña1.getSuspension());
        
        System.out.println("\n\033[35mCicla #2 \n");
        System.out.println("Cambios: "+ciclaMontaña2.getCambios());
        System.out.println("Frenos: "+ciclaMontaña2.getFrenos());
        System.out.println("Llantas: "+ciclaMontaña2.getLlantas());
        System.out.println("Marca: "+ciclaMontaña2.getMarca());
        System.out.println("Precio: "+ciclaMontaña2.getPrecio());
        System.out.println("Suspension: "+ciclaMontaña2.getSuspension());

    }
    
}
