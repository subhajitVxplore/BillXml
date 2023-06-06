package com.vxplore.billxml.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vxplore.billxml.R
import com.vxplore.billxml.models.VendorExtraPaper
import com.vxplore.billxml.models.VendorPaper

class ReturnPaperAdapter(private val mList: List<VendorExtraPaper>) : RecyclerView.Adapter<ReturnPaperAdapter.ViewHolder>() {
  
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.vendor_papers_adp_row, parent, false)
  
        return ViewHolder(view)
    }
  
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
  
        val ItemsModel = mList[position]

  
        holder.paperNameId.text = ItemsModel.name
        holder.paperPriceId.text = ItemsModel.unitPrice.toString()
        holder.paperQtyId.text = ItemsModel.quantity.toString()
        holder.paperTotalId.text = ItemsModel.effectiveUnitPrice.toString()

    }
  
    override fun getItemCount(): Int {
        return mList.size
    }
  
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val paperNameId: TextView = itemView.findViewById(R.id.paperNameId)
        val paperPriceId: TextView = itemView.findViewById(R.id.paperPriceId)
        val paperQtyId: TextView = itemView.findViewById(R.id.paperQtyId)
        val paperTotalId: TextView = itemView.findViewById(R.id.paperTotalId)
    }
}