package com.example.zevent.registro

import android.os.Bundle
import android.view.*
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.example.zevent.R
import com.example.zevent.databinding.FragmentRegistroBinding


/**
 * A simple [Fragment] subclass.
 */
@Suppress("UNREACHABLE_CODE")

class Registro() : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val binding = DataBindingUtil.inflate<FragmentRegistroBinding>(
            inflater,
             R.layout.fragment_registro, container, false)

        setHasOptionsMenu(true)
        return binding.root
    }
        val nombreL = listOf("Jaime González","Andrea Chávez", "Miguel Barrón", "Juan Ramos", "Andres Zepeda", "Dulce Vargas", "Maria Silva", "Javier Orozco","Nataly Lara", "Rafael Bernal")
        val emailL = listOf("jaime@gmail.com", "andrea@gmail.com", "miguel@gmail.com", "juan@gmail.com", "andres@gmail.com", "dulce@gmail.com",
            "maria@gmail.com", "javier@gmail.com", "nataly@gmail.com", "rafael@gmail.com")
        val telefonosL = listOf("53675442", "37763900", "83490576", "11348873", "99086774", "55799682", "66789633", "55413799", "42376590", "41577986")


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.registrados_menu, menu)

    }

}





