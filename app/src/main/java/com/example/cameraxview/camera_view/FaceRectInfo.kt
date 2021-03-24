package com.example.cameraxview.camera_view

import android.graphics.Rect

/**
 * @author Create By 张晋铭
 * @Date on 2021/2/18
 * @Describe:人脸图像数据信息实体
 */
class FaceRectInfo(var rect: Rect? = null,
                   var sex: Int = 0,
                   var age: Int = 0,
                   var liveness: Int = 0,
                   var color: Int = 0,
                   var name: String? = null) {
    private val TAG = "TAG_FaceRectInfo"
}