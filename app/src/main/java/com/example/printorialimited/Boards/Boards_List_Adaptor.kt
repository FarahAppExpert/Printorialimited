package com.example.printorialimited.Boards

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.printorialimited.R

class Boards_List_Adaptor (context: Context, board_list : ArrayList<Boards_List>) : BaseAdapter(){

    var context: Context
    var board_list: ArrayList<Boards_List>

    init {
        this.context = context
        this.board_list = board_list
    }


   private class ViewHolder (view : View?)
    {
        var board_image : ImageView
        var board_name : TextView
        var board_price : TextView

        init {
            board_image = view?.findViewById(R.id.board_image) as ImageView
            board_name = view?.findViewById(R.id.board_name) as TextView
            board_price = view?.findViewById(R.id.board_price) as TextView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var views : View?
        var viewHolder : ViewHolder

        if (convertView == null)
        {
            var layout = LayoutInflater.from(context)
            views = layout.inflate(R.layout.boards_list, parent, false)
            viewHolder = ViewHolder(views)
            views.tag = viewHolder

        }
        else
        {
            views = convertView
            viewHolder = views.tag as ViewHolder
        }

        var BoardsLists : Boards_List = getItem(position) as Boards_List
        viewHolder.board_image.setImageResource(BoardsLists.board_image)
        viewHolder.board_name.text = BoardsLists.board_name
        viewHolder.board_price.text = BoardsLists.board_price

        var animation  = AnimationUtils.loadAnimation(context, R.anim.fade)
        views!!.startAnimation(animation)
        return views as View
    }

    override fun getCount(): Int {
      return board_list.count()
    }

    override fun getItem(position: Int): Any {
      return  board_list.get(position)
    }

    override fun getItemId(position: Int): Long {
      return  position.toLong()
    }

}