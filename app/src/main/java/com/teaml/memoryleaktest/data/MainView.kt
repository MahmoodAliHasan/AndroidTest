package com.teaml.memoryleaktest.data

/**
 * Created by Mahmood Ali on 30/04/2018.
 */
sealed class MainView

data class ImgClass(val imgRes: Int) : MainView()

data class TxtClass(val title: String) : MainView()