package com.example.printorialimited.Digital

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.printorialimited.R

class Digital : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_digital)


        var listView : ListView = findViewById(R.id.digital_listview) as ListView
        var digitalListArry : ArrayList<Digital_List> = ArrayList()
        digitalListArry.add(Digital_List(R.drawable.booklets, "Booklets", "£92.00 – £216.00 Stapled Booklet\n" + "Size: A5 (148mm x 210mm)\n" + "Silk-coated paper\n" + "Inside pages: 150gsm Silk\n" + "Cover: 250gsm Silk"))
        digitalListArry.add(Digital_List(R.drawable.businesscards, "Business Cards", "£42.00 – £99.00"))
        digitalListArry.add(Digital_List(R.drawable.flyers, "Flyers", "£56.00 – £338.00"))
        digitalListArry.add(Digital_List(R.drawable.flyers, "Half-Fold Leaflet", "£118.00 – £234.00"))
        digitalListArry.add(Digital_List(R.drawable.booklets, "Menus", "£92.00 – £216.00"))
        digitalListArry.add(Digital_List(R.drawable.poster, "Posters", "£15.00 – £30.00"))

        listView.adapter = Digital_List_Adaptor(applicationContext, digitalListArry)

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