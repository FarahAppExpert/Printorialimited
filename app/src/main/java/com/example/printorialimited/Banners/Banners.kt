package com.example.printorialimited.Banners


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.printorialimited.R



class Banners : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banners)

        var listView : ListView = findViewById(R.id.banners_listview) as ListView
        var bannersListArry : ArrayList<Banners_List> = ArrayList()
        bannersListArry.add(Banners_List(R.drawable.bannerdoublesides, "Banner Double Sided", "£0.00 – £2.00"))
        bannersListArry.add(Banners_List(R.drawable.bannersinglesided, "Banner Single Sided", "£1.60"))
        bannersListArry.add(Banners_List(R.drawable.meshbanner, "Mesh Banner", ""))
        bannersListArry.add(Banners_List(R.drawable.rollup, "Roller Up Stand", "£25.00 – £60.00"))
        bannersListArry.add(Banners_List(R.drawable.xdisplay, "X Display Stand", "£20.00 – £25.00"))

        listView.adapter = Banner_List_Adaptor(applicationContext, bannersListArry)

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

            }

        })

    }
}