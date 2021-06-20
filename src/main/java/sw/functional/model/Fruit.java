package sw.functional.model;

public class Fruit {
    String color;

    String name;

    Double price;

    Double feeDiscount = 0.0D;

    Double baseFee = 5000.0D;

    Double commissionRate = 0.0D;

    String freebieGiveaway = "";

    public Fruit(String color, String name, Double price) {
        this.color = color;
        this.name = name;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getFeeDiscount() {
        return feeDiscount;
    }

    public void setFeeDiscount(Double feeDiscount) {
        this.feeDiscount = feeDiscount;
    }

    public Double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(Double baseFee) {
        this.baseFee = baseFee;
    }

    public Double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String getFreebieGiveaway() {
        return freebieGiveaway;
    }

    public void setFreebieGiveaway(String freebieGiveaway) {
        this.freebieGiveaway = freebieGiveaway;
    }
}
