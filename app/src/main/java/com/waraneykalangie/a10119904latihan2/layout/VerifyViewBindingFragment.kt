package com.waraneykalangie.a10119904latihan2.layout

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.waraneykalangie.a10119904latihan2.R
import com.waraneykalangie.a10119904latihan2.databinding.FragmentVerifyBinding
import com.waraneykalangie.a10119904latihan2.module.SpanLinkBuilder
import com.waraneykalangie.a10119904latihan2.module.ViewBindingFragment


//  05/01/2023
//  10119904
//  Waraney Willem Palandeng Kalangie
//  IF10K

class VerifyViewBindingFragment : ViewBindingFragment<FragmentVerifyBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding = FragmentVerifyBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.btnSend.setOnClickListener {
            findNavController().navigate(R.id.action_verifyViewBindingFragment_to_homeViewBindingFragment)
        }

        binding.txtViewResendVerificationCode.movementMethod = LinkMovementMethod.getInstance()
        val text = binding.txtViewResendVerificationCode.text.toString()
        val result = SpanLinkBuilder()
            .setText(text)
            .setStartLinkIndex(text.indexOf(getString(R.string.resend)))
            .setEndLinkIndex(text.length)
            .build()
        binding.txtViewResendVerificationCode.text = result
    }
}