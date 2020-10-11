package com.company.payment

interface PaymentMethod {
    var discountPercentage : Float
     fun processPayment(price: Float): Float = price - price * discountPercentage
}