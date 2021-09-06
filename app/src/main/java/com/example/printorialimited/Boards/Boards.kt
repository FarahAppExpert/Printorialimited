package com.example.printorialimited.Boards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.printorialimited.R

class Boards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boards)

        var listView : ListView = findViewById(R.id.boards_listview) as ListView
        var boardsListArry : ArrayList<Boards_List> = ArrayList()
        boardsListArry.add(Boards_List(R.drawable.correx, "Correx", ""))
        boardsListArry.add(Boards_List(R.drawable.dibondboard, "DiBond Aluminium Composite", ""))
        boardsListArry.add(Boards_List(R.drawable.foamex10mm, "Foamex 10 mm", "£85.00\n" + "Per square meter"))
        boardsListArry.add(Boards_List(R.drawable.foamex3mm, "Foamex 3 mm", "£40.00\n" + "Per square meter"))
        boardsListArry.add(Boards_List(R.drawable.foamex5mm, "Foamex 5 mm", "£65.00"))
        boardsListArry.add(Boards_List(R.drawable.woocommerceplaceholder, "Glass Splashback", ""))

        listView.adapter = Boards_List_Adaptor(applicationContext, boardsListArry)

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