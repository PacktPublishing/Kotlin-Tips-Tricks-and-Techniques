package com.nigelhenshaw.ktxfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * This exercise will demonstrate the advantage of using the
 * KTX Fragment module for switching fragments.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Create an instance of FirstFragment. Then use the
         * standard Android implementation to replace with
         * the SecondFragment
         * After that switch to the KTX fragment implementation
         */
        fragmentOneButton.setOnClickListener {

        }

        /**
         * Create an instance of SecondFragment. Then use the
         * standard Android implementation to replace with
         * the FirstFragment
         * After that switch to the KTX fragment implementation
         */
        fragmentTwoButton.setOnClickListener {

        }
    }
}
