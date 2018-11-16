package products;

public class Product {

    private int dateWhenAvailble;
    private float price;
    private String description;

    public Product(){}
    public Product(int dateWhenAvailble, float price, String description){
        this.dateWhenAvailble = dateWhenAvailble;
        this.price = price;
        this.description = description;
    }


    public float getPrice(){
        return this.price;
    }

    public int getDateWhenAvailble(){
        return this.dateWhenAvailble;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setDateWhenAvailble(int dateWhenAvailble) {
        this.dateWhenAvailble = dateWhenAvailble;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    protected void orderProduct(){
        System.out.println("New product was ordered!");
    }
    protected void orderShipped(){
        System.out.println("Shipping started for your purchase!");
    }

}