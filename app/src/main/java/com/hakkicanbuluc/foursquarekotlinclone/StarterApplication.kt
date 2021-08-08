package com.hakkicanbuluc.foursquarekotlinclone

import android.app.Application
import com.parse.Parse
import com.parse.ParseACL
import com.parse.ParseUser

class StarterApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG)

        Parse.initialize(Parse.Configuration.Builder(this)
            .applicationId("SgbqlZGoaxGy7ZauBwFnvuWMrEOnMPDYjsSTI2jL")
            .clientKey("TXCMkMYl742Lrh2Os8WSdIdukJdyNFrYfbIdLwD6")
            .server("https://parseapi.back4app.com/")
            .build())
    }
}