package com.chooongg.echarts.option

import androidx.annotation.FloatRange
import androidx.annotation.Keep
import androidx.annotation.StringDef
import com.chooongg.echarts.*
import com.chooongg.echarts.option.style.EChartsItemStyle
import com.chooongg.echarts.option.style.EChartsLineStyle
import com.chooongg.echarts.option.style.EChartsTextStyle
import com.google.gson.JsonObject
import java.net.URL

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
    private var lineStyle: EChartsLineStyle? = null,
    private var symbolRotate: Any? = null,
    private var formatter: String? = null,
    private var selectedMode: String? = null,
    private var inactiveColor: String? = null,
    private var inactiveBorderColor: String? = null,
    private var inactiveBorderWidth: Number? = null,
    private var selected: JsonObject? = null,
    private var textStyle: EChartsTextStyle? = null,
    private var tooltip: EchartsTooltip? = null,
    private var icon: String? = null,
    private var data: List<LegendData>? = null,
    private var backgroundColor: String? = null,
    private var borderColor: String? = null,
    private var borderWidth: Number? = null,
    private var borderRadius: Any? = null,
    private var shadowBlur: Number? = null,
    private var shadowColor: String? = null,
    private var shadowOffsetX: Number? = null,
    private var shadowOffsetY: Number? = null,
    private var scrollDataIndex: Number? = null,
    private var pageButtonItemGap: Number? = null,
    private var pageButtonGap: Number? = null,
    private var pageButtonPosition: String? = null,
    private var pageFormatter: String? = null,
    private var pageIcons: PageIcons? = null,
    private var pageIconColor: String? = null,
    private var pageIconInactiveColor: String? = null,
    private var pageIconSize: Any? = null,
    private var pageTextStyle: EChartsTextStyle? = null,
    private var animation: Boolean? = null,
    private var animationDurationUpdate: Number? = null,
    private var emphasis: String? = null,
    private var selector: String? = null,
    private var selectorLabel: String? = null,
    private var selectorPosition: String? = null,
    private var selectorItemGap: String? = null,
    private var selectorButtonGap: String? = null,
) {

    @StringDef("plain", "scroll")
    private annotation class LegendType

    @StringDef("start", "end")
    private annotation class PageButtonPosition

    /**
     * 图例的类型。
     */
    fun type(@LegendType value: String) {
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

    /**
     * 图例图形中线的样式，用于诸如折线图图例横线的样式设置。
     */
    fun lineStyle(block: EChartsLineStyle.() -> Unit) {
        lineStyle = EChartsLineStyle().apply(block)
    }

    /**
     * 图形旋转角度，类型为 number | 'inherit'。
     */
    fun symbolRotate(value: String) {
        symbolRotate = value
    }

    /**
     * 图形旋转角度，类型为 number | 'inherit'。
     */
    fun symbolRotate(value: Number) {
        symbolRotate = value
    }

    /**
     * 用来格式化图例文本，支持字符串模板和回调函数两种形式。
     * // 使用字符串模板，模板变量为图例名称 {name}
     * formatter: 'Legend {name}'
     * // 使用回调函数
     * formatter: function (name) {
     *     return 'Legend ' + name;
     * }
     */
    fun formatter(value: String) {
        formatter = value
    }

    /**
     * 图例关闭时的颜色。
     */
    fun inactiveColor(value: String) {
        inactiveColor = value
    }

    /**
     * 图例关闭时的颜色。
     */
    fun inactiveColor(color: Int) {
        inactiveColor = EChartsUtils.colorToString(color)
    }

    /**
     * 图例关闭时的描边颜色。
     */
    fun inactiveBorderColor(value: String) {
        inactiveBorderColor = value
    }

    /**
     * 图例关闭时的描边颜色。
     */
    fun inactiveBorderColor(color: Int) {
        inactiveBorderColor = EChartsUtils.colorToString(color)
    }

    /**
     * 图例关闭时的描边粗细。
     */
    fun inactiveBorderWidth(value: Number) {
        inactiveBorderWidth = value
    }

    /**
     * 图例选中状态表。
     */
    fun selected(vararg value: Pair<String, Boolean>) {
        selected = JsonObject().apply { value.forEach { addProperty(it.first, it.second) } }
    }

    /**
     * 图例的公用文本样式。
     */
    fun textStyle(block: EChartsTextStyle.() -> Unit) {
        textStyle = EChartsTextStyle().apply(block)
    }

    /**
     * 图例的 tooltip 配置，配置项同 tooltip。
     */
    fun tooltip(block: EchartsTooltip.() -> Unit) {
        tooltip = EchartsTooltip().apply(block)
    }

    /**
     * 图例项的 icon。
     */
    fun icon(@EChartsIcon value: String) {
        icon = value
    }

    /**
     * 图例项的 icon。
     */
    fun icon(value: URL) {
        icon = "image//${value}"
    }

    /**
     * 图例的数据数组。
     * 如果 data 没有被指定，会自动从当前系列中获取。
     */
    fun data(vararg block: LegendData.() -> Unit) {
        data = List(block.size) { LegendData().apply(block[it]) }
    }

    /**
     * 图例背景色，默认透明。
     */
    fun backgroundColor(value: String) {
        backgroundColor = value
    }

    /**
     * 图例背景色，默认透明。
     */
    fun backgroundColor(color: Int) {
        backgroundColor = EChartsUtils.colorToString(color)
    }

    /**
     * 图例的边框颜色。
     */
    fun borderColor(value: String) {
        borderColor = value
    }

    /**
     * 图例的边框颜色。
     */
    fun borderColor(color: Int) {
        borderColor = EChartsUtils.colorToString(color)
    }

    /**
     * 图例的边框线宽。
     */
    fun borderWidth(value: Number) {
        borderWidth = value
    }

    /**
     * 圆角半径，单位px，支持传入数组分别指定 4 个圆角半径。
     */
    fun borderRadius(value: Number) {
        borderRadius = value
    }

    /**
     * 圆角半径，单位px，支持传入数组分别指定 4 个圆角半径。
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
     * 阴影颜色。支持的格式同color。
     */
    fun shadowColor(value: String) {
        shadowColor = value
    }

    /**
     * 阴影颜色。支持的格式同color。
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

    /**
     * legend.type 为 'scroll' 时有效。
     * 图例当前最左上显示项的 dataIndex。
     */
    fun scrollDataIndex(value: Number) {
        scrollDataIndex = value
    }

    /**
     * 图例控制块中，按钮和页信息之间的间隔。
     */
    fun pageButtonItemGap(value: Number) {
        pageButtonItemGap = value
    }

    /**
     * 图例控制块和图例项之间的间隔。
     */
    fun pageButtonGap(value: Number) {
        pageButtonGap = value
    }

    /**
     * 图例控制块的位置。
     */
    fun pageButtonPosition(@PageButtonPosition value: String) {
        pageButtonPosition = value
    }

    /**
     * 图例控制块中，页信息的显示格式。默认为 '{current}/{total}'。
     * 其中 {current} 是当前页号（从 1 开始计数），{total} 是总页数。
     */
    fun pageFormatter(value: String) {
        pageFormatter = value
    }

    /**
     * 图例控制块的图标。
     */
    fun pageIcons(block: PageIcons.() -> Unit) {
        pageIcons = PageIcons().apply(block)
    }

    /**
     * 翻页按钮的颜色。
     */
    fun pageIconColor(value: String) {
        pageIconColor = value
    }

    /**
     * 翻页按钮的颜色。
     */
    fun pageIconColor(color: Int) {
        pageIconColor = EChartsUtils.colorToString(color)
    }

    /**
     * 翻页按钮不激活时（即翻页到头时）的颜色。
     */
    fun pageIconInactiveColor(value: String) {
        pageIconInactiveColor = value
    }

    /**
     * 翻页按钮不激活时（即翻页到头时）的颜色。
     */
    fun pageIconInactiveColor(color: Int) {
        pageIconInactiveColor = EChartsUtils.colorToString(color)
    }

    /**
     * 翻页按钮的大小。
     */
    fun pageIconSize(value: Number) {
        pageIconSize = value
    }

    /**
     * 翻页按钮的大小。
     */
    fun pageIconSize(value1: Number, value2: Number) {
        pageIconSize = listOf(value1, value2)
    }

    /**
     * 图例页信息的文字样式。
     */
    fun pageTextStyle(block: EChartsTextStyle.() -> Unit) {
        pageTextStyle = EChartsTextStyle().apply(block)
    }

    /**
     * 图例翻页是否使用动画。
     */
    fun animation(value: Boolean) {
        animation = value
    }

    /**
     * 图例翻页时的动画时长。
     */
    fun animationDurationUpdate(value: Number) {
        animationDurationUpdate = value
    }

    fun emphasis() {

    }

    data class LegendData(
        private var name: String? = null
    ) {

    }

    data class PageIcons(
        private var horizontal: List<String>? = null,
        private var vertical: List<String>? = null,
    ) {

        fun horizontal(url1: URL, url2: URL) {
            val temp1 = "image://${url1}"
            val temp2 = "image://${url2}"
            horizontal = listOf(temp1, temp2)
        }

        fun horizontal(path1: String, path2: String) {
            val temp1 = "path://${path1}"
            val temp2 = "path://${path2}"
            horizontal = listOf(temp1, temp2)
        }

        fun vertical(url1: URL, url2: URL) {
            val temp1 = "image://${url1}"
            val temp2 = "image://${url2}"
            vertical = listOf(temp1, temp2)
        }

        fun vertical(path1: String, path2: String) {
            val temp1 = "path://${path1}"
            val temp2 = "path://${path2}"
            vertical = listOf(temp1, temp2)
        }
    }
}
