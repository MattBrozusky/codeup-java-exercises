package testing;

import testing.BurgerTools;

public class BurgerTester {
    public static void main(String[] args) {

//        testing.BurgerTools burger1 = new testing.BurgerTools("cheese", 2012, 165);
        BurgerTools.mostPopularTopping = "Cheese";
        BurgerTools.averageDaysBeforeExpiration = 10;
        BurgerTools.temperatureWhenCooked = 165;
        System.out.println(BurgerTools.mostPopularTopping);
    }


//        Create a class called testing.BurgerTester to test assigning and printing property values
//        and testing methods.
//
//        If you have time, add additional properties and methods.
}
