package com.example.lab4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.zevent.databinding.FragmentResultadosBinding
import com.example.zevent.R


/**
 * A simple [Fragment] subclass.
 */
class Resultados : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentResultadosBinding>(inflater,
            R.layout.fragment_resultados,container,false)
        binding.reinciarB.setOnClickListener{
                view : View ->
            view.findNavController().navigate(R.id.action_resultados_to_titleFragment)
        }

        return binding.root
    }



}

