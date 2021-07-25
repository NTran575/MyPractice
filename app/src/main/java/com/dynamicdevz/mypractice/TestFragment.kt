package com.dynamicdevz.mypractice

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.dynamicdevz.mypractice.databinding.FragmentFireBinding

class TestFragment: Fragment() {
    private lateinit var binding: FragmentFireBinding
    //fire page

    companion object{
        lateinit var testFragment: TestFragment

        fun getInstance(): TestFragment {
            if(!this::testFragment.isInitialized)
                testFragment = TestFragment()

            return testFragment

        }

    }
    //bind constructor
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFireBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //image display
        val imageView=view.findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(R.drawable.firenation)

        //clicking a button
        binding.clickButton.setOnClickListener{
            Log.d("TAG_X", "fire nation")

        }
    }
}