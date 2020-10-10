package com.company

typealias mf = MobileFactory
fun main(){

  Cart.addMobile(mf.realme5())
  Cart.addMobile(mf.realme6())
  Cart.addMobile(mf.rn5pro())
  Cart.addMobile(mf.rn6pro())
    Cart.getDetails(mf.rn6pro())
    Cart.getDetails(mf.rn5pro())
    Cart.checkout()


}