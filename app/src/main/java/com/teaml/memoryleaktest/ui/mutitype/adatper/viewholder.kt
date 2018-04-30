package com.teaml.memoryleaktest.ui.mutitype.adatper

import android.support.v7.widget.RecyclerView
import android.view.View
import com.teaml.memoryleaktest.data.ImgClass
import com.teaml.memoryleaktest.data.TxtClass
import kotlinx.android.synthetic.main.img_view_holder.view.*
import kotlinx.android.synthetic.main.text_view_holder.view.*


/**
 * Created by Mahmood Ali on 30/04/2018.
 */

sealed class SealedAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view)

class TxtVH(view: View) : SealedAdapterViewHolder(view) {

    fun bindTitle(txtClass: TxtClass) {
        itemView.txtTitle.text = txtClass.title
    }
}

class ImgVH(view: View) : SealedAdapterViewHolder(view) {

    fun bindImg(imgClass: ImgClass) {
        itemView.imgView.setImageResource(imgClass.imgRes)
    }
}