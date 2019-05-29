
package clases;


public abstract class Person{
    private final int ID;
    private static int idCounter=0;
    private String name;
    private String surName;
    private int age;
    private String email;
    private Residence residence;

    public Person() {
        this.ID = (idCounter+=1);
        this.name = "";
        this.surName = "";
        this.age = 0;
        this.email = "";
        this.residence = null;
        
    }

    public Person(String name, String surName, int age, String email, Residence residence) {
        this.ID = (idCounter+=1);
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.email = email;
        this.residence = new Residence(residence);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Residence getResidence() {
        return residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }
    
    
    
}
