package com.company

import com.company.payment.Card
import com.company.payment.PaymentFactory

typealias mf = MobileFactory
typealias pf = PaymentFactory
fun main(){

  Cart.addMobile(mf.realme5())
  Cart.addMobile(mf.realme6())
  Cart.addMobile(mf.rn5pro())
  Cart.addMobile(mf.rn6pro())

  Cart.getDetails(mf.realmeX2())
  Cart.addMobile(mf.realmeX2())
  Cart.checkout()



}