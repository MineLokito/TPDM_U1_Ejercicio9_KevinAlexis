package mx.edu.ittepic.tpdm_u1_ejercicio9_kevinalexis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var camponumero: EditText? = null
    var campomulti: EditText? = null
    var calcular: Button? = null
    var layo: LinearLayout?=null
    var aux = 0
    var wow=0
    var operacion=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        camponumero=findViewById(R.id.camponumero)
        campomulti=findViewById(R.id.campomulti)
        calcular=findViewById(R.id.boton)
        layo=findViewById(R.id.layin)


        calcular?.setOnClickListener {

            layo=findViewById(R.id.layin)
            var vectorT= Vector<TextView>()
            aux = camponumero?.text.toString().toInt()
            wow=campomulti?.text.toString().toInt()
            var vector = camponumero?.text.toString()
            var multip=1

            if (wow>=aux){
            (1..wow).forEach {


                    if (wow >= 0) {


                        operacion= aux*multip

                        var rbd = TextView(this)
                        rbd.setText("$wow"+"x"+"$it"+"="+operacion)
                        layo?.addView(rbd)
                    }
                multip++

            }
        }


    }
}
}

