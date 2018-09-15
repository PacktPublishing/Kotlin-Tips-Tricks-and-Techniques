package com.nigelhenshaw.ktxwork

import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    companion object {
        const val KEY_SET_COLOR: String = "key_set_color"
        const val KEY_GET_COLOR: String = "key_get_color"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun loadList(colors: Array<String?>?) {
        colors?.let {
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, colors)
            colorListView.adapter = adapter
        }
    }
}
