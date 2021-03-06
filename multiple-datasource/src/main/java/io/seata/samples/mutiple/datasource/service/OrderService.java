package io.seata.samples.mutiple.datasource.service;

import io.seata.samples.mutiple.datasource.common.OperationResponse;
import io.seata.samples.mutiple.datasource.common.order.PlaceOrderRequestVO;

/**
 * @author HelloWoodes
 */
public interface OrderService {

    /**
     * 下单
     *
     * @param placeOrderRequestVO 请求参数
     * @return 下单结果
     */
    OperationResponse placeOrder(PlaceOrderRequestVO placeOrderRequestVO) throws Exception;
}
