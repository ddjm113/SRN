package com.example.srn

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*

class Selblanco : AppCompatActivity() {

    private lateinit var dbref : DatabaseReference
    private lateinit var isotopesrv : RecyclerView
    private lateinit var isotopesArrayList : ArrayList<Isotopos>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seleleblan)

        isotopesrv = findViewById(R.id.RecyvlerView)
        isotopesrv.layoutManager = LinearLayoutManager(this)
        isotopesrv.setHasFixedSize(true)

        isotopesArrayList = arrayListOf<Isotopos>()
        getData()
    }

    private fun getData() {
        dbref = FirebaseDatabase.getInstance().getReference("/2/data")

        dbref.addValueEventListener(object : ValueEventListener
        {
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists())
                {
                    for (isotopesSnapshot in snapshot.children)
                    {
                        val isotope = isotopesSnapshot.getValue(Isotopos::class.java)
                        if (isotope != null) {
                            isotopesArrayList.add(isotope)
                        }

                    }
                    isotopesrv.visibility = View.VISIBLE
                    isotopesrv.adapter = Adapter(isotopesArrayList)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                println("Error al cargar base de datos")
            }

        })
    }

}