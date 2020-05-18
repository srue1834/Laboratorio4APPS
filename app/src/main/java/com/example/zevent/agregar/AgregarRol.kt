package com.example.zevent.agregar

import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.example.zevent.R
import com.example.zevent.databinding.FragmentAgregarRol2Binding


/**
 * A simple [Fragment] subclass.
 */
class AgregarRol : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentAgregarRol2Binding>(
            inflater,
            R.layout.fragment_agregar_rol2, container, false
        )

        setHasOptionsMenu(true)
        return binding.root



    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.agregar_menu, menu)

    }



}

