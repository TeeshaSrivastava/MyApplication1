package com.example.myappllication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.opencv.android.OpenCVLoader
import com.example.myappllication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (OpenCVLoader.initDebug()) {
            Toast.makeText(this, "OpenCV loaded successfully", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Failed to load OpenCV", Toast.LENGTH_LONG).show()
        }
    }
}





