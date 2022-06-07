package com.chooongg.echarts.option

import androidx.annotation.Keep

@Keep
data class EChartsOption(
    private var title: EChartsTitle? = null,
    private var legend: EChartsLegend? = null,
) {

    constructor(block: EChartsOption.() -> Unit) : this() {
        block()
    }

    fun title(block: EChartsTitle.() -> Unit) {
        title = EChartsTitle().apply(block)
    }

    fun legend(block: EChartsLegend.() -> Unit) {
        legend = EChartsLegend().apply(block)
    }
}