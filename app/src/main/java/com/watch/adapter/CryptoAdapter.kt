package com.watch.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.watch.data.vo.AddressDetails
import com.watch.ui.R
import java.text.DecimalFormat
import java.text.Format


class CryptoAdapter(private val mList: AddressDetails) : RecyclerView.Adapter<CryptoAdapter.ViewHolder>(){

        /**
         * Provide a reference to the type of views that you are using
         * (custom ViewHolder).
         */
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val textView: TextView
            val title : TextView

            init {
                // Define click listener for the ViewHolder's View.
                textView = view.findViewById(R.id.single_title)
                title = view.findViewById(R.id.single_text)
            }
        }

        // Create new views (invoked by the layout manager)
        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
            // Create a new view, which defines the UI of the list item
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.single_transaction, viewGroup, false)

            return ViewHolder(view)
        }

        // Replace the contents of a view (invoked by the layout manager)
        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

            // Get element from your dataset at this position and replace the
            // contents of the view with that element

            val amount = (mList.final_balance.toFloat())

            viewHolder.textView.text = (amount / 10000000).toString()

            viewHolder.title.text = "BTC address: "+ mList.address
        }

        // Return the size of your dataset (invoked by the layout manager)
        override fun getItemCount() = 2

    }


    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

    }
