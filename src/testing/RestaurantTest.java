package testing;

import testing.RestaurantDish;

public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();

        dish.setCostInCents(200);
        dish.setNameOfDish("French Fry");
        dish.setWouldRecommend(true);
        dish.eat();
        System.out.format("%s costs %d pennies. %b, I would recommend it! ", dish.getNameOfDish(), dish.getCostInCents(), dish.isWouldRecommend());

    }
}
