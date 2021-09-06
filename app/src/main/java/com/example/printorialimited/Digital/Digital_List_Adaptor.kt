package com.example.printorialimited.Digital

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.printorialimited.R

class Digital_List_Adaptor (context: Context, digital_list : ArrayList<Digital_List>) : BaseAdapter() {


    var context : Context
    var digital_list : ArrayList<Digital_List>

    init {
        this.context = context
        this.digital_list = digital_list
    }


    private class ViewHolder (view : View?)
    {
        var digital_image : ImageView
        var digital_name : TextView
        var digital_price : TextView

        init {
            digital_image = view?.findViewById(R.id.digital_image) as ImageView
            digital_name = view?.findViewById(R.id.digital_name) as TextView
            digital_price = view?.findViewById(R.id.digital_price) as TextView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var views : View?
        var viewHolder : ViewHolder

        if (convertView == null)
        {
            var layout = LayoutInflater.from(context)
            views = layout.inflate(R.layout.digital_list, parent, false)
            viewHolder = ViewHolder(views)
            views.tag = viewHolder

        }
        else
        {
            views = convertView
            viewHolder = views.tag as ViewHolder
        }

        var DigitalList : Digital_List = getItem(position) as Digital_List
        viewHolder.digital_image.setImageResource(DigitalList.digital_image)
        viewHolder.digital_name.text = DigitalList.digital_name
        viewHolder.digital_price.text = DigitalList.digital_price

        return views as View
    }

    override fun getCount(): Int {
      return  digital_list.count()
    }

    override fun getItem(position: Int): Any {
     return digital_list.get(position)
    }

    override fun getItemId(position: Int): Long {
      return  position.toLong()
    }


}