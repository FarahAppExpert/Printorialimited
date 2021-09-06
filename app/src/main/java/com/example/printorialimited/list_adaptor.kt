package com.example.printorialimited

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.BaseAdapter
import android.widget.ImageView

import java.util.ArrayList

class list_adaptor (context : Context, serviceList: ArrayList<service_list>) : BaseAdapter ()
{

     var serviceList : ArrayList<service_list>
     var context : Context

    init {
        this.serviceList = serviceList
        this.context = context
    }

    private class ViewHolder (view : View?)
    {
        var imageList : ImageView

        init {
            this.imageList = view?.findViewById(R.id.imageList) as ImageView
        }


    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var views : View?
        var viewHolder : ViewHolder

        if (convertView == null)
        {
           var layout = LayoutInflater.from(context)
            views = layout.inflate(R.layout.list_view, parent, false)
            viewHolder = ViewHolder(views)
            views.tag = viewHolder

        }
        else
        {
            views = convertView
            viewHolder = views.tag as ViewHolder
        }

         var serviceLists : service_list = getItem(position) as service_list
         viewHolder.imageList.setImageResource(serviceLists.image)

        var animation  = AnimationUtils.loadAnimation(context, R.anim.fade)
        views!!.startAnimation(animation)
        return views as View
    }

    override fun getCount(): Int {

        return serviceList.count()
    }

    override fun getItem(position: Int): Any {
        return serviceList.get(position)
    }

    override fun getItemId(position: Int): Long {
       return  position.toLong()
    }

}