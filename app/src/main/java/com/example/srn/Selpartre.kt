package com.example.srn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Selpartre : AppCompatActivity() {
    var zpart: Int = 0
    var apart: Int = 0
    var nompart: String = ""
    var simpart: String = ""
    var maspart: Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.selpartre)

        val resprot: Button = findViewById(R.id.bprpr)
        val resdeut: Button = findViewById(R.id.bprde)
        val restrit: Button = findViewById(R.id.bprtr)
        val resparta: Button = findViewById(R.id.bprpar)
        val resneut: Button = findViewById(R.id.bprne)
        val resultante = Intent(this,Resultado::class.java)

        var nomproy = intent.getStringExtra("Nombreproyectil")
        var simproy = intent.getStringExtra("Simboloproyectil")
        var aproy = intent.getIntExtra("Aproyectil",0)
        var zproy = intent.getIntExtra("Zproyectil",0)
        var masproy = intent.getDoubleExtra("Masaproyectil",0.0)


        resultante.putExtra("Nombreproyectil",nomproy)
        resultante.putExtra("Simboloproyectil",simproy)
        resultante.putExtra("Aproyectil",aproy)
        resultante.putExtra("Zproyectil",zproy)
        resultante.putExtra("Masaproyectil",masproy)

        /*------------------------------------------------*/
        /*VALORES DEL RECYCLERVIEW DE LA PARTICULA BLANCO*/
        val bundle = intent.extras
        val nombre = bundle?.getString("nombre")
        val simbolo = bundle?.getString("simbolo")
        val masa = bundle?.getString("masa")
        val valora = bundle?.getString("valora")
        val valorz = bundle?.getString("valorz")
        /*------------------------------------------------*/
        /*------------------------------------------------*/



        resprot.setOnClickListener{
            protonselect()
            //this.simpart = "p"
            //this.nompart = "Proton"
            //this.zpart= 1
            //this.apart = 1
            //this.maspart = 1.007825
            //resultante.putExtra("Nombreparticula",nompart)
            //resultante.putExtra("Simboloparticula",simpart)
            //resultante.putExtra("Aparticula",apart)
            //resultante.putExtra("Zparticula",zpart)
            //resultante.putExtra("Masaparticula",maspart)
            //simpart = "p"
            resultante.putExtra("Simboloparticula",simpart)
            resultante.putExtra("Nombreparticula",nompart)
            resultante.putExtra("Aparticula",apart)
            resultante.putExtra("Zparticula",zpart)
            resultante.putExtra("Masaparticula",maspart)
            startActivity(resultante)
        }

        resdeut.setOnClickListener{

            startActivity(resultante)
        }

        restrit.setOnClickListener {

            startActivity(resultante)
        }

        resparta.setOnClickListener{

            startActivity(resultante)
        }

        resneut.setOnClickListener {

            startActivity(resultante)

        }
    }

    private fun protonselect(){
        this.simpart= "p"
        this.nompart= "Proton"
        this.zpart = 1
        this.apart = 1
        this.maspart = 1.007825

    }
    private fun deuteronselect(){
        this.simpart = "d"
        this.nompart = "Deuteron"
        this.zpart = 1
        this.apart = 2
        this.maspart = 2.014102
    }
    private fun tritioselect(){
        this.simpart = "r"
        this.nompart = "Tritio"
        this.zpart = 1
        this.apart = 3
        this.maspart = 3.016049
    }
    private fun alfaselect(){
        this.simpart = "a"
        this.nompart = "Particula alfa"
        this.zpart = 2
        this.apart = 4
        this.maspart = 4.002603
    }
    private fun neutronselect(){
        this.simpart = "n"
        this.nompart = "Neutron"
        this.zpart = 0
        this.apart = 1
        this.maspart = 1.008665
    }

}