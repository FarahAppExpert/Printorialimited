package com.example.printorialimited

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.printorialimited.Banners.Banners
import com.example.printorialimited.Boards.Boards
import com.example.printorialimited.Digital.Digital
import com.example.printorialimited.Laser.Laser
import com.example.printorialimited.Personalised.Personlised
import com.example.printorialimited.Stickers.Stickers


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView : ListView = findViewById(R.id.list_item_view) as ListView
        var serviceListArry : ArrayList<service_list> = ArrayList()
        serviceListArry.add(service_list(R.drawable.banners))
        serviceListArry.add(service_list(R.drawable.boards))
        serviceListArry.add(service_list(R.drawable.digital))
        serviceListArry.add(service_list(R.drawable.laser))
        serviceListArry.add(service_list(R.drawable.stickers))
        serviceListArry.add(service_list(R.drawable.personalised))

        listView.adapter = list_adaptor(applicationContext, serviceListArry)

        listView.setOnItemClickListener(object : AdapterView.OnItemClickListener
        {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

               if (position == 0)
               {
                 var intent0  = Intent(view!!.context, Banners :: class.java)
                   startActivity(intent0)

               }
                else if (position == 1)
               {
                var intent1 = Intent(view!!.context, Boards :: class.java)
                startActivity(intent1)
               }
                else if (position == 2)
               {
                   var intent2 = Intent(view!!.context, Digital :: class.java)
                   startActivity(intent2)
               }
                else if (position == 3)
               {
                   var intent3 = Intent(view!!.context, Laser :: class.java)
                   startActivity(intent3)
               }
                else if (position == 4)
               {
                   var intent4 = Intent(view!!.context, Stickers :: class.java)
                   startActivity(intent4)
               }
                else if (position == 5)
               {
                   var intent5 = Intent(view!!.context, Personlised :: class.java)
                   startActivity(intent5)
               }
            }

        })

    }
}