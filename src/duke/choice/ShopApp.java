/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

import java.util.Arrays;

/**
 *
 * @author opc
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer c1=new Customer("Pinky",3);                                    //Creates a new customer
        System.out.println("Welcome to Duke Choice Shop, "+c1.getName());       //tests get name

        Clothing[] items=new Clothing[4];                                       //creates a new clothing list

        items[0]=new Clothing("Blue Jacket","M",20.9);                          //adds new clothing item
        items[1]=new Clothing("Orange T-Shirt","S",10.5);                       //adds new clothing item
        items[2]=new Clothing("Green Scarf","S",5.0);                           //adds new clothing item
        items[3]=new Clothing("Blue T-Shirt","S",10.5);                         //adds new clothing item

        c1.setItems(items);                                                     //inserts list into customer object

        for(Clothing cloth: c1.getItems()){                                     //checks list
            System.out.println(cloth);
        }//for(Clothing cloth: c1.getItems()){

        Arrays.sort(c1.getItems());                                             //sorts list utilizing the clothing comparable/compareTo function

        for(Clothing cloth: c1.getItems()){                                     //checks list if sort worked
            System.out.println(cloth);
        }//for(Clothing cloth: c1.getItems()){

        System.out.println(c1.averagePrice("L"));                               //checks if 0 items in average
        System.out.println(c1.averagePrice("S"));                               //check if average works
        System.out.println(c1.getTotalClothingCost());                          //shows total cost
    }//public static void main(String[] args) {
}//public class ShopApp {