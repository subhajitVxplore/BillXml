package com.vxplore.billxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vxplore.billxml.adapters.VendorPaperAdapter
import com.vxplore.billxml.models.VendorPaper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val vendorPaper_rv_id = findViewById<RecyclerView>(R.id.vendorPaper_rv_id)
        vendorPaper_rv_id.layoutManager = LinearLayoutManager(this)
        val vendorPaperData = ArrayList<VendorPaper>()
        for (i in 1..5) {
            vendorPaperData.add(VendorPaper("0", "TOI", 100f, 110f, 200 + i))
        }
        val vendorPaperAdapter = VendorPaperAdapter(vendorPaperData)
        vendorPaper_rv_id.adapter = vendorPaperAdapter


        val returnPaper_rv_id = findViewById<RecyclerView>(R.id.returnPaper_rv_id)
        returnPaper_rv_id.layoutManager = LinearLayoutManager(this)
        val returnPaperData = ArrayList<VendorPaper>()
        for (i in 1..5) {
            returnPaperData.add(VendorPaper("0", "TOI", 100f, 110f, 200 + i))
        }
        val returnPaperAdapter = VendorPaperAdapter(returnPaperData)
        returnPaper_rv_id.adapter = returnPaperAdapter


        val coupons_rv_id = findViewById<RecyclerView>(R.id.coupons_rv_id)
        coupons_rv_id.layoutManager = LinearLayoutManager(this)
        val couponsData = ArrayList<VendorPaper>()
        for (i in 1..5) {
            couponsData.add(VendorPaper("0", "TOI", 100f, 110f, 200 + i))
        }
        val couponsAdapter = VendorPaperAdapter(couponsData)
        coupons_rv_id.adapter = couponsAdapter


    }
}