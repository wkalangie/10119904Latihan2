package com.waraneykalangie.a10119904latihan2.module

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

//  05/01/2023
//  10119904
//  Waraney Willem Palandeng Kalangie
//  IF10K

abstract class ViewBindingFragment<out T : ViewBinding> : Fragment() {
    private var _binding: ViewBinding? = null

    @Suppress("UNCHECKED_CAST")
    protected val binding: T
        get() = _binding as T

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater(inflater)
        return _binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    protected abstract val bindingInflater: (LayoutInflater) -> ViewBinding
}