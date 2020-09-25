package com.twuc.shopping.api;

import com.twuc.shopping.repository.GoodsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class GoodsControllerTest {
@Autowired
    MockMvc mockMvc;
@Autowired
    GoodsRepository goodsRepository;

@Test
    public void should_get_goods_list () throws Exception {
    mockMvc.perform(get("/goods/list"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$",hasSize(6)))
            .andExpect(jsonPath("$[0].nameOfGoods", is("可乐1")))
            .andExpect(jsonPath("$[1].nameOfGoods", is("可乐1")))
            .andExpect(jsonPath("$[2].nameOfGoods", is("可乐1")))
            .andExpect(jsonPath("$[3].nameOfGoods", is("可乐1")))
            .andExpect(jsonPath("$[4].nameOfGoods", is("可乐1")))
            .andExpect(jsonPath("$[5].nameOfGoods", is("可乐1")))
            .andExpect(jsonPath("$[0].priceOfGoods", is(1.00d)))
            .andExpect(jsonPath("$[1].priceOfGoods", is(1.00d)))
            .andExpect(jsonPath("$[2].priceOfGoods", is(1.00d)))
            .andExpect(jsonPath("$[3].priceOfGoods", is(1.00d)))
            .andExpect(jsonPath("$[4].priceOfGoods", is(1.00d)))
            .andExpect(jsonPath("$[5].priceOfGoods", is(1.00d)));
}


}