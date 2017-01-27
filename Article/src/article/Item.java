/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package article;

/**
 *
 * @author DianaAlessa
 */
public class Item {
    public static void main(String[] args) {
        //Instancia de la clase Artículo
        Article telefono = new Article(000000000,00,120899,11500.00,"Iphone 6s 16Gb");
        
        //Compra de 50 teléfonos
        telefono.purchase(50, 9890);
        
        //Muestra la existencia en almacén
        System.out.println("La existencia en almacén del artículo es " + 
                            telefono.checkExistence());
       
        //Se realiza una venta
        System.out.println("Se venden 15 teléfonos");
        telefono.sale(15);
        System.out.println("La nueva existencia después de la venta es "+
                            telefono.checkExistence());
        
        //Se realiza actualización de precios
        System.out.println("Hay una promo, y el nuevo precio es $10,000.00");
        telefono.updatePrice(10000.00);
    } 
}
