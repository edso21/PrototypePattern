
package launcher;

import pattern.CiclaRuta;

public class Cliente {
    public static void main (String[]args){
        CiclaRuta ciclaRuta1=new CiclaRuta();
        ciclaRuta1.setCambios("shimano");
        ciclaRuta1.setFrenos("hidraulicos");
        ciclaRuta1.setMarca("GW");
        ciclaRuta1.setPrecio(1990000);
        ciclaRuta1.setLlantas("Kenda, 700x25C");
        
        CiclaRuta ciclaRuta2= (CiclaRuta)ciclaRuta1.clonar();
        ciclaRuta2.setMarca("Specialized");
        ciclaRuta2.setPrecio(4245000);
        ciclaRuta2.setLlantas("Ruedas axis sports 700");
        
        System.out.println("\033[31m**Ciclas de Ruta** \n");
        System.out.println("\u001B[35mCicla #1 \n");
        System.out.println("Cambios: "+ciclaRuta1.getCambios());
        System.out.println("Frenos: "+ciclaRuta1.getFrenos());
        System.out.println("Llantas: "+ciclaRuta1.getLlantas());
        System.out.println("Marca: "+ciclaRuta1.getMarca());
        System.out.println("Precio: "+ciclaRuta1.getPrecio());

    }
    
}
