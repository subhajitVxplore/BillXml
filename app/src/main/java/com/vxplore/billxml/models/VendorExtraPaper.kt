package com.vxplore.billxml.models

data class VendorExtraPaper(
    val id: String,
    val name: String,
    val info: String,
    val unitPrice: Float? = null,
    val effectiveUnitPrice: Float? = null,
    val totalLeftPapers: Int = 200,
    val quantity: Int? = null
)