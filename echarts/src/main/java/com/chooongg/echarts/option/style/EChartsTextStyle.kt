package com.chooongg.echarts.option.style

import androidx.annotation.Keep
import com.chooongg.echarts.*

@Keep
data class EChartsTextStyle(
    private var color: String? = null,
    private var fontStyle: String? = null,
    private var fontWeight: Any? = null,
    private var fontFamily: String? = null,
    private var fontSize: Number? = null,
    private var lineHeight: Number? = null,
    private var width: Number? = null,
    private var height: Number? = null,
    private var textBorderColor: String? = null,
    private var textBorderWidth: Number? = null,
    private var textBorderType: Any? = null,
    private var textBorderDashOffset: Number? = null,
    private var textShadowColor: String? = null,
    private var textShadowBlur: Number? = null,
    private var textShadowOffsetX: Number? = null,
    private var textShadowOffsetY: Number? = null,
    private var overflow: String? = null,
    private var ellipsis: String? = null,
    private var rich: String? = null,
) {

    /**
     * 文字的颜色。
     */
    fun color(value: String) {
        color = value
    }

    /**
     * 文字的颜色。
     */
    fun color(color: Int) {
        this.color = EChartsUtils.colorToString(color)
    }

    /**
     * 文字字体的风格。
     */
    fun fontStyle(@EChartsFontStyle value: String) {
        fontStyle = value
    }

    /**
     * 文字字体的粗细。
     */
    fun fontWeight(@EChartsFontWeight value: String) {
        fontWeight = value
    }

    /**
     * 文字字体的粗细。
     */
    fun fontWeight(value: Int) {
        fontWeight = value
    }

    /**
     * 文字的字体系列。
     */
    fun fontFamily(value: String) {
        fontFamily = value
    }

    /**
     * 文字的字体大小。
     */
    fun fontSize(value: Number) {
        fontSize = value
    }

    /**
     * 行高。
     */
    fun lineHeight(value: Number) {
        lineHeight = value
    }

    /**
     * 文本显示宽度。
     */
    fun width(value: Number) {
        width = value
    }

    /**
     * 文本显示高度。
     */
    fun height(value: Number) {
        height = value
    }

    /**
     * 文字本身的描边颜色。
     */
    fun textBorderColor(value: String) {
        textBorderColor = value
    }

    /**
     * 文字本身的描边颜色。
     */
    fun textBorderColor(color: Int) {
        textBorderColor = EChartsUtils.colorToString(color)
    }

    /**
     * 文字本身的描边宽度。
     */
    fun textBorderWidth(value: Number) {
        textBorderWidth = value
    }

    /**
     * 文字本身的描边类型。
     */
    fun textBorderType(@EChartsBorderType value: String) {
        textBorderType = value
    }

    /**
     * 文字本身的描边类型。
     */
    fun textBorderType(value: Int) {
        textBorderType = value
    }

    /**
     * 文字本身的描边类型。
     */
    fun textBorderType(vararg value: Int) {
        textBorderType = value.toList()
    }

    /**
     * 用于设置虚线的偏移量。
     */
    fun textBorderDashOffset(value: Number) {
        textBorderDashOffset = value
    }

    /**
     * 文字本身的阴影颜色。
     */
    fun textShadowColor(value: String) {
        textShadowColor = value
    }

    /**
     * 文字本身的阴影颜色。
     */
    fun textShadowColor(color: Int) {
        textShadowColor = EChartsUtils.colorToString(color)
    }

    /**
     * 文字本身的阴影长度。
     */
    fun textShadowBlur(value: Number) {
        textShadowBlur = value
    }

    /**
     * 文字本身的阴影 X 偏移。
     */
    fun textShadowOffsetX(value: Number) {
        textShadowOffsetX = value
    }

    /**
     * 文字本身的阴影 Y 偏移。
     */
    fun textShadowOffsetY(value: Number) {
        textShadowOffsetY = value
    }

    /**
     * 文字超出宽度是否截断或者换行。配置width时有效
     */
    fun overflow(@EChartsOverflow value: String) {
        overflow = value
    }

    /**
     * 在overflow配置为'truncate'的时候，可以通过该属性配置末尾显示的文本。
     */
    fun ellipsis(value:String){
        ellipsis = value
    }
}