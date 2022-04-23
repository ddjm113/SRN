package com.example.srn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Selpro : AppCompatActivity() {
    var zproy: Int = 0
    var aproy: Int = 0
    var nomproy: String = ""
    var simproy: String = ""
    var masproy: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.selproy)

        val selprot: Button = findViewById(R.id.bpropr)
        val seldeut: Button = findViewById(R.id.bprode)
        val seltrit: Button = findViewById(R.id.bprotr)
        val selparta: Button = findViewById(R.id.bpropa)
        val selneut: Button = findViewById(R.id.bprone)
        val proyectil = Intent(this,Selblanco::class.java)
        //val pasarproyectil = Intent(this,Resultado::class.java)
        selprot.setOnClickListener{
            protonselect()
            //this.nomproy = "Proton"
            //nomproy = "proton"
            proyectil.putExtra("Nombreproyectil",nomproy)
            proyectil.putExtra("Simboloproyectil",simproy)
            proyectil.putExtra("Aproyectil",aproy)
            proyectil.putExtra("Zproyectil",zproy)
            proyectil.putExtra("Masaproyectil",masproy)
            startActivity(proyectil)
        }

        seldeut.setOnClickListener{
            deuteronselect()
            proyectil.putExtra("Nombreproyectil",nomproy)
            proyectil.putExtra("Simboloproyectil",simproy)
            proyectil.putExtra("Aproyectil",aproy)
            proyectil.putExtra("Zproyectil",zproy)
            proyectil.putExtra("Masaproyectil",masproy)
            startActivity(proyectil)
        }

        seltrit.setOnClickListener {
            tritioselect()
            proyectil.putExtra("Nombreproyectil",nomproy)
            proyectil.putExtra("Simboloproyectil",simproy)
            proyectil.putExtra("Aproyectil",aproy)
            proyectil.putExtra("Zproyectil",zproy)
            proyectil.putExtra("Masaproyectil",masproy)
            startActivity(proyectil)
        }

        selparta.setOnClickListener{
            alfaselect()
            proyectil.putExtra("Nombreproyectil",nomproy)
            proyectil.putExtra("Simboloproyectil",simproy)
            proyectil.putExtra("Aproyectil",aproy)
            proyectil.putExtra("Zproyectil",zproy)
            proyectil.putExtra("Masaproyectil",masproy)
            startActivity(proyectil)
        }

        selneut.setOnClickListener {
            neutronselect()
            proyectil.putExtra("Nombreproyectil",nomproy)
            proyectil.putExtra("Simboloproyectil",simproy)
            proyectil.putExtra("Aproyectil",aproy)
            proyectil.putExtra("Zproyectil",zproy)
            proyectil.putExtra("Masaproyectil",masproy)
            startActivity(proyectil)
        }
    }

    private fun protonselect(){
        this.simproy = "p"
        this.nomproy = "Proton"
        this.zproy = 1
        this.aproy = 1
        this.masproy = 1.007825

    }
    private fun deuteronselect(){
        this.simproy = "d"
        this.nomproy = "Deuteron"
        this.zproy = 1
        this.aproy = 2
        this.masproy = 2.014102
    }
    private fun tritioselect(){
        this.simproy = "r"
        this.nomproy = "Tritio"
        this.zproy = 1
        this.aproy = 3
        this.masproy = 3.016049
    }
    private fun alfaselect(){
        this.simproy = "a"
        this.nomproy = "Particula alfa"
        this.zproy = 2
        this.aproy = 4
        this.masproy = 4.002603
    }
    private fun neutronselect(){
        this.simproy = "n"
        this.nomproy = "Neutron"
        this.zproy = 0
        this.aproy = 1
        this.masproy = 1.008665
    }
}