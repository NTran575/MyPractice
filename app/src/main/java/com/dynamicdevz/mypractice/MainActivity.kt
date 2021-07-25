package com.dynamicdevz.mypractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dynamicdevz.mypractice.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.fragment_button.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var buttonFragment: ButtonFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonFragment=supportFragmentManager.findFragmentById(R.id.button_fragment) as ButtonFragment


        //clicking a button to another fragment
        buttonFragment.fire_button.setOnClickListener {
            Log.d("TAG_X", "to fire nation...")
            val firefrag=TestFragment.getInstance()

            supportFragmentManager.beginTransaction()
                .replace(R.id.fireframe,firefrag)
                .addToBackStack(firefrag.tag)
                .commit()

        }

    }
}