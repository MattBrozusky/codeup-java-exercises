package products;

public class Subscription extends Product {

    private int lengthOfSubscription;




    public int getLengthOfSubscription(){
        return this.lengthOfSubscription;
    }
    public void setLengthOfSubscription(int lengthOfSubscription){
        this.lengthOfSubscription = lengthOfSubscription;
    }


    protected void orderProduct() {
        System.out.println("Subscription is activated!");
    }

    protected void newProductOrder(){
        super.orderProduct();
    }
}
