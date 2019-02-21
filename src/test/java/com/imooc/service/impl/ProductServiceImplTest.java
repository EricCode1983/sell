package com.imooc.service.impl;

import ch.qos.logback.core.util.SystemInfo;
import com.imooc.dataobject.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;


    @Test
    public void findOne() {
         ProductInfo productInfo=    productService.findOne(1);
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findUpAll() {

      List<ProductInfo> productInfoList= productService.findUpAll();
      Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() {
        PageRequest request=PageRequest.of(0,2);
        Page<ProductInfo> productInfoPage= productService.findAll(request);
        System.out.println(productInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("3");
        productInfo.setProductName("crab");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的虾");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        productInfo.setCategoryType(2);

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }
}