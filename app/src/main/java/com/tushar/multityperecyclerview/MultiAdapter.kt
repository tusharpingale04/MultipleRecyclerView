package com.tushar.multityperecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MultiAdapter : RecyclerView.Adapter<BaseViewHolder<*>>() {

    private var adapterDataList = ArrayList<Any>()

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
            is RedViewHolder -> holder.bind(element as RedModel)
            is BlueViewHolder -> holder.bind(element as BlueModel)
            is GreenViewHolder -> holder.bind(element as GreenModel)
            else -> throw IllegalArgumentException()
        }
    }

    override fun getItemViewType(position: Int): Int {
        val comparable = adapterDataList[position]
        return when (comparable) {
            is RedModel -> TYPE_RED
            is BlueModel -> TYPE_BLUE
            is GreenModel -> TYPE_GREEN
            else -> throw IllegalArgumentException("Invalid type of data " + position)
        }
    }

    //----------------RedViewHolder-------------------------
    inner class RedViewHolder(itemView: View) : BaseViewHolder<RedModel>(itemView) {

        override fun bind(item: RedModel) {
            //Do your view assignment here from the data model
        }
    }

    //----------------BlueViewHolder--------------------------
    inner class BlueViewHolder(itemView: View) : BaseViewHolder<BlueModel>(itemView) {

        override fun bind(item: BlueModel) {
            //Do your view assignment here from the data model
        }
    }

    //----------------GreenViewHolder--------------------
    inner class GreenViewHolder(itemView: View) : BaseViewHolder<GreenModel>(itemView) {

        override fun bind(item: GreenModel) {
            //Do your view assignment here from the data model
        }
    }

    fun setData(models: ArrayList<Any>) {
        adapterDataList = models
        notifyDataSetChanged()
    }


}