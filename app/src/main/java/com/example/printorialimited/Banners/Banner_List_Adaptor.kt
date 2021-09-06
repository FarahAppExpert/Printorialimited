package com.example.printorialimited.Banners

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.printorialimited.R



class Banner_List_Adaptor (context: Context, bannerlist : ArrayList<Banners_List>) : BaseAdapter() {

     var context: Context
     var bannerlist: ArrayList<Banners_List>

    init {
        this.context = context
        this.bannerlist = bannerlist
    }

    private class ViewHolder (view : View?)
    {
        var banner_image : ImageView
        var banner_name : TextView
        var banner_price : TextView


        init {
            this.banner_image = view?.findViewById(R.id.banner_image) as ImageView
            this.banner_name = view?.findViewById(R.id.banner_name) as TextView
            this.banner_price = view?.findViewById(R.id.banner_price) as TextView
        }


    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var views : View?
        var viewHolder : ViewHolder

        if (convertView == null)
        {
            var layout = LayoutInflater.from(context)
            views = layout.inflate(R.layout.banners_list, parent, false)
            viewHolder = ViewHolder(views)
            views.tag = viewHolder

        }
        else
        {
            views = convertView
            viewHolder = views.tag as ViewHolder
        }

        var BannersLists : Banners_List = getItem(position) as Banners_List
        viewHolder.banner_image.setImageResource(BannersLists.banner_image)
        viewHolder.banner_name.text = BannersLists.banner_name
        viewHolder.banner_price.text = BannersLists.Banner_Price

        var animation  = AnimationUtils.loadAnimation(context, R.anim.fade)
        views!!.startAnimation(animation)

        return views as View
    }

    override fun getCount(): Int {
      return bannerlist.count()
    }

    override fun getItem(position: Int): Any {
        return bannerlist.get(position)
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

}