package sw.functional;

import sw.functional.apply.func.FilterFruitHandler;
import sw.functional.model.Fruit;

public class BootApplication {
    public BootApplication() {
    }

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Yellow","Banana",3000.0D);

        fruit1 = FilterFruitHandler.getInstance().updateFruitFee(fruit1,
                fruit -> fruit.getPrice() > 2500.0D,
                fruit -> fruit.setFeeDiscount(50.0D));

        FilterFruitHandler.getInstance().printFee(fruit1);

        Fruit fruit2 = new Fruit("Green","WaterMellon",5000.0D);
        fruit2 = FilterFruitHandler.getInstance().updateFruitFee(fruit2,
                fruit -> fruit.getPrice() > 3000.0D,
                fruit -> fruit.setFeeDiscount(30.0D));
        FilterFruitHandler.getInstance().printFee(fruit2);



        System.out.println(new BootApplication().getGreeting());
    }




}
