package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService  {

    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);

    //Add stock
    void increaseStock(List<CartDTO> cartDTOList);

    //delete stock
    void decreaseStock(List<CartDTO> cartDTOList);

}
