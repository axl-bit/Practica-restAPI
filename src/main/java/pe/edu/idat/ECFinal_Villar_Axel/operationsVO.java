package pe.edu.idat.ECFinal_Villar_Axel;

public class operationsVO {
    
    private int id;
    private String client;
    private String creditcard_number;
    private String creditcard_type;
    private double amount;
    private String currency;
    private String commerce;
    private String country;

    public operationsVO() {
    }

    public operationsVO(String client, String creditcard_number, String creditcard_type, double amount, String currency, String commerce, String country) {
        this.client = client;
        this.creditcard_number = creditcard_number;
        this.creditcard_type = creditcard_type;
        this.amount = amount;
        this.currency = currency;
        this.commerce = commerce;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getCreditcard_number() {
        return creditcard_number;
    }

    public void setCreditcard_number(String creditcard_number) {
        this.creditcard_number = creditcard_number;
    }

    public String getCreditcard_type() {
        return creditcard_type;
    }

    public void setCreditcard_type(String creditcard_type) {
        this.creditcard_type = creditcard_type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCommerce() {
        return commerce;
    }

    public void setCommerce(String commerce) {
        this.commerce = commerce;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
    
    
    
    
}
