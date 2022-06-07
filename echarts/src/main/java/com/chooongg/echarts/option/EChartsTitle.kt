package com.chooongg.echarts.option

import androidx.annotation.FloatRange
import androidx.annotation.Keep
import com.chooongg.echarts.EChartsHorizontal
import com.chooongg.echarts.EChartsLinkTarget
import com.chooongg.echarts.EChartsUtils
import com.chooongg.echarts.EChartsVertical
import com.chooongg.echarts.option.style.EChartsTextStyle

@Keep
data class EChartsTitle(
    private var id: String? = null,
    private var show: Boolean? = null,
    private var text: String? = null,
    private var link: String? = null,
    private var target: String? = null,
    private var textStyle: EChartsTextStyle? = null,
    private var subtext: String? = null,
    private var sublink: String? = null,
    private var subtarget: String? = null,
    private var subtextStyle: EChartsTextStyle? = null,
    private var textAlign: String? = null,
    private var textVerticalAlign: String? = null,
    private var triggerEvent: Boolean? = null,
    private var padding: Any? = null,
    private var itemGap: Number? = null,
    private var zlevel: Number? = null,
    private var z: Number? = null,
    private var left: Any? = null,
    private var top: Any? = null,
    private var right: Any? = null,
    private var bottom: Any? = null,
    private var backgroundColor: String? = null,
    private var borderColor: String? = null,
    private var borderWidth: Number? = null,
    private var borderRadius: Any? = null,
    private var shadowBlur: Number? = null,
    private var shadowColor: String? = null,
    private var shadowOffsetX: Number? = null,
    private var shadowOffsetY: Number? = null,
) {

    /**
     * 组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。
     */
    fun id(value: String) {
        id = value
    }

    /**
     * 是否显示标题组件。
     */
    fun show(value: Boolean) {
        show = value
    }

    /**
     * 主标题文本，支持使用 \n 换行。
     */
    fun text(value: String) {
        text = value
    }

    /**
     * 主标题文本超链接。
     */
    fun link(value: String) {
        link = value
    }

    /**
     * 指定窗口打开主标题超链接。
     */
    fun target(@EChartsLinkTarget value: String) {
        target = value
    }

    /**
     * 主标题文字风格。
     */
    fun textStyle(block: EChartsTextStyle.() -> Unit) {
        textStyle = EChartsTextStyle().apply(block)
    }

    /**
     * 副标题文本，支持使用 \n 换行。
     */
    fun subtext(value: String) {
        subtext = value
    }

    /**
     * 副标题文本超链接。
     */
    fun sublink(value: String) {
        sublink = value
    }

    /**
     * 指定窗口打开副标题超链接。
     */
    fun subtarget(@EChartsLinkTarget value: String) {
        subtarget = value
    }

    /**
     * 副标题文字风格。
     */
    fun subtextStyle(block: EChartsTextStyle.() -> Unit) {
        subtextStyle = EChartsTextStyle().apply(block)
    }

    /**
     * 整体（包括 text 和 subtext）的水平对齐。
     */
    fun textAlign(@EChartsHorizontal value: String) {
        textAlign = value
    }

    /**
     * 整体（包括 text 和 subtext）的垂直对齐。
     */
    fun textVerticalAlign(@EChartsVertical value: String) {
        textVerticalAlign = value
    }

    /**
     * 是否触发事件。
     */
    fun triggerEvent(value: Boolean) {
        triggerEvent = value
    }

    /**
     * 标题内边距，单位px
     */
    fun padding(value: Number) {
        padding = value
    }

    /**
     * 标题内边距，设置上下，左右的内边距
     */
    fun padding(topBottom: Number, leftRight: Number) {
        padding = listOf(topBottom, leftRight)
    }

    /**
     * 标题内边距，分别设置四个方向的内边距
     */
    fun padding(top: Number, right: Number, bottom: Number, left: Number) {
        padding = listOf(top, right, bottom, left)
    }

    /**
     * 主副标题之间的间距。
     */
    fun itemGap(value: Number) {
        itemGap = value
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
     * title 组件离容器左侧的距离。
     */
    fun left(@EChartsHorizontal value: String) {
        left = value
    }

    /**
     * title 组件离容器左侧的距离。
     */
    fun left(value: Int) {
        left = value
    }

    /**
     * title 组件离容器左侧的距离。
     */
    fun left(@FloatRange(from = 0.0, to = 1.0) value: Float) {
        left = "${(value * 100).toInt()}%"
    }

    /**
     * title 组件离容器上侧的距离。
     */
    fun top(@EChartsVertical value: String) {
        top = value
    }

    /**
     * title 组件离容器上侧的距离。
     */
    fun top(value: Int) {
        top = value
    }

    /**
     * title 组件离容器上侧的距离。
     */
    fun top(@FloatRange(from = 0.0, to = 1.0) value: Float) {
        top = "${(value * 100).toInt()}%"
    }

    /**
     * title 组件离容器右侧的距离。
     */
    fun right(value: Int) {
        right = value
    }

    /**
     * title 组件离容器右侧的距离。
     */
    fun right(@FloatRange(from = 0.0, to = 1.0) value: Float) {
        right = value
    }

    /**
     * title 组件离容器下侧的距离。
     */
    fun bottom(value: Int) {
        bottom = value
    }

    /**
     * title 组件离容器下侧的距离。
     */
    fun bottom(@FloatRange(from = 0.0, to = 1.0) value: Float) {
        bottom = value
    }

    /**
     * 标题背景色，默认透明。
     */
    fun backgroundColor(value: String) {
        backgroundColor = value
    }

    /**
     * 标题背景色，默认透明。
     */
    fun backgroundColor(color: Int) {
        backgroundColor = EChartsUtils.colorToString(color)
    }

    /**
     * 标题的边框颜色。
     */
    fun borderColor(value: String) {
        borderColor = value
    }

    /**
     * 标题的边框颜色。
     */
    fun borderColor(color: Int) {
        borderColor = EChartsUtils.colorToString(color)
    }

    /**
     * 标题的边框线宽。
     */
    fun borderWidth(value: Number) {
        borderWidth = value
    }

    /**
     * 圆角半径，单位px。
     */
    fun borderRadius(value: Number) {
        borderRadius = value
    }

    /**
     * 圆角半径，单位px。
     */
    fun borderRadius(leftTop: Number, rightTop: Number, rightBottom: Number, leftBottom: Number) {
        borderRadius = listOf(leftTop, rightTop, rightBottom, leftBottom)
    }

    /**
     * 图形阴影的模糊大小。
     */
    fun shadowBlur(value: Number) {
        shadowBlur = value
    }

    /**
     * 阴影颜色。
     */
    fun shadowColor(value: String) {
        shadowColor = value
    }

    /**
     * 阴影颜色。
     */
    fun shadowColor(color: Int) {
        shadowColor = EChartsUtils.colorToString(color)
    }

    /**
     * 阴影水平方向上的偏移距离。
     */
    fun shadowOffsetX(value: Number) {
        shadowOffsetX = value
    }

    /**
     * 阴影垂直方向上的偏移距离。
     */
    fun shadowOffsetY(value: Number) {
        shadowOffsetY = value
    }
}