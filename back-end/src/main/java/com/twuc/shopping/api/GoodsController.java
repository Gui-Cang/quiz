package com.twuc.shopping.api;

import com.twuc.shopping.domain.Goods;
import com.twuc.shopping.service.GoodsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class GoodsController {
    GoodsService goodsService;
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    private List<Goods> goods = initGoods();

    private List<Goods> initGoods() {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("可乐1", 1.00));
        goodsList.add(new Goods("可乐2", 1.00));
        goodsList.add(new Goods("可乐3", 1.00));
        goodsList.add(new Goods("可乐4", 1.00));
        goodsList.add(new Goods("可乐5", 1.00));
        goodsList.add(new Goods("可乐6", 1.00));

        return goodsList;
    }

    @GetMapping("/goods/list")
    public List<Goods> getGoodsBetween
            (@RequestParam(required = false) Integer start, @RequestParam(required = false) Integer end)
    {
        return goods.subList(start - 1, end);
    }

}
