package com.tushar.multityperecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MultiAdapter : RecyclerView.Adapter<BaseViewHolder<*>>() {

    private var adapterDataList = ArrayList<Model>()

    companion object {
        const val TYPE_RED = 0
        const val TYPE_BLUE = 1
        const val TYPE_GREEN = 2
    }

    override fun getItemCount() = adapterDataList.size

    //--------onCreateViewHolder: inflate layout with view holder-------
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return when (viewType) {
            TYPE_RED -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.row_red, parent, false)
                RedViewHolder(view)
            }
            TYPE_BLUE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.row_blue, parent, false)
                BlueViewHolder(view)
            }
            TYPE_GREEN -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.row_green, parent, false)
                GreenViewHolder(view)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    //-----------onCreateViewHolder: bind view with data model---------
    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        val element = adapterDataList[position]
        when (holder) {
            is RedViewHolder -> holder.bind(element)
            is BlueViewHolder -> holder.bind(element)
            is GreenViewHolder -> holder.bind(element)
            else -> throw IllegalArgumentException()
        }
    }

    override fun getItemViewType(position: Int): Int {
        val comparable = adapterDataList[position].type
        return when (comparable) {
            0 -> TYPE_RED
            1 -> TYPE_BLUE
            2 -> TYPE_GREEN
            else -> throw IllegalArgumentException("Invalid type of data " + position)
        }
    }

    //----------------RedViewHolder-------------------------
    inner class RedViewHolder(itemView: View) : BaseViewHolder<Model>(itemView) {

        override fun bind(item: Model) {
            //Do your view assignment here from the data model
        }
    }

    //----------------BlueViewHolder--------------------------
    inner class BlueViewHolder(itemView: View) : BaseViewHolder<Model>(itemView) {

        override fun bind(item: Model) {
            //Do your view assignment here from the data model
        }
    }

    //----------------GreenViewHolder--------------------
    inner class GreenViewHolder(itemView: View) : BaseViewHolder<Model>(itemView) {

        override fun bind(item: Model) {
            //Do your view assignment here from the data model
        }
    }

    fun setData(models: ArrayList<Model>) {
        adapterDataList = models
        notifyDataSetChanged()
    }


}