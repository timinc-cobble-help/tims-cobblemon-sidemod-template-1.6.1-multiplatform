package {{package.original}}.{{sideMod.lowerCase}}

import us.timinc.mc.cobblemon.timcore.AbstractConfig
import us.timinc.mc.cobblemon.timcore.AbstractMod

const val MOD_ID: String = "{{sideMod.snakeCase}}"

object {{sideMod.upperCase}} : AbstractMod<{{sideMod.upperCase}}.{{sideMod.upperCase}}Config>(MOD_ID, {{sideMod.upperCase}}Config::class.java) {

    class {{sideMod.upperCase}}Config : AbstractConfig() {
    }

    init {
    }
}