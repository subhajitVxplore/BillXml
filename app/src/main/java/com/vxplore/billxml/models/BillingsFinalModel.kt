package com.vxplore.billxml.models

data class BillingsFinalModel(
    val vendorId: String,
    val papersTaken: List<VendorPaper?>? = null,
    val takenPapersTotal: Double? = null,
    val returnPapers: List<VendorExtraPaper?>? = null,
    val returnsPapersTotal: Double? = null,
    val coupons: List<VendorCoupon?>? = null,
    val couponsTotal: Double? = null,
    val duePayment: Double? = null,
    val paymentByCash: Double? = null,
    val remainingAmount: Double?= null
)