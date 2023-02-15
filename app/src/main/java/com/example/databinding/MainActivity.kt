package com.example.databinding

import android.content.Intent
import android.widget.Toast
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    val test = "Main";

    override var layoutResourceId: Int = R.layout.activity_main

    override fun initBinding() {
        binding.mainLayout = this@MainActivity
    }

    fun onClick() {
        Toast.makeText(this, "test", Toast.LENGTH_LONG).show()
        val intent = Intent(this, TestActivity::class.java)
        startActivity(intent)
    }
}