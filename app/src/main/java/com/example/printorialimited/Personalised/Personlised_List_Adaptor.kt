package com.example.printorialimited.Personalised

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.printorialimited.R

class Personlised_List_Adaptor (context: Context, personlised_list : ArrayList<Personlised_List>) : BaseAdapter(){

     var context : Context
     var personlised_list : ArrayList<Personlised_List>

     init {
         this.context = context
         this.personlised_list = personlised_list
     }

    private class ViewHolder (view: View?)
    {
        var personlised_image : ImageView
        var personlised_name : TextView
        var personlised_price : TextView

        init {
            personlised_image = view?.findViewById(R.id.personlised_image) as ImageView
            personlised_name = view?.findViewById(R.id.personlised_name) as TextView
            personlised_price = view?.findViewById(R.id.personlised_price) as TextView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var views : View?
        var viewHolder : ViewHolder

        if (convertView == null)
        {
            var layout = LayoutInflater.from(context)
            views = layout.inflate(R.layout.personlised_list, parent, false)
            viewHolder = ViewHolder(views)
            views.tag = viewHolder

        }
        else
        {
            views = convertView
            viewHolder = views.tag as ViewHolder
        }

        var PersonisedList : Personlised_List = getItem(position) as Personlised_List
        viewHolder.personlised_image.setImageResource(PersonisedList.personlised_image)
        viewHolder.personlised_name.text = PersonisedList.personlised_name
        viewHolder.personlised_price.text = PersonisedList.personlised_price

        return views as View
    }

    override fun getCount(): Int {
     return  personlised_list.count()
    }

    override fun getItem(position: Int): Any {
     return  personlised_list.get(position)
    }

    override fun getItemId(position: Int): Long {
      return  position.toLong()
    }


}