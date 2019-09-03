package com.hz.goods.controller;

import com.hz.goods.service.ItemService;
import com.hz.goods.vo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;


    @ResponseBody
    @RequestMapping("item/{id}")
    public Item queryItemById(@PathVariable("id") Long id) {
        System.err.println("-------goods---------");
        return itemService.queryItemById(id);
    }


    }
