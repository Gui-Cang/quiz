package com.twuc.shopping.service;

import com.twuc.shopping.GoodsDto.GoodsDto;
import com.twuc.shopping.domain.Goods;
import com.twuc.shopping.repository.GoodsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

class GoodsServiceTest {
    GoodsService goodsService;
    @Mock
    GoodsRepository goodsRepository;

    @BeforeEach
    void setUp() {
        initMocks(this);
        goodsService = new GoodsService(goodsRepository);
    }

    @Test
    void  should_create_good(){
        Goods goods = new Goods("可乐2", 2.00d);
        GoodsDto goodsDto = new GoodsDto(goods.getNameOfGoods(),goods.getPriceOfGoods());

        goodsService.createGood(goods);

        verify(goodsRepository).save(goodsDto);
    }
}