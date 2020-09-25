package com.twuc.shopping.service;

import com.twuc.shopping.GoodsDto.GoodsDto;
import com.twuc.shopping.domain.Goods;
import com.twuc.shopping.repository.GoodsRepository;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {
    private GoodsRepository goodsRepository;

    public GoodsService(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    public  void createGood(Goods goods) {
        GoodsDto goodsDto = new GoodsDto(goods.getNameOfGoods(),goods.getPriceOfGoods());
        goodsRepository.save(goodsDto);
    }
}
