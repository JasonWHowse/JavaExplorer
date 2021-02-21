/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author opc
 */
public class ShopApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer c1=new Customer("Pinky",3);
        System.out.println("Welcome to Duke Choice Shop, "+c1.getName());

        Clothing[] items=new Clothing[4];

        items[0]=new Clothing("Blue Jacket","M",20.9);
        items[1]=new Clothing("Orange T-Shirt","S",10.5);
        items[2]=new Clothing("Green Scarf","S",5.0);
        items[3]=new Clothing("Blue T-Shirt","S",10.5);

        c1.setItems(items);

        for(Clothing cloth: c1.getItems()){
            if(c1.getSize().equals(cloth.getSize())){
                System.out.println(cloth.getDescription()+","+cloth.getSize()+","+cloth.getPrice());
            }//if(c1.getSize().equals(cloth.getSize())){
        }//for(Clothing cloth: c1.getItems()){
        System.out.println(c1.averagePrice("L"));
        System.out.println(c1.averagePrice("S"));
        System.out.println(c1.getTotalClothingCost());
    }//public static void main(String[] args) {
}//public class ShopApp {