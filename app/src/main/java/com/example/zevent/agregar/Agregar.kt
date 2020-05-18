package com.example.zevent.agregar

import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.example.zevent.R
import com.example.zevent.databinding.FragmentAgregarBinding


/**
 * A simple [Fragment] subclass.
 */
class Agregar : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentAgregarBinding>(
            inflater,
            R.layout.fragment_agregar, container, false
        )

        setHasOptionsMenu(true)
        return binding.root

        lateinit var viewModel: AgregarViewModel

        val roles = arrayListOf<String>("Organizador", "Fotografo", "Participante")


    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.agregar_menu, menu)

    }



}

