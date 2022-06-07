package com.chooongg.echarts.option

import androidx.annotation.FloatRange
import androidx.annotation.Keep
import com.chooongg.echarts.*
import com.chooongg.echarts.option.style.EChartsItemStyle

@Keep
data class EChartsLegend(
    private var type: String? = null,
    private var id: String? = null,
    private var show: Boolean? = null,
    private var zlevel: Number? = null,
    private var z: Number? = null,
    private var left: Any? = null,
    private var top: Any? = null,
    private var right: Any? = null,
    private var bottom: Any? = null,
    private var width: Number? = null,
    private var height: Number? = null,
    private var orient: String? = null,
    private var align: String? = null,
    private var padding: Any? = null,
    private var itemGap: Number? = null,
    private var itemWidth: Number? = null,
    private var itemHeight: Number? = null,
    private var itemStyle: EChartsItemStyle? = null,
    private var lineStyle: String? = null,
    private var symbolRotate: String? = null,
    private var formatter: String? = null,
    private var selectedMode: String? = null,
    private var inactiveColor: String? = null,
    private var inactiveBorderColor: String? = null,
    private var inactiveBorderWidth: String? = null,
    private var selected: String? = null,
    private var textStyle: String? = null,
    private var tooltip: String? = null,
    private var icon: String? = null,
    private var data: String? = null,
    private var backgroundColor: String? = null,
    private var borderColor: String? = null,
    private var borderWidth: String? = null,
    private var borderRadius: String? = null,
    private var shadowBlur: String? = null,
    private var shadowColor: String? = null,
    private var shadowOffsetX: String? = null,
    private var shadowOffsetY: String? = null,
    private var scrollDataIndex: String? = null,
    private var pageButtonItemGap: String? = null,
    private var pageButtonGap: String? = null,
    private var pageButtonPosition: String? = null,
    private var pageFormatter: String? = null,
    private var pageIcons: String? = null,
    private var pageIconColor: String? = null,
    private var pageIconInactiveColor: String? = null,
    private var pageIconSize: String? = null,
    private var pageTextStyle: String? = null,
    private var animation: String? = null,
    private var animationDurationUpdate: String? = null,
    private var emphasis: String? = null,
    private var selector: String? = null,
    private var selectorLabel: String? = null,
    private var selectorPosition: String? = null,
    private var selectorItemGap: String? = null,
    private var selectorButtonGap: String? = null,
) {

    /**
     * 图例的类型。
     */
    fun type(@EChartsLegendType value: String) {
        type = value
    }

    /**
     * 组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。
     */
    fun id(value: String) {
        id = value
    }

    /**
     * 是否显示图例。
     */
    fun show(value: Boolean) {
        show = value
    }

    /**
     * 所有图形的 zlevel 值。
     */
    fun zlevel(value: Number) {
        zlevel = value
    }

    /**
     * 组件的所有图形的z值。控制图形的前后顺序。z值小的图形会被z值大的图形覆盖。
     */
    fun z(value: Number) {
        z = value
    }

    /**
     * 图例组件离容器左侧的距离。
     */
    fun left(@EChartsHorizontal value: String) {
        left = value
    }

    /**
     * 图例组件离容器左侧的距离。
     */
    fun left(value: Int) {
        left = value
    }

    /**
     * 图例组件离容器左侧的距离。
     */
    fun left(@FloatRange(from = 0.0, to = 1.0) value: Float) {
        left = "${(value * 100).toInt()}%"
    }

    /**
     * 图例组件离容器上侧的距离。
     */
    fun top(@EChartsVertical value: String) {
        top = value
    }

    /**
     * 图例组件离容器上侧的距离。
     */
    fun top(value: Int) {
        top = value
    }

    /**
     * 图例组件离容器上侧的距离。
     */
    fun top(@FloatRange(from = 0.0, to = 1.0) value: Float) {
        top = "${(value * 100).toInt()}%"
    }

    /**
     * 图例组件离容器右侧的距离。
     */
    fun right(value: Int) {
        right = value
    }

    /**
     * 图例组件离容器右侧的距离。
     */
    fun right(@FloatRange(from = 0.0, to = 1.0) value: Float) {
        right = value
    }

    /**
     * 图例组件离容器下侧的距离。
     */
    fun bottom(value: Int) {
        bottom = value
    }

    /**
     * 图例组件离容器下侧的距离。
     */
    fun bottom(@FloatRange(from = 0.0, to = 1.0) value: Float) {
        bottom = value
    }

    /**
     * 图例组件的宽度。默认自适应。
     */
    fun width(value: Number) {
        width = value
    }

    /**
     * 图例组件的高度。默认自适应。
     */
    fun height(value: Number) {
        height = value
    }

    /**
     * 图例列表的布局朝向。
     */
    fun orient(@EChartsOrient value: String) {
        orient = value
    }

    /**
     * 图例标记和文本的对齐。默认自动。
     */
    fun align(@EChartsAlign value: String) {
        align = value
    }

    /**
     * 图例内边距，单位px
     */
    fun padding(value: Number) {
        padding = value
    }

    /**
     * 图例内边距，设置上下，左右的内边距
     */
    fun padding(topBottom: Number, leftRight: Number) {
        padding = listOf(topBottom, leftRight)
    }

    /**
     * 图例内边距，分别设置四个方向的内边距
     */
    fun padding(top: Number, right: Number, bottom: Number, left: Number) {
        padding = listOf(top, right, bottom, left)
    }

    /**
     * 图例每项之间的间隔。横向布局时为水平间隔，纵向布局时为纵向间隔。
     */
    fun itemGap(value: Number) {
        itemGap = value
    }

    /**
     * 图例标记的图形宽度。
     */
    fun itemWidth(value: Number) {
        itemWidth = value
    }

    /**
     * 图例标记的图形高度。
     */
    fun itemHeight(value: Number) {
        itemHeight = value
    }

    /**
     * 图例的图形样式。
     */
    fun itemStyle(block: EChartsItemStyle.() -> Unit) {
        itemStyle = EChartsItemStyle().apply(block)
    }
}
