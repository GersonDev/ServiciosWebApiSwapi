package com.example.servicioswebapiswapi.presentation.screems.segundo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.servicioswebapiswapi.data.api.response.Personajes
import com.example.servicioswebapiswapi.databinding.ItemPersonajeBinding

class SegundoAdapter(val personajes: MutableList<Personajes> = mutableListOf()) :
    RecyclerView.Adapter<SegundoAdapter.ViewHolderPersonaje>() {
    class ViewHolderPersonaje(val itemPersonajeBinding: ItemPersonajeBinding) :
        RecyclerView.ViewHolder(itemPersonajeBinding.root) {
        fun bind(personajes: Personajes) {
            itemPersonajeBinding.tvName.text = personajes.name
            itemPersonajeBinding.tvHeight.text = personajes.height
            itemPersonajeBinding.tvMass.text = personajes.mass
            itemPersonajeBinding.tvHairColor.text = personajes.hair_color
            itemPersonajeBinding.tvSkinColor.text = personajes.skin_color
            itemPersonajeBinding.tvEyeColor.text = personajes.eye_color
            itemPersonajeBinding.tvBirthYear.text = personajes.birth_year
            itemPersonajeBinding.tvGender.text = personajes.gender
            itemPersonajeBinding.tvHomeworld.text = personajes.gender
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPersonaje {
        val binding: ItemPersonajeBinding =
            ItemPersonajeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolderPersonaje(binding)
    }

    override fun getItemCount(): Int {
        return personajes.size
    }

    override fun onBindViewHolder(holder: ViewHolderPersonaje, position: Int) {
        holder.bind(personajes[position])
    }

    fun agregarLista(personajes: List<Personajes>) {
        this.personajes.addAll(personajes)
        notifyDataSetChanged()

    }
}