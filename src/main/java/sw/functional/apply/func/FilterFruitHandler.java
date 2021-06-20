package sw.functional.apply.func;

import sw.functional.model.Fruit;

import java.text.MessageFormat;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

    public Fruit modifyTheCommissionRate(Fruit fruit ,double valueToBeOperated, Function<Double,Double> function) {
        fruit.setCommissionRate(function.apply(valueToBeOperated));
        return fruit;
    }

    public Fruit chooseGiveawayCompain(Fruit fruit, Supplier<String> supplier) {
        String giveaway = supplier.get();
        System.out.println(MessageFormat.format("We see you choose the {0} gift.",giveaway));
        fruit.setFreebieGiveaway(giveaway);
        return fruit;
    }

    public FilterFruitHandler printFee(Fruit fruit){

        Double newFee = fruit.getBaseFee() - ((fruit.getBaseFee() * fruit.getFeeDiscount()) / 100);

        System.out.println(MessageFormat.format("{0} color is {1} and fee after discount: {2} " ,new Object[]{fruit.getName(),fruit.getColor(),newFee}));
        return this;
    }

    public FilterFruitHandler printAfterCommissionRate(Fruit fruit) {
        Double newBaseFee = fruit.getBaseFee() - ((fruit.getBaseFee() * fruit.getFeeDiscount()) / 100);
        Double newPrice = fruit.getPrice() - (fruit.getPrice() * fruit.getCommissionRate());
        System.out.println(MessageFormat.format("{0} sell price is {1}",fruit.getName(),(newBaseFee+newPrice)));
        return this;
    }

    public FilterFruitHandler printFreebieGiveAway(Fruit fruit) {

        System.out.println(MessageFormat.format("Have a nice day.We had prepare the {0} giveaway to you. Please come again.",fruit.getFreebieGiveaway()));
        return this;
    }
}
