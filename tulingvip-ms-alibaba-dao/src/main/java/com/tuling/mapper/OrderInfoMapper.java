package com.tuling.mapper;

import com.tuling.entity.OrderInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by smlz on 2019/11/17.
 */
@Repository
public interface OrderInfoMapper {

    OrderInfo selectOrderInfoById(String orderNo);
}
