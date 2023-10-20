package org.study.coupon.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.study.coupon.calculation.api.beans.ShoppingCart;
import org.study.coupon.calculation.api.beans.SimulationOrder;
import org.study.coupon.calculation.api.beans.SimulationResponse;

/**
 * @author：jicai
 * @description：
 * @date：created in 2023/10/19 9:38 下午
 * @modified by:
 */
@FeignClient(value = "coupon-calculation-serv", path = "/calculator")
public interface CalculationService {

    // 订单结算
    @PostMapping("/checkout")
    ShoppingCart checkout(ShoppingCart settlement);

    // 优惠券试算
    @PostMapping("/simulate")
    SimulationResponse simulate(SimulationOrder simulator);
}
