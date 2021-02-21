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
public class Customer {
    private String name;
    private String size;
    private Clothing[] items;

    Customer(){}                                                                //constructor

    Customer(String name){                                                      //constructor with name
        this.name=name;
    }//Customer(String name){

    Customer(String name, String size){                                         //Constructor with name and size name
        this.name=name;
        this.size=size;
    }//Customer(String name, String size){

    Customer(String name, int measure){                                         //Constructor with name and size number
        this.name=name;
        setSize(measure);
    }//Customer(String name, int measure){

    public void setName(String name){                                           //sets customer name
        this.name=name;
    }

    public String getName() {                                                   //gets customer name
        return name;
    }//public String getName() {

    public String getSize() {                                                   //gets customer size
        return size;
    }//public String getSize() {

    public void setSize(String size) {                                          //sets size by name
        this.size = size;
    }//public void setSize(String size) {

    public void setSize(int measure){                                           //sets size by int and converts to String
        switch(measure){
            case 1:case 2:case 3:
                size="S";
                break;
            case 4:case 5:case 6:
                size="M";
                break;
            case 7:case 8:case 9:
                size="L";
                break;
            default:
                size="XL";
        }//switch(measure){
    }//public void setSize(int measure){

    public Clothing[] getItems() {                                              //gets clothing list
        return items;
    }//public Clothing[] getItems() {

    public void setItems(Clothing[] items) {                                    //sets the list of clothing
        this.items = items;
    }//public void setItems(Clothing[] items) {

    public double averagePrice(String aSize){                                   //gets the average price of the clothes by a size
        int count=0;
        int total=0;
        for(Clothing item: items){
            if(item.getSize().equals(aSize)){
                count++;
                total+=item.getPrice();
            }//if(item.getSize().equals(aSize)){
        }//for(Clothing item: items){
        return (count==0)?0:total/count;                                        //if check, if the count is 0 then returns 0 otherwise calculates the average
    }//public double averagePrice(String aSize){

    public double getTotalClothingCost(){                                       //gets the total clothing cost
        double total=0.0;
        for(Clothing clothe : items){
            total+=clothe.getPrice();
        }//for(Clothing clothe : items){
        return total;
    }//public double getTotalClothingCost(){
}//public class Customer {