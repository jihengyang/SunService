package com.sun.sunservice

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * Created by hengyangji on 2022/9/28
 */
class SunService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}