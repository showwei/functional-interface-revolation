package sw.functional;

import sw.functional.apply.func.FilterFruitHandler;
import sw.functional.model.Fruit;

import java.util.stream.Stream;

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
        double increase =35.0D,feeDiscount = fruit1.getFeeDiscount();
        fruit1 = FilterFruitHandler.getInstance().modifyTheCommissionRate(fruit1,increase,val -> ( 100 - ( val + feeDiscount ) ) / 100 );
        FilterFruitHandler.getInstance().printFee(fruit1);
        FilterFruitHandler.getInstance().printAfterCommissionRate(fruit1);

        Fruit fruit2 = new Fruit("Green","WaterMellon",5000.0D);
        fruit2 = FilterFruitHandler.getInstance().updateFruitFee(fruit2,
                fruit -> fruit.getPrice() > 3000.0D,
                fruit -> fruit.setFeeDiscount(30.0D));
         increase =60.0D;
         double feeDiscount2 = fruit2.getFeeDiscount();
        fruit2 = FilterFruitHandler.getInstance().modifyTheCommissionRate(fruit2,increase,val -> ( 100 - ( val + feeDiscount ) ) / 100);

        FilterFruitHandler.getInstance().printFee(fruit2);
        FilterFruitHandler.getInstance().printAfterCommissionRate(fruit2);


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
