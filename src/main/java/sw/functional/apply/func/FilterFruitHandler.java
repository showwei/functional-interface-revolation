package sw.functional.apply.func;

import sw.functional.model.Fruit;

import java.text.MessageFormat;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterFruitHandler {

    private volatile static FilterFruitHandler instance = null;

    public static synchronized FilterFruitHandler getInstance() {
        if (instance == null) {
            instance = new FilterFruitHandler();
        }
        return instance;
    }

    public Fruit updateFruitFee(Fruit fruit, Predicate<Fruit> predicate, Consumer<Fruit> consumer) {
        if (predicate.test(fruit))
            consumer.accept(fruit);
        return fruit;
    }

    public void printFee(Fruit fruit){

        Double newFee = fruit.getBaseFee() - ((fruit.getBaseFee() * fruit.getFeeDiscount()) / 100);

        System.out.println(MessageFormat.format("The {0} color is {1} and fee after discount: {2} " ,new Object[]{fruit.getName(),fruit.getColor(),newFee}));

    }
}
