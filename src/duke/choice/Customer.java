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

    Customer(String name){
        this.name=name;
    }//Customer(String name){

    Customer(String name, String size){
        this.name=name;
        this.size=size;
    }//Customer(String name, String size){

    Customer(String name, int measure){
        this.name=name;
        setSize(measure);
    }//Customer(String name, int measure){

    public String getName() {
        return name;
    }//public String getName() {

    public String getSize() {
        return size;
    }//public String getSize() {

    public void setSize(String size) {
        this.size = size;
    }//public void setSize(String size) {

    public void setSize(int measure){
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

    public Clothing[] getItems() {
        return items;
    }//public Clothing[] getItems() {

    public void setItems(Clothing[] items) {
        this.items = items;
    }//public void setItems(Clothing[] items) {

    public double averagePrice(String aSize){
        int count=0;
        int total=0;
        for(Clothing item: items){
            if(item.getSize().equals(aSize)){
                count++;
                total+=item.getPrice();
            }//if(item.getSize().equals(aSize)){
        }//for(Clothing item: items){
        return (count==0)?0:total/count;
    }//public double averagePrice(String aSize){

    public double getTotalClothingCost(){
        double total=0.0;
        for(Clothing clothe : items){
            if(size.equals(clothe.getSize())){
                total+=clothe.getPrice();
            }//if(size.equals(clothe.getSize())){
        }//for(Clothing clothe : items){
        return total;
    }//public double getTotalClothingCost(){
}//public class Customer {