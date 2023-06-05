package com.vxplore.billxml.models

data class VendorPaper(
    val id: String,
    val name: String,
    val unitPrice: Float? = null,
    val effectiveUnitPrice: Float? = null,
    val quantity: Int? = null
)