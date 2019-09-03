package com.hz.goods.service;

import com.hz.goods.vo.Item;

public interface ItemService {

    /**
     * 根据id查询商品信息
     * @param id
     * @return
     */
    public Item queryItemById(Long id);
}
