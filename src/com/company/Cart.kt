package com.company

import com.company.payment.PaymentMethod

object Cart {
    private var list = mutableListOf<Mobile>()
    var price = 0
    fun addMobile(mobile: Mobile) = list.add(mobile)
    fun checkout() {
        println(" \nBill : \n")
        for(mobile in list){
            println("name: ${mobile.name()} \nprice: ${mobile.price()}")
            price += mobile.price()
        }
        println("Total price in rs: $price ")
    }
    fun getDetails(mobile: Mobile) {
        println("name: ${mobile.name()} \nprice: ${mobile.price()} \ncamera: ${mobile.camera()} \nram: ${mobile.ram()} \nOS: ${mobile.OS()}")
    }
  fun setPaymentMethodAndCheckout(method: PaymentMethod) {
      if(list.isEmpty()) {
          println("\nCart is Empty")
          return
      }
      checkout()
      println("discount: ${method.discountPercentage*100}% ")
      val finalPrice = method.processPayment(price.toFloat())
      println("Total amount to be paid in rs: $finalPrice ")
    }
}