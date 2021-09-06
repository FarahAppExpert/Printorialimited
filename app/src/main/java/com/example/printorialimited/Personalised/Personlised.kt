package com.example.printorialimited.Personalised

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.printorialimited.R

class Personlised : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personlised)

        var listView : ListView = findViewById(R.id.personlised_listview) as ListView
        var personlisedListArry : ArrayList<Personlised_List> = ArrayList()
        personlisedListArry.add(Personlised_List(R.drawable.woocommerceplaceholder, "Canvas", "£10.00 – £45.00"))
        personlisedListArry.add(Personlised_List(R.drawable.ipadcaseblack, "iPad Cases", "£17.00 – £25.00"))
        personlisedListArry.add(Personlised_List(R.drawable.woocommerceplaceholder, "Personalised Banners", "£10.00"))
        personlisedListArry.add(Personlised_List(R.drawable.woocommerceplaceholder, "Ready Made Banners", ""))


        listView.adapter = Personlised_List_Adaptor(applicationContext, personlisedListArry)

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


            }

        })
    }
}