package com.movtery.zalithlauncher.game.renderer.renderers

import android.content.Context
import com.movtery.zalithlauncher.R
import com.movtery.zalithlauncher.game.renderer.RendererInterface

class PanfrostRenderer(private val context: Context) : RendererInterface {
    override fun getRendererId(): String = "gallium_panfrost"

    override fun getUniqueIdentifier(): String = "9b2808c4-11af-4c72-a9c6-94c940396475"

    override fun getRendererName(): String = context.getString(R.string.renderer_name_panfrost)

    override fun getMaxMCVersion(): String = "1.21.4"

    override fun getRendererEnv(): Lazy<Map<String, String>> = lazy { emptyMap() }

    override fun getDlopenLibrary(): Lazy<List<String>> = lazy { emptyList() }

    override fun getRendererLibrary(): String = "libOSMesa_2300d.so"
}