package com.tushar.multityperecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var adapterDataList = ArrayList<Any>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapterDataList.add(RedModel())
        adapterDataList.add(BlueModel())
        adapterDataList.add(RedModel())
        adapterDataList.add(GreenModel())
        adapterDataList.add(GreenModel())
        adapterDataList.add(RedModel())
        adapterDataList.add(BlueModel())
        adapterDataList.add(RedModel())
        adapterDataList.add(GreenModel())
        adapterDataList.add(RedModel())
        adapterDataList.add(RedModel())
        adapterDataList.add(BlueModel())
        adapterDataList.add(RedModel())
        adapterDataList.add(GreenModel())
        adapterDataList.add(GreenModel())
        adapterDataList.add(RedModel())
        adapterDataList.add(BlueModel())

        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rv_multi_type.layoutManager = layoutManager
        val adapter = MultiAdapter()
        rv_multi_type.adapter = adapter
        adapter.setData(adapterDataList)
    }
}
