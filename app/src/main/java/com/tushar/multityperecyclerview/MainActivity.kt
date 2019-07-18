package com.tushar.multityperecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var adapterDataList = ArrayList<Model>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapterDataList.add(Model(MultiAdapter.TYPE_RED))
        adapterDataList.add(Model(MultiAdapter.TYPE_BLUE))
        adapterDataList.add(Model(MultiAdapter.TYPE_RED))
        adapterDataList.add(Model(MultiAdapter.TYPE_GREEN))
        adapterDataList.add(Model(MultiAdapter.TYPE_GREEN))
        adapterDataList.add(Model(MultiAdapter.TYPE_RED))
        adapterDataList.add(Model(MultiAdapter.TYPE_BLUE))
        adapterDataList.add(Model(MultiAdapter.TYPE_RED))
        adapterDataList.add(Model(MultiAdapter.TYPE_GREEN))
        adapterDataList.add(Model(MultiAdapter.TYPE_RED))
        adapterDataList.add(Model(MultiAdapter.TYPE_RED))
        adapterDataList.add(Model(MultiAdapter.TYPE_BLUE))
        adapterDataList.add(Model(MultiAdapter.TYPE_RED))
        adapterDataList.add(Model(MultiAdapter.TYPE_GREEN))
        adapterDataList.add(Model(MultiAdapter.TYPE_GREEN))
        adapterDataList.add(Model(MultiAdapter.TYPE_RED))
        adapterDataList.add(Model(MultiAdapter.TYPE_BLUE))

        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rv_multi_type.layoutManager = layoutManager
        val adapter = MultiAdapter()
        rv_multi_type.adapter = adapter
        adapter.setData(adapterDataList)
    }
}
