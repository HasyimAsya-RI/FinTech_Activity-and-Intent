package com.example.fintech1832_activityandintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnHome: Button
    private lateinit var btnProfile: Button
    private lateinit var btnSetting: Button

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        btnHome     = findViewById( R.id.btn_home )
        btnProfile  = findViewById( R.id.btn_profile )
        btnSetting  = findViewById( R.id.btn_setting )

        btnHome.setOnClickListener {
            val intent = Intent( this, HomeActivity::class.java )
            intent.putExtra( "username", "hasyim" )
            startActivity( intent )
        }

        btnProfile.setOnClickListener {
            val intent = Intent( this, ProfileActivity::class.java )
            startActivity( intent )
        }

        btnSetting.setOnClickListener {
            val intent = Intent( this, SettingActivity::class.java )
            startActivity( intent )
        }
    }
}