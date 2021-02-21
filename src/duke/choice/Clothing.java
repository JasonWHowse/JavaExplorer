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
public class Clothing implements Comparable<Clothing> {
    private String description;
    private String size="M";
    private double price;
    public final static double minimumPrice=10.0;
    public final static double taxRate=0.2;

    Clothing(){}                                                                //constructor

    Clothing(String description){                                               //constructor with description
        this.description=description;
    }//Clothing(String description){

    Clothing(String description,String size){                                   //constructor with description and size by String
        this.description=description;
        this.size=size;
    }//Clothing(String description,String size){

    Clothing(String description,String size,double price){                      //constructor with input values
        this.description=description;
        this.size=size;
        this.price= (price>minimumPrice)?price:minimumPrice;
    }//Clothing(String description,String size,double price){

    Clothing(String description,double price){                                  //constructor with description and price
        this.description=description;
        this.price= (price>minimumPrice)?price:minimumPrice;
    }//Clothing(String description,double price){

    public String getDescription() {                                            //get description
        return description;
    }//public String getDescription() {

    public void setDescription(String description) {                            //sets description
        this.description = description;
    }//public void setDescription(String description) {

    public String getSize() {                                                   //gets size
        return size;
    }//public String getSize() {

    public void setSize(String size) {                                          //sets size
        this.size = size;
    }//public void setSize(String size) {

    public double getPrice() {                                                  //gets price
        return price*(1+taxRate);
    }//public double getPrice() {

    public void setPrice(double price) {                                        //sets price
        this.price= (price>minimumPrice)?price:minimumPrice;
    }//public void setPrice(double price) {

    @Override
    public String toString(){                                                   //overrides toString method outputs all values
        return description+","+size+","+price;
    }//public String toString(){

    @Override
    public int compareTo(Clothing o) {                                          //overrides compareto function for sorting
        return this.description.compareTo(o.getDescription());
    }//public int compareTo(Clothing o) {
}//public class Clothing implements Comparable<Clothing> {