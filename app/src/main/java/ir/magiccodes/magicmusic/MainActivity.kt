package ir.magiccodes.magicmusic

import android.media.MediaParser
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.magiccodes.magicmusic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var mediaPlayer: MediaPlayer
    var isPlaying = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prepareMusic()
        binding.btnPlayPause.setOnClickListener { configureMusic() }
        binding.btnGoBefore.setOnClickListener { giBeforeMusic() }
        binding.btnGoAfter.setOnClickListener { goAfterMusic() }
        binding.btnVolumeOnOof.setOnClickListener { configureVolume() }

    }

    private fun prepareMusic() {
        mediaPlayer = MediaPlayer.create(this, R.raw.music_file)
        binding.btnPlayPause.setImageResource(R.drawable.ic_pause)
        mediaPlayer.start()
        isPlaying = true

    }

    private fun configureMusic() {

        if (isPlaying){
            mediaPlayer.pause()
            binding.btnPlayPause.setImageResource(R.drawable.ic_play)
            isPlaying = false

        }else{
            mediaPlayer.start()
            binding.btnPlayPause.setImageResource(R.drawable.ic_pause)
            isPlaying = true
        }
    }

    private fun giBeforeMusic() {
        TODO("Not yet implemented")
    }

    private fun goAfterMusic() {
        TODO("Not yet implemented")
    }

    private fun configureVolume() {
        TODO("Not yet implemented")
    }


}