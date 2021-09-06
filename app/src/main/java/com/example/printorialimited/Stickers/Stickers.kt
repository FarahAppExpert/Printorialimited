package com.example.printorialimited.Stickers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.printorialimited.R

class Stickers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stickers)

        var listView : ListView = findViewById(R.id.sticker_listview) as ListView
        var stickerListArry : ArrayList<Sticker_List> = ArrayList()
        stickerListArry.add(Sticker_List(R.drawable.woocommerceplaceholder, "Budget Sticker", ""))
        stickerListArry.add(Sticker_List(R.drawable.woocommerceplaceholder, "Car Stickers", ""))
        stickerListArry.add(Sticker_List(R.drawable.woocommerceplaceholder, "Labels", ""))
        stickerListArry.add(Sticker_List(R.drawable.woocommerceplaceholder, "Premium Stickers", ""))
        stickerListArry.add(Sticker_List(R.drawable.woocommerceplaceholder, "Ready Made Stickers", ""))


        listView.adapter = Sticker_List_Adaptor(applicationContext, stickerListArry)

        listView.setOnItemClickListener(object : AdapterView.OnItemClickListener
        {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                if (position == 0)
                {


                }
                else if (position == 1)
                {

                }
                else if (position == 2)
                {

                }
                else if (position == 3)
                {

                }
                else if (position == 4)
                {

                }
                else if (position == 5)
                {

                }

            }

        })
    }
}