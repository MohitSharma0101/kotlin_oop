package com.company.payment

object PaymentFactory {
    fun card() = Card()
    fun coupon() = Coupon()
}