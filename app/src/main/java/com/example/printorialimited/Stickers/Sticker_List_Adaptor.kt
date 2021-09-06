package com.example.printorialimited.Stickers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.printorialimited.R

class Sticker_List_Adaptor (context: Context, sticker_list : ArrayList<Sticker_List>) : BaseAdapter() {

    var context : Context
    var sticker_list : ArrayList<Sticker_List>

    init {
        this.context = context
        this.sticker_list = sticker_list
    }

    private class ViewHolder (view : View)
    {
        var sticker_image : ImageView
        var sticker_name : TextView
        var sticker_price : TextView

        init {
            sticker_image = view?.findViewById(R.id.sticker_image) as ImageView
            sticker_name = view?.findViewById(R.id.sticker_name) as  TextView
            sticker_price = view?.findViewById(R.id.sticker_price) as TextView
        }
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var views : View?
        var viewHolder : ViewHolder

        if (convertView == null)
        {
            var layout = LayoutInflater.from(context)
            views = layout.inflate(R.layout.sticker_list, parent, false)
            viewHolder = ViewHolder(views)
            views.tag = viewHolder

        }
        else
        {
            views = convertView
            viewHolder = views.tag as ViewHolder
        }

        var StickerList : Sticker_List = getItem(position) as Sticker_List
        viewHolder.sticker_image.setImageResource(StickerList.sticker_image)
        viewHolder.sticker_name.text = StickerList.sticker_name
        viewHolder.sticker_price.text = StickerList.sticker_price

        var animation  = AnimationUtils.loadAnimation(context, R.anim.fade)
        views!!.startAnimation(animation)
        return views as View
    }

    override fun getCount(): Int {
      return  sticker_list.count()
    }

    override fun getItem(position: Int): Any {
        return sticker_list.get(position)
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }


}