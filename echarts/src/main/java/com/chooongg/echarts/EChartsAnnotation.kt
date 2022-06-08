package com.chooongg.echarts

import androidx.annotation.StringDef

@StringDef("self", "blank")
internal annotation class EChartsLinkTarget

@StringDef("auto", "left", "right", "center")
internal annotation class EChartsHorizontal

@StringDef("auto", "top", "bottom", "middle")
internal annotation class EChartsVertical

@StringDef("normal","italic","oblique")
internal annotation class EChartsFontStyle

@StringDef("normal","bold","bolder","lighter")
internal annotation class EChartsFontWeight

@StringDef("solid","dashed","dotted")
internal annotation class EChartsBorderType

@StringDef("none","truncate","break","breakAll")
internal annotation class EChartsOverflow

@StringDef("horizontal","vertical")
internal annotation class EChartsOrient

@StringDef("auto","left","right")
internal annotation class EChartsAlign

@StringDef("circle","rect","roundRect","triangle","diamond","pin","arrow","none")
internal annotation class EChartsIcon