package com.hakkicanbuluc.foursquarekotlinclone

import android.app.Application
import com.parse.Parse

class StarterApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG)

        Parse.initialize(Parse.Configuration.Builder(this)
            .applicationId("")
            .clientKey("")
            .server("")
            .build())
    }
}