package com.twuc.shopping.domain;
import lombok.Data;

@Data
public class Goods {
    private String nameOfGoods;
    private double priceOfGoods;

    public Goods(String nameOfGoods, double priceOfGoods) {
        this.nameOfGoods = nameOfGoods;
        this.priceOfGoods = priceOfGoods;
    }


}
