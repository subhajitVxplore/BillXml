package com.vxplore.billxml.models

data class VendorCoupon(
    val id: String,
    val name: String,
    val price: Float,
    val newPrice: Float? = null,
    val quantity: Int? = null
)