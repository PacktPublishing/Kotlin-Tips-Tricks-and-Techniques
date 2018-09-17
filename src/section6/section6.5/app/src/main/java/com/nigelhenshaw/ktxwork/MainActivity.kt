package com.nigelhenshaw.ktxwork

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

/**
 * This exercise will demonstrate the usage of two Workers.
 * One to set data in a background task. And one which will
 * update the main UI thread when the data changes.
 * The data will be used to update an adapter to be used
 * by a ListView.
 */
class MainActivity : AppCompatActivity() {

    companion object {
        const val KEY_SET_COLOR: String = "key_set_color"
        const val KEY_GET_COLOR: String = "key_get_color"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create an array of colors

        // Pass the array to a Data object

        // Create a WorkRequest with the data passed to inputData

        // Queue add colors WorkRequest for execution

        // Create a get colors WorkRequest

        // Setup an observer which will return color collection,
        // which will be passed to loadList for updating the ListView

        // Queue get colors WorkRequest

    }

    /**
     * This function will be called from the getColorsWorker WorkRequest Observer
     * which will update the adapter with colors parameter
     */
    private fun loadList(colors: Array<String?>?) {
        colors?.let {
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, colors)
            colorListView.adapter = adapter
        }
    }
}
