/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Invoice.model;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author sony
 */
public class Invoice {
    private int num;
    private String customer;
    private Date date;
    private ArrayList<Line> Lines;

    public Invoice(int num, String customer, Date date) {
        this.num = num;
        this.customer = customer;
        this.date = date;
    }
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Line> getLines() {
        if (Lines == null){
            Lines = new ArrayList<>();
        }
    
        return Lines;
    }

    public void setLines(ArrayList<Line> Lines) {
        this.Lines = Lines;
    }
    
    public double getTotal(){
        double total = 0.0;
        for (Line line : getLines()){
            total += line.getTotal();
        }
        return total;
    }
     
    
}
