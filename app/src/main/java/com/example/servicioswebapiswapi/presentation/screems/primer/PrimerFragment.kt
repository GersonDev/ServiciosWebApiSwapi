package com.example.servicioswebapiswapi.presentation.screems.primer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.servicioswebapiswapi.R
import com.example.servicioswebapiswapi.databinding.FragmentPrimerBinding
import com.example.servicioswebapiswapi.presentation.screems.segundo.SegundoFragment
import com.example.servicioswebapiswapi.presentation.screems.segundo.SegundoListener
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PrimerFragment : Fragment() {

    private lateinit var binding: FragmentPrimerBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrimerBinding.inflate(LayoutInflater.from(context), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSuperHeroes.setOnClickListener {
            val segundoFragment = SegundoFragment()
            //Aqui se llama mediante un object
            segundoFragment.segundoListener = object : SegundoListener {
                override fun onClickReservar(mensaje: String) {
                    fragmentManager?.popBackStack()
                    Toast.makeText(context, "$mensaje", Toast.LENGTH_SHORT).show()
                }

            }

            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fPrimerFragment, segundoFragment)
            fragmentTransaction?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.commit()
        }
    }
}