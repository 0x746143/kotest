package com.sksamuel.kotest

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.extensions.Extension

class ProjectConfig : AbstractProjectConfig() {
   override fun extensions(): List<Extension> = listOf(CIServerTagExtension)
}
