package com.example.getir.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getir.data.entity.Urunler
import com.example.getir.databinding.FragmentAnasayfaBinding
import com.example.getir.ui.adapter.UrunlerAdapter
import com.example.getir.ui.fragment.AnasayfaFragmentDirections

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        val urunlerListesi = ArrayList<Urunler>()
        urunlerListesi.add(Urunler(1, "Atıştırmalık", "atistirmalik"))
        urunlerListesi.add(Urunler(2, "Su & İçecekler", "suicecek"))
        urunlerListesi.add(Urunler(3, "Meyve & Sebze", "meyvesebze"))
        urunlerListesi.add(Urunler(4, "Süt Ürünleri", "suturunleri"))
        urunlerListesi.add(Urunler(5, "Kahvaltılık", "kahvaltilik"))
        urunlerListesi.add(Urunler(6, "Fırından", "firindan"))
        urunlerListesi.add(Urunler(7, "Dondurma", "dondurma"))
        urunlerListesi.add(Urunler(8, "Temel Gıda", "temelgida"))
        urunlerListesi.add(Urunler(9, "Yiyecek", "yiyecek"))
        urunlerListesi.add(Urunler(10, "Et, Tavuk & Balık", "ettavuk"))
        urunlerListesi.add(Urunler(11, "Fit & Form", "fitform"))
        urunlerListesi.add(Urunler(12, "Kişisel Bakım", "kisiselbakim"))
        urunlerListesi.add(Urunler(13, "Ev Bakım", "evbakim"))
        urunlerListesi.add(Urunler(14, "Ev & Yaşam", "evyasam"))
        urunlerListesi.add(Urunler(15, "Evcil Hayvan", "evcilhayvan"))
        urunlerListesi.add(Urunler(16, "Bebek", "bebek"))


        val urunlerAdapter = UrunlerAdapter(requireContext(), urunlerListesi)
        binding.urunlerRv.adapter = urunlerAdapter

        //Nasıl görünecek!!??? Kaç tane kutucuk olacağını belirtiyoruz bu kodlama ile!!
        binding.urunlerRv.layoutManager =
            StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)

        return binding.root
    }
}
