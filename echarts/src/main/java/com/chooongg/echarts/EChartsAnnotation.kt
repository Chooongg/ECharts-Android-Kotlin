package com.chooongg.echarts

import androidx.annotation.StringDef

@StringDef("self", "blank")
annotation class EChartsLinkTarget

@StringDef("auto", "left", "right", "center")
annotation class EChartsHorizontal

@StringDef("auto", "top", "bottom", "middle")
annotation class EChartsVertical

@StringDef("normal","italic","oblique")
annotation class EChartsFontStyle

@StringDef("normal","bold","bolder","lighter")
annotation class EChartsFontWeight

@StringDef("solid","dashed","dotted")
annotation class EChartsBorderType

@StringDef("none","truncate","break","breakAll")
annotation class EChartsOverflow

@StringDef("plain","scroll")
annotation class EChartsLegendType

@StringDef("horizontal","vertical")
annotation class EChartsOrient

@StringDef("auto","left","right")
annotation class EChartsAlign