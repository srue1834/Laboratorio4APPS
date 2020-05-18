package com.example.zevent.roles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.zevent.R
import com.example.zevent.databinding.FragmentRolesBinding


/**
 * A simple [Fragment] subclass.
 */
class Roles : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentRolesBinding>(
            inflater,
            R.layout.fragment_roles, container, false
        )

        return binding.root
    }

}
