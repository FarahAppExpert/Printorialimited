package com.example.printorialimited.Laser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.printorialimited.R

class Laser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laser)

        var listView : ListView = findViewById(R.id.laser_listview) as ListView
        var laserListArry : ArrayList<Laser_List> = ArrayList()
        laserListArry.add(Laser_List(R.drawable.woocommerceplaceholder, "Wooden Craft Gifts", ""))
        laserListArry.add(Laser_List(R.drawable.woodenletters, "Wooden Letters", "£2.80 – £20.40"))
        laserListArry.add(Laser_List(R.drawable.slauto, "Wooden Numbers", "£2.80 – £20.40"))
        laserListArry.add(Laser_List(R.drawable.flyers, "Wooden Symbols", "£2.80 – £20.40"))


        listView.adapter = Laser_List_Adaptor(applicationContext, laserListArry)

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