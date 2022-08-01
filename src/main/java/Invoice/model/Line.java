/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Invoice.model;

/**
 *
 * @author sony
 */
public class Line {
    private String item;
    private double price;
    private int count;
    private Invoice invoice;

    public Line(String item, double price, int count, Invoice invoice) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
    public double getTotal(){
        return getCount() * getPrice();
    }
}
