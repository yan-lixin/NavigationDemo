package com.navigation.sample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.navigation.sample.R
import kotlinx.android.synthetic.main.fragment_main_page2.*

/**
 * Copyright (c), 2018-2019
 * @author: lixin
 * Date: 2019/4/9
 * Description:
 */
class MainPageFragment2: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_page2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btn.setOnClickListener {
            Navigation.findNavController(it)
                    .navigateUp()
        }
        btn2.setOnClickListener {
            Navigation.findNavController(it)
                    .navigate(R.id.action_page3)
        }
    }
}