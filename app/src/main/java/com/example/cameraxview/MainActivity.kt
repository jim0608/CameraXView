package com.example.cameraxview

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import com.example.cameraxview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val dataBinding by lazy<ActivityMainBinding> { DataBindingUtil.setContentView(this,R.layout.activity_main)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initCamera()
    }

    private fun  initCamera() {
        dataBinding.faceCamera.setCameraSize(Size(1280, 720))
        dataBinding.faceCamera.setCameraId(1)
        dataBinding.faceCamera.isClipPicture(false)
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.CAMERA
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
        dataBinding.faceCamera.bindToLifecycle(this)
    }
}