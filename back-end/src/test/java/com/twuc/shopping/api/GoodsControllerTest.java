package com.twuc.shopping.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twuc.shopping.GoodsDto.GoodsDto;
import com.twuc.shopping.domain.Goods;
import com.twuc.shopping.repository.GoodsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
            .andExpect(jsonPath("$[1].nameOfGoods", is("可乐2")))
            .andExpect(jsonPath("$[2].nameOfGoods", is("可乐3")))
            .andExpect(jsonPath("$[3].nameOfGoods", is("可乐4")))
            .andExpect(jsonPath("$[4].nameOfGoods", is("可乐5")))
            .andExpect(jsonPath("$[5].nameOfGoods", is("可乐6")))
            .andExpect(jsonPath("$[0].priceOfGoods", is(1.00d)))
            .andExpect(jsonPath("$[1].priceOfGoods", is(1.00d)))
            .andExpect(jsonPath("$[2].priceOfGoods", is(1.00d)))
            .andExpect(jsonPath("$[3].priceOfGoods", is(1.00d)))
            .andExpect(jsonPath("$[4].priceOfGoods", is(1.00d)))
            .andExpect(jsonPath("$[5].priceOfGoods", is(1.00d)));
}

    @Test
    public void should_add_new_good () throws Exception {
        Goods goods = new Goods("可乐3",3.00d);
        ObjectMapper objectMapper = new ObjectMapper();
        String added = objectMapper.writeValueAsString(goods);

        mockMvc.perform(post("/goods").content(added).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
        List<GoodsDto> all = goodsRepository.findAll();
        GoodsDto goodsDto = all.get(0);

        assertEquals(1, all.size());
        assertEquals(goodsDto.getNameOfGoods(),goods.getNameOfGoods());
        assertEquals(goodsDto.getPriceOfGoods(),goods.getPriceOfGoods());
    }

}