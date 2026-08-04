package com.ifpr.wearostemplate.presentation

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.ifpr.wearostemplate.R



class PerfilActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val txtNome = findViewById<TextView>(R.id.txtNome)
        val txtTelefone = findViewById<TextView>(R.id.txtTelefone)
        val txtEmail = findViewById<TextView>(R.id.txtEmail)

        val buttonVoltar = findViewById<Button>(R.id.btnVoltar)
        buttonVoltar.setOnClickListener{
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }

        // Dados de exemplo
        txtNome.text = "👤 Rafaela Cardoso"
        txtTelefone.text = "📞 (42) 99999-9999"
        txtEmail.text = "✉ rafaela@estudantes.ifpr.edu.br"
    }
}