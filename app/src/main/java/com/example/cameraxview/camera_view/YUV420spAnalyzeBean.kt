package com.example.cameraxview.camera_view

/**
 * @author Create By 张晋铭
 * @Date on 2021/3/4
 * @Describe:
 */
class YUV420spAnalyzeBean {
    /**
     * 返回nv21预览数据
     * @param nv21 每一帧图片的nv21格式;
     * @param rotate 帧画面旋转角度
     * @param widthSize 图片宽size
     * @param heightSize 图片高size
     */
    private val TAG = "TAG_Nv21AnalyzeBean"
    var nv21: ByteArray? = null
    var rotateDegree: Int = 0
    var imgWidth: Int = 0
    var imgHeight: Int = 0

}