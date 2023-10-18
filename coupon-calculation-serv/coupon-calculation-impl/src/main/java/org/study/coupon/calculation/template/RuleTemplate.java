package org.study.coupon.calculation.template;


import org.study.coupon.calculation.api.beans.ShoppingCart;

public interface RuleTemplate {

    // 计算优惠券
    ShoppingCart calculate(ShoppingCart settlement);
}
