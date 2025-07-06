package {{package.original}}.{{sideMod.lowerCase}}.neoforge

import net.neoforged.fml.common.Mod
import {{package.original}}.{{sideMod.lowerCase}}.{{sideMod.upperCase}}
import {{package.original}}.{{sideMod.lowerCase}}.MOD_ID
import us.timinc.mc.cobblemon.timcore.neoforge.AbstractNeoForgeMod

@Mod(MOD_ID)
object {{sideMod.upperCase}}NeoForge : AbstractNeoForgeMod({{sideMod.upperCase}})