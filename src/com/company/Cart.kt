package com.company

object Cart {
    var list = mutableListOf<Mobile>()
    var price = 0
    fun addMobile(mobile: Mobile) = list.add(mobile)
    fun checkout() {
        for(mobile in list){
            println("name: ${mobile.name()} \nprice: ${mobile.price()}")
            price += mobile.price()
        }
        println("Total amount to be paid in rs: $price ")
    }
    fun getDetails(mobile: Mobile) {
        println("name: ${mobile.name()} \nprice: ${mobile.price()} \ncamera: ${mobile.camera()} \nram: ${mobile.ram()} \nOS: ${mobile.OS()}")
    }
}