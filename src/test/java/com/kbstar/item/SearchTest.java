package com.kbstar.item;

import com.kbstar.dto.ItemSearch;
import com.kbstar.dto.MarkerSearch;
import com.kbstar.service.ItemService;
import com.kbstar.service.MarkerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SearchTest {
    @Autowired
    ItemService service;

    @Test
    void contextLoads() {
        try {
            ItemSearch is = new ItemSearch("이미지",50000000);
            service.search(is);
        } catch (Exception e) {
            log.info("에러...");
            //e.printStackTrace();
        }
    }}
