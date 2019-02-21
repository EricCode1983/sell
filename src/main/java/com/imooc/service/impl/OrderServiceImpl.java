package com.imooc.service.impl;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.OrderDTO;
import com.imooc.service.OrderService;
import com.imooc.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import sun.security.util.KeyUtil;

import java.math.BigDecimal;
import java.math.BigInteger;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;

    @Override
    @Transactional
    public OrderDTO create(OrderDTO orderDTO) {

//        String orderId = KeyUtil.genUniqueKey();
//        BigDecimal orderAmount = new BigDecimal(BigInteger.ZERO);
//
////        List<CartDTO> cartDTOList = new ArrayList<>();
//
//        //1. 查询商品（数量, 价格）
//        for (OrderDetail orderDetail: orderDTO.getOrderDetailList()) {
//            ProductInfo productInfo =  productService.findOne(orderDetail.getProductId());
//            if (productInfo == null) {
//                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
//            }
//
//            //2. 计算订单总价
//            orderAmount = productInfo.getProductPrice()
//                    .multiply(new BigDecimal(orderDetail.getProductQuantity()))
//                    .add(orderAmount);
//
//            //订单详情入库
//            orderDetail.setDetailId(KeyUtil.genUniqueKey());
//            orderDetail.setOrderId(orderId);
//            BeanUtils.copyProperties(productInfo, orderDetail);
//            orderDetailRepository.save(orderDetail);
//
//            CartDTO cartDTO = new CartDTO(orderDetail.getProductId(), orderDetail.getProductQuantity());
//            cartDTOList.add(cartDTO);
        return null;
        }

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
