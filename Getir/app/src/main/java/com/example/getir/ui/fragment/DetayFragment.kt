package com.example.getir.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.getir.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDetayBinding.inflate(inflater,container,false)

        //Adapterda sayfa geçişi yaptık, gönderdiğimiz nesne içindeki sayfada göstericez!!
        val bundle: DetayFragmentArgs by navArgs() //Gönderilen!!
        val urun = bundle.urunNesnesi

        binding.tvUrun.text = urun.ad

        //İmgae aktardık!!
        binding.ivUrun.setImageResource(
            resources.getIdentifier(urun.resim,"drawable",requireContext().packageName)
        )



        return binding.root
    }

}