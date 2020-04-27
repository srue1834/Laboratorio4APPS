package com.example.zevent

import android.os.Bundle
import android.view.*
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.zevent.databinding.FragmentTitleBinding



/**
 * A simple [Fragment] subclass.
 */
@Suppress("UNREACHABLE_CODE")
class TitleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
            R.layout.fragment_title,container,false)

        binding.iniciarB.setOnClickListener{
                view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_registro)
        }

       setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.options_menu, menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)

        val id = item.itemId
        if (item.itemId == R.id.check){
            
            true
        }else{

            true
        }
        return super.onOptionsItemSelected(item)
    }
}





