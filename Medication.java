// Sheri Evangelene
//JAVA midterm Sprint
//JUne 2026

import java.util.Date;

public class Medication {
    private int id;
    private String name;
    private String dose;
    private int quantity;
    private Date expiryDate;

    public Medication(int id, String name, String dose, int quantity, Date date){
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantity = quantity;
        this.expiryDate = date;
}

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDose(){
        return this.dose;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public Date getExpiryDate(){
        return this.expiryDate;
    }

    public void setId( int id){
       this.id = id; 
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDose(String dose){
        this.dose = dose;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setDate(Date date){
        this.expiryDate = date;
    }

    public String toString(){
        return (" Id: " + id + "\n Name: " + name + "\n Doseage: " + dose + "\n Quantity: " + quantity + "\n Expiry Date: " + expiryDate +"\n");
    }
}
