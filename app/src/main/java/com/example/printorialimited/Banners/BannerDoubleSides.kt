package com.example.printorialimited.Banners

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.printorialimited.R



class BannerDoubleSides : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_banner_double_sides, container, false)

    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BannerDoubleSides().apply {
                arguments = Bundle().apply {

                }
            }
    }
}