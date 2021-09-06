package com.example.printorialimited.Laser

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.printorialimited.R

class Laser_List_Adaptor (context: Context, laser_list : ArrayList<Laser_List>) : BaseAdapter() {


    var context : Context
    var laser_list : ArrayList<Laser_List>

    init {
        this.context = context
        this.laser_list = laser_list
    }


    private class ViewHolder (view : View?)
    {
        var laser_image : ImageView
        var laser_name : TextView
        var laser_price : TextView

        init {
            laser_image = view?.findViewById(R.id.laser_image) as ImageView
            laser_name = view?.findViewById(R.id.laser_name) as TextView
            laser_price = view?.findViewById(R.id.laser_price) as TextView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var views : View?
        var viewHolder : ViewHolder

        if (convertView == null)
        {
            var layout = LayoutInflater.from(context)
            views = layout.inflate(R.layout.laser_list, parent, false)
            viewHolder = ViewHolder(views)
            views.tag = viewHolder

        }
        else
        {
            views = convertView
            viewHolder = views.tag as ViewHolder
        }

        var LaserList : Laser_List = getItem(position) as Laser_List
        viewHolder.laser_image.setImageResource(LaserList.laser_image)
        viewHolder.laser_name.text = LaserList.laser_name
        viewHolder.laser_price.text = LaserList.laser_price
        return views as View
    }

    override fun getCount(): Int {
        return  laser_list.count()
    }

    override fun getItem(position: Int): Any {
        return laser_list.get(position)
    }

    override fun getItemId(position: Int): Long {
        return  position.toLong()
    }


}