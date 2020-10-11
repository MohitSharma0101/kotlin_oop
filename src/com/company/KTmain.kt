package com.company
import com.company.payment.PaymentFactory

typealias mf = MobileFactory
typealias pf = PaymentFactory
fun main(){

  Cart.addMobile(mf.realmeX2())
  Cart.addMobile(mf.rn5pro())
  val customMobile=CustomMobile(
          "custom",
          64,
          4,
          CustomMobile.OS_MIUI)
  Cart.getDetails(customMobile)
  Cart.addMobile(customMobile)
  Cart.setPaymentMethodAndCheckout(pf.coupon())

}