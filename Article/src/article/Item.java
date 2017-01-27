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
    public static void main(String[] args) {//Main
        Article item = new Article (000000000,00,00.00,00.00,"No description");
        //Llamar
        item.purchase(0,00.00);
        item.sale(0);
        item.checkExistence();
        item.updatePrice(0.00);
   
    }
}
