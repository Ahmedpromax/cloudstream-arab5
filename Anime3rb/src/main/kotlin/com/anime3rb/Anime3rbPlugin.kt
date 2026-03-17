package com.anime3rb

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class Anime3rbPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Anime3rbProvider())
    }
}
