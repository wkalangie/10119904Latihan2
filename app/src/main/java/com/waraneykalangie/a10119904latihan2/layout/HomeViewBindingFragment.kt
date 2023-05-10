package com.waraneykalangie.a10119904latihan2.layout

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.waraneykalangie.a10119904latihan2.databinding.FragmentHomeBinding
import com.waraneykalangie.a10119904latihan2.module.ViewBindingFragment


class HomeViewBindingFragment : ViewBindingFragment<FragmentHomeBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding = FragmentHomeBinding::inflate
}