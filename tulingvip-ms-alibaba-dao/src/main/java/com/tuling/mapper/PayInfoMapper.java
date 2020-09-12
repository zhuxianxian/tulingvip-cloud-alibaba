package com.tuling.mapper;

import com.tuling.entity.PayInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by smlz on 2019/11/20.
 */
@Repository
public interface PayInfoMapper {

    PayInfo selectPayInfoByOrderNo(String orderNo);
}
