package com.chooongg.echarts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.color.MaterialColors
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val echartsView = findViewById<EChartsView>(R.id.echarts_view)
        echartsView.setOption {
            title {
                text("测试图表标题")
                subtext("副标题")
                textStyle {
                    color(
                        MaterialColors.getColor(echartsView, androidx.appcompat.R.attr.colorPrimary)
                    )
                }
            }
        }
        echartsView.setOptionJson {
            put("title", "测试图表标题")
            put("subtext", "副标题")
            put("textStyle",JSONObject().apply {
                put("color", MaterialColors.getColor(echartsView, androidx.appcompat.R.attr.colorPrimary))
            })
        }
    }
}