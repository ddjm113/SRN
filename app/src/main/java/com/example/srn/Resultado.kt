package com.example.srn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultado)

        val prueba: TextView = findViewById(R.id.texttiporeac)
        val inicio: Button = findViewById(R.id.butinicio)

        val txtzproy: TextView = findViewById(R.id.txtzproy)
        val txtzblan: TextView = findViewById(R.id.txtzblan)
        val txtzpart: TextView = findViewById(R.id.txtzpartre)
        val txtznuc: TextView = findViewById(R.id.txtznuc)

        val txtaproy: TextView = findViewById(R.id.txtaproy)
        val txtablan: TextView = findViewById(R.id.txtablan)
        val txtapart: TextView = findViewById(R.id.txtapart)
        val txtanuc: TextView = findViewById(R.id.txtanuc)

        val txtsimproy: TextView = findViewById(R.id.txtsimbproy)
        val txtsimblan: TextView = findViewById(R.id.txtsimblan)
        val txtsimpart: TextView = findViewById(R.id.txtsimbpart)
        val txtsimnuc: TextView = findViewById(R.id.txtsimnuc)

        //txtsimproy.setText(intent.getStringExtra("Simboloproyectil"))
        //txtaproy.setText(intent.getIntExtra("Aproyectil",0))
        //txtzproy.setText(intent.getIntExtra("Zproyectil",0))


        //txtsimpart.setText(intent.getStringExtra("Simboloparticula"))
        //txtapart.setText(intent.getIntExtra("Aparticula",0))
        //txtzpart.setText(intent.getIntExtra("Zparticula",0))

        var nomproy = intent.getStringExtra("Nombreproyectil")
        var simproy = intent.getStringExtra("Simboloproyectil")
        var aproy = intent.getIntExtra("Aproyectil",0)
        var zproy = intent.getIntExtra("Zproyectil",0)
        var masproy = intent.getDoubleExtra("Masaproyectil",0.0)
        txtsimproy.setText("$simproy")
        txtaproy.setText("$aproy")
        txtzproy.setText("$zproy")

        var nompart = intent.getStringExtra("Nombreparticula")
        var simpart = intent.getStringExtra("Simboloparticula")
        var apart = intent.getIntExtra("Aparticula",0)
        var zpart = intent.getIntExtra("Zparticula",0)
        var maspart = intent.getDoubleExtra("Masaparticula",0.0)
        txtsimpart.setText("$simpart")
        txtapart.setText("$apart")
        txtzpart.setText("$zpart")

        //var maspart = intent.getDoubleExtra("Masaparticula",0.0)
        inicio.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)



























        }
    }

}