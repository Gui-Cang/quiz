package com.twuc.shopping.GoodsDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Good")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsDto {
    @Id
    @GeneratedValue
    private int id;

    private String nameOfGoods;
    private double priceOfGoods;

    public GoodsDto(String nameOfGoods, double priceOfGoods) {
        this.nameOfGoods = nameOfGoods;
        this.priceOfGoods = priceOfGoods;

    }
}
