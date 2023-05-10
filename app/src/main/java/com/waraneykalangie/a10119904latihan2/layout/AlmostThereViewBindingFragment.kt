package com.waraneykalangie.a10119904latihan2.layout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.waraneykalangie.a10119904latihan2.R
import com.waraneykalangie.a10119904latihan2.databinding.FragmentAlmostThereBinding
import com.waraneykalangie.a10119904latihan2.module.ViewBindingFragment

//  05/01/2023
//  10119904
//  Waraney Willem Palandeng Kalangie
//  IF10K


class AlmostThereViewBindingFragment : ViewBindingFragment<FragmentAlmostThereBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding =
        FragmentAlmostThereBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.btnVerify.setOnClickListener {
            findNavController().navigate(R.id.action_almostThereViewBindingFragment_to_verifyViewBindingFragment)
        }
    }
}