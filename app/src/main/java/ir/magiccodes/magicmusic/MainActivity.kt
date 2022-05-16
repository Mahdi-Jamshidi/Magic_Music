package ir.magiccodes.magicmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.magiccodes.magicmusic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}