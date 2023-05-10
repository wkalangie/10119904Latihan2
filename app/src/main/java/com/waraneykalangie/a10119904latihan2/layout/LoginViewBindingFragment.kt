package com.waraneykalangie.a10119904latihan2.layout

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.waraneykalangie.a10119904latihan2.R
import com.waraneykalangie.a10119904latihan2.databinding.FragmentLoginBinding
import com.waraneykalangie.a10119904latihan2.module.SpanLinkBuilder
import com.waraneykalangie.a10119904latihan2.module.ViewBindingFragment

//  05/01/2023
//  10119904
//  Waraney Willem Palandeng Kalangie
//  IF10K

class LoginViewBindingFragment : ViewBindingFragment<FragmentLoginBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding = FragmentLoginBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.txtViewRegister.movementMethod = LinkMovementMethod.getInstance()
        val text = binding.txtViewRegister.text.toString()
        val result = SpanLinkBuilder()
            .setText(text)
            .setColorId(ResourcesCompat.getColor(resources, R.color.white, null))
            .setStartLinkIndex(text.indexOf(getString(R.string.register)))
            .setEndLinkIndex(text.length)
            .setLinkCallback { findNavController().navigate(R.id.action_loginViewBindingFragment_to_registerViewBindingFragment) }
            .build()
        binding.txtViewRegister.text = result
    }
}