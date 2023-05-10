package com.waraneykalangie.a10119904latihan2.layout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.waraneykalangie.a10119904latihan2.R
import com.waraneykalangie.a10119904latihan2.databinding.FragmentRegisterBinding
import com.waraneykalangie.a10119904latihan2.module.ViewBindingFragment

//  05/01/2023
//  10119904
//  Waraney Willem Palandeng Kalangie
//  IF10K

class RegisterViewBindingFragment : ViewBindingFragment<FragmentRegisterBinding>() {

    override val bindingInflater: (LayoutInflater) -> ViewBinding = FragmentRegisterBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView(){
        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.action_registerViewBindingFragment_to_almostThereViewBindingFragment)
        }

        val bloodTypeAdapter = ArrayAdapter(
            requireContext(),
            R.layout.item_dropdown,
            resources.getStringArray(R.array.blood_types)
        )
        binding.autoCompleteBloodType.setAdapter(bloodTypeAdapter)

        val bloodRhesusAdapter = ArrayAdapter(
            requireContext(),
            R.layout.item_dropdown,
            resources.getStringArray(R.array.blood_rhesus)
        )
        binding.autoCompleteBloodRhesus.setAdapter(bloodRhesusAdapter)

        val jobAdapter = ArrayAdapter(
            requireContext(),
            R.layout.item_dropdown,
            resources.getStringArray(R.array.jobs)
        )
        binding.autoCompleteJob.setAdapter(jobAdapter)
    }
}