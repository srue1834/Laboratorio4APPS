package com.example.zevent.invitados

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.zevent.R
import com.example.zevent.databinding.FragmentInvitadosBinding


/**
 * A simple [Fragment] subclass.
 */
class Invitados : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentInvitadosBinding>(inflater,
            R.layout.fragment_invitados,container,false)


        return binding.root
    }

}
