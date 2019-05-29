
package clases;


public class Residence {
    private String country;
    private String city;
    private String postalCode;
    private String domicile;
    private final int ID;
    private static int idCounter=0;
    
    public Residence() {
        this.ID = (idCounter+=1);
        country = "";
        city = "";
        postalCode = "";
        domicile = "";
    }

    public Residence(String country, String city, String postalCode, String domicile, int ID) {
        this.ID = (idCounter+=1);
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.domicile = domicile;
        
    }

    public Residence (Residence residence){
        this.ID = residence.getID();
        this.country = residence.getCountry();
        this.city = residence.getCity();
        this.postalCode = residence.getPostalCode();
        this.domicile = residence.getPostalCode();
        
    }
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public int getID() {
        return ID;
    }
    
    
    
}
