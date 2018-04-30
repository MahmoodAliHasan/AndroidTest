package com.teaml.memoryleaktest.ui.mutitype

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.teaml.memoryleaktest.R
import com.teaml.memoryleaktest.data.ImgClass
import com.teaml.memoryleaktest.data.MainView
import com.teaml.memoryleaktest.data.TxtClass
import com.teaml.memoryleaktest.ui.mutitype.adatper.MainAdapter
import kotlinx.android.synthetic.main.activity_multitype_recycler_view.*
import kotlinx.android.synthetic.main.content_multi_type_recycler_view.*

class MultiTypeRecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multitype_recycler_view)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }


        val list = mutableListOf(ImgClass(R.drawable.evaluation_icon), TxtClass("title 1") , TxtClass("title 3"))
        val adapter = MainAdapter(list)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter


    }

}
