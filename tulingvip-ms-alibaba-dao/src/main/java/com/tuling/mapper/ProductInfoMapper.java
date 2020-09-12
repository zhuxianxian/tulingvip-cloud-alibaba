package com.tuling.mapper;

import com.tuling.entity.ProductInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by smlz on 2019/11/17.
 */
@Repository
public interface ProductInfoMapper {

    ProductInfo selectProductInfoById(String productNo);
}
