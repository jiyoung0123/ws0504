package com.kbstar.service;

import com.kbstar.dto.Cart;
import com.kbstar.frame.KBService;
import com.kbstar.mapper.CartMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CartService implements KBService<Integer, Cart> {
    @Autowired
    CartMapper mapper;
    /**
     * 등록 및 가입 진행
     * argument : Object
     * return : null
     *
     * @param cart
     */
    @Override
    public void register(Cart cart) throws Exception {
        mapper.insert(cart);
    }

    @Override
    public void remove(Integer s) throws Exception {
        mapper.delete(s);
    }

    @Override
    public void modify(Cart cart) throws Exception {
        mapper.update(cart);
    }

    @Override
    public Cart get(Integer s) throws Exception {
        return mapper.select(s);
    }
    @Override
    public List<Cart> get() throws Exception {
        return mapper.selectall();
    }

    public List<Cart> getMyCart(String cid)throws Exception{
        return mapper.getmycart(cid);
    }
}
