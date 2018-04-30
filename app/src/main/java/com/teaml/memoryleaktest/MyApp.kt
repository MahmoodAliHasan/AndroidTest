package com.teaml.memoryleaktest

import android.app.Application
import com.squareup.leakcanary.LeakCanary

/**
 * Created by Mahmood Ali on 29/04/2018.
 */

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return
        }

        LeakCanary.install(this)
        // Normal app init code...
    }
}