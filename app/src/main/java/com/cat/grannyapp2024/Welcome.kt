package com.cat.grannyapp2024

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        var Welcome : TextView = findViewById(R.id.txtWelcome)
        Welcome.setText(arrUser[Signedin].Name.toString())
        var image: Bitmap? = null
        val imOutput :ImageView = findViewById(R.id.imWelcome)
        val handler = Handler(Looper.getMainLooper())
        val executor = Executors.newSingleThreadExecutor()
        executor.execute{
            val imageURL = arrUser[Signedin].imageURL
            try
            {
                val `in` = java.net.URL(imageURL).openStream()
                image = BitmapFactory.decodeStream(`in`)
                Log.d("Welcome","Image added "+image.toString())
                handler.post{
                    Log.d("Welcome","Image has been added")
                    imOutput.setImageBitmap(image)
                }
            }
            catch (e:java.lang.Exception)
            {
                Log.d("Welcome","Error happened "+ e.toString())
                e.printStackTrace()
            }



        }









    }
}