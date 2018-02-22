package com.example.markiiimark.memeify

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_take_picture.*

class TakePictureActivity: AppCompatActivity(), View.OnClickListener {
    private var selectedPhotoPath: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_picture)

        pictureImageview.setOnClickListener(this)
        enterTextButton.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.pictureImageview -> {}
            R.id.enterTextButton -> {}
            else -> println("No case satisfied")
        }
    }

    companion object {
        const private val MIME_TYPE_IMAGE = "image/"
    }
}