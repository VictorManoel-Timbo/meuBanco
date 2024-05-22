package com.victortimbo.meubanco

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.victortimbo.meubanco.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#A4D300")

        var valueTotal = 12.05f

        binding.txtValue.text = "*****"
        binding.imgOlho.setOnClickListener {
            if(binding.txtValue.text == "*****"){
                binding.txtValue.text = "R$ ${"%.2f".format(valueTotal)}"
            }else{
                binding.txtValue.text = "*****"
            }
        }
    }
}