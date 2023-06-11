package com.example.servicioswebapiswapi.presentation.screems.segundo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.servicioswebapiswapi.databinding.FragmentSegundoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SegundoFragment : Fragment() {

    private val segundoViewModel: SegundoViewModel by viewModels()
    private lateinit var binding: FragmentSegundoBinding
    private val segundoAdapter = SegundoAdapter()
    var segundoListener: SegundoListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSegundoBinding.inflate(LayoutInflater.from(context), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        segundoViewModel.personaLiveData.observe(viewLifecycleOwner) {
            segundoAdapter.agregarLista(it.results)
        }
        segundoViewModel.personaLiveData.observe(viewLifecycleOwner) {
            binding.tvCount.text = it.count.toString()
        }
        segundoViewModel.personaLiveData.observe(viewLifecycleOwner) {
            binding.tvNext.text = it.next
        }
        segundoViewModel.personaLiveData.observe(viewLifecycleOwner) {
            binding.tvPrevious.text = it.previous.toString()
        }
        segundoViewModel.getPersona()
        binding.rvListaDeHeroes.adapter = segundoAdapter

        binding.btnReservar.setOnClickListener {
        segundoListener?.onClickReservar("Su Reserva fue Exitosa")
        }
    }
}