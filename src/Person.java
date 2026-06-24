package src;
//Sheri Evangelene
//JAVA midterm Sprint
//JUne 2026

public class Person {
    private int id;
    private String name;
    private int age;
    private String phoneNumber;

    public Person(){}

    public Person (int id, String name, int age, String phoneNumber){
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return ("id: " + id + "\nName: " + name + "\nAge: " + age + "\nPhone Number: " + phoneNumber + "\n");
    }
}
