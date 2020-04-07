package com.example.shoppinglist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppinglist.model.GetData.createDataSet
import com.example.shoppinglist.model.ShopListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {

    private lateinit var listAdapter: ShopListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addList()

    }

    private fun addList() {
        val listData = DataSource.createDataSet()
        listAdapter.submitList(listData)
    }

    private fun initRecyclerView() {

        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingDecorator = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecorator)
            listAdapter = ShopListAdapter()
            adapter = listAdapter
        }
    }
}
