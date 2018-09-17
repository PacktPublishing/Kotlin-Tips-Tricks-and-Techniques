package com.nigelhenshaw.ktxcollection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * This exercise will demonstrate the advantage of
 * using the KTX Collection module for creating ArraySet
 * Collections
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Call the createColorSet method and assign the result
        // to a value called colorSetList.

        // Create an ArrayAdapter instance using colorSetList
        // And call the instance adapter

        // Set the ListView adapter with the adapter value

    }

    /**
     * Create a function called createColorSet which will return
     * an ArraySet of colors
     * First the ArraySet will be populated using the standard method
     * of adding each item at a time.
     * Then that implementation will be changed to using the KTX
     * Collection arraySetOf() method.
     */

}
