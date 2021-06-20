package sw.functional;

import sw.functional.apply.func.FilterFruitHandler;
import sw.functional.model.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class BootApplication {
    public BootApplication() {
    }

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        List<String> giveaway=new ArrayList<>(
                Arrays.asList(
                        new String[] {
                                "Tomato",
                                "Strawberry",
                                "Orange",
                                "Sunkist",
                                "Mandarin Orange",
                                "Guava",
                                "Pineapple",
                                "Lemon",
                                "Kiwifruit",
                                "Apple"
                        }
                )
        );

        Fruit fruit1 = new Fruit("Yellow","A bunch of the Bananas",3000.0D);

        fruit1 = FilterFruitHandler.getInstance().updateFruitFee(fruit1,
                fruit -> fruit.getPrice() > 2500.0D,
                fruit -> fruit.setFeeDiscount(50.0D));
        double increase =35.0D,feeDiscount = fruit1.getFeeDiscount();
        fruit1 = FilterFruitHandler.getInstance().modifyTheCommissionRate(fruit1,increase,val -> ( 100 - ( val + feeDiscount ) ) / 100 );
        fruit1 = FilterFruitHandler.getInstance().chooseGiveawayCompain(fruit1,()-> giveaway.get((int)(Math.random() * 10)));
        FilterFruitHandler
                .getInstance()
                .printFee(fruit1)
                .printAfterCommissionRate(fruit1)
                .printFreebieGiveAway(fruit1);


        Fruit fruit2 = new Fruit("Green","A box of the WaterMellon",5000.0D);
        fruit2 = FilterFruitHandler.getInstance().updateFruitFee(fruit2,
                fruit -> fruit.getPrice() > 3000.0D,
                fruit -> fruit.setFeeDiscount(30.0D));
         increase =60.0D;
         double feeDiscount2 = fruit2.getFeeDiscount();
        fruit2 = FilterFruitHandler.getInstance().modifyTheCommissionRate(fruit2,increase,val -> ( 100 - ( val + feeDiscount ) ) / 100);
        fruit2 = FilterFruitHandler.getInstance().chooseGiveawayCompain(fruit2,()-> giveaway.get((int)(Math.random() * 10)));

        FilterFruitHandler
                .getInstance()
                .printFee(fruit2)
                .printAfterCommissionRate(fruit2)
                .printFreebieGiveAway(fruit2);


        System.out.println(new BootApplication().getGreeting());
//
//        int[] fibs = {0, 1};
//        Stream<Integer> fibonacci = Stream.generate(() -> {
//            int result = fibs[1];
//            int fib3 = fibs[0] + fibs[1];
//            fibs[0] = fibs[1];
//            fibs[1] = fib3;
//            return result;
//        });
//
//        fibonacci.forEach(System.out::println);
    }




}
