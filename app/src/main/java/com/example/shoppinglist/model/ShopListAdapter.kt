package com.example.shoppinglist.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.shoppinglist.R
import kotlinx.android.synthetic.main.layout_shop_list.view.*

class ShopListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<ShoppingList> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ShopListViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_shop_list, parent, false)
        )
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ShopListViewHolder -> {
                holder.bind(items[position])
            }
        }
    }


    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(shoppingList: ArrayList<ShoppingList>) {
        items = shoppingList
    }


    class ShopListViewHolder
        constructor(
            itemView: View
        ): RecyclerView.ViewHolder(itemView) {

        private val itemImage: ImageView = itemView.item_image
        private val itemName: TextView = itemView.item_name
        private val itemDescription: TextView = itemView.item_description
        private val itemPrice: TextView = itemView.item_price

        fun bind(shoppingList: ShoppingList) {
            itemName.text = shoppingList.itemTitle
            itemDescription.text = shoppingList.itemDescription
            itemPrice.text = shoppingList.itemPrice

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)


            Glide.with(itemView)
                .applyDefaultRequestOptions(requestOptions)
                .load(shoppingList.itemImage)
                .into(itemImage)

        }
    }



}