package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findById(1).orElse(null);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory =new ProductCategory();
        productCategory.setCategoryName("favourite");
        productCategory.setCategoryType(3);
        Date date=new Date();
        productCategory.setCreateTime(date);
        productCategory.setUpdateTime(date);
        repository.save(productCategory);
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory =new ProductCategory();
        productCategory= repository.findById(2).orElse(null);
        productCategory.setCategoryName("female favourite");
        repository.save(productCategory);
    }

}