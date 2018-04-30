package com.teaml.memoryleaktest.ui.mutitype.adatper

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.teaml.memoryleaktest.R
import com.teaml.memoryleaktest.data.ImgClass
import com.teaml.memoryleaktest.data.MainView
import com.teaml.memoryleaktest.data.TxtClass

/**
 * Created by Mahmood Ali on 30/04/2018.
 */
class MainAdapter (private val mItemList: MutableList<MainView>): RecyclerView.Adapter<SealedAdapterViewHolder>() {

    companion object {
        private const val IMG_VH = 0
        private const val TXT_VH = 1
    }


    override fun getItemViewType(position: Int): Int {
        return when(mItemList[position]) {
            is ImgClass -> IMG_VH
            is TxtClass -> TXT_VH
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SealedAdapterViewHolder {

        return when (viewType) {
            TXT_VH -> TxtVH(LayoutInflater.from(parent.context).inflate(R.layout.text_view_holder, parent, false))

            else -> ImgVH(LayoutInflater.from(parent.context).inflate(R.layout.img_view_holder, parent, false))
        }
    }

    override fun getItemCount(): Int = mItemList.count()

    override fun onBindViewHolder(holder: SealedAdapterViewHolder, position: Int) {
        when (holder) {
            is ImgVH -> holder.bindImg(mItemList[position] as ImgClass)

            is TxtVH -> holder.bindTitle(mItemList[position] as TxtClass)
        }
    }


}