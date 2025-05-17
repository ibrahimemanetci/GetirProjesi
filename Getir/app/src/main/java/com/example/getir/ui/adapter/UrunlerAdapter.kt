package com.example.getir.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.getir.data.entity.Urunler
import com.example.getir.databinding.CardTasarimBinding
import com.example.getir.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class UrunlerAdapter (var mContext: Context, var urunlerListesi: List<Urunler>)
    :RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position) //bunu her zaman yaz!!
        val t = holder.tasarim                  //bunu her zaman yaz!!
        t.textViewUrunAdi.text = urun.ad

        //İmage Kodlaması
        t.imageViewUrun.setImageResource(
            mContext.resources.getIdentifier(urun.resim,"drawable",mContext.packageName)
        )



        //Sayfa Geçiş İşlemleri
        t.cardViewUrun.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayGecis(urunNesnesi = urun)
            Navigation.findNavController(it).navigate(gecis)
        }

    }

    //Liste Size 'ı
    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}
