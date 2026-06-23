package com.ifpr.wearostemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button

class Perfil : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        findViewById<Button>(R.id.btnVoltar).setOnClickListener {
            finish()
        }
    }
}