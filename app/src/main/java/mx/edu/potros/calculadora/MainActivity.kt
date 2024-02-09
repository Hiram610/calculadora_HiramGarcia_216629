package mx.edu.potros.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Numeros
        val boton00: Button = findViewById(R.id.btn0)
        val boton01: Button = findViewById(R.id.btn1)
        val boton02: Button = findViewById(R.id.btn2)
        val boton03: Button = findViewById(R.id.btn3)
        val boton04: Button = findViewById(R.id.btn4)
        val boton05: Button = findViewById(R.id.btn5)
        val boton06: Button = findViewById(R.id.btn6)
        val boton07: Button = findViewById(R.id.btn7)
        val boton08: Button = findViewById(R.id.btn8)
        val boton09: Button = findViewById(R.id.btn9)

        // Valores
        var primerValor: Double = 0.0
        var segundoValor: Double = 0.0
        var resultadoFinal: Double = 0.0

        //Operaciones
        val botonSumar: Button = findViewById(R.id.btnSumar)
        val botonRestar: Button = findViewById(R.id.btnRestar)
        val botonMultiplicar: Button = findViewById(R.id.btnMulti)
        val botonDividir: Button = findViewById(R.id.btnDivid)

        //Extras
        val botonBorrar: Button = findViewById(R.id.btnBorrar)
        val botonResult: Button = findViewById(R.id.btnResult)

        //Textos
        val textNumeros: TextView = findViewById(R.id.textNumber2)
        val textResultado: TextView = findViewById(R.id.textTotal)

        boton00.setOnClickListener {
            if(textNumeros.text.get(0) == '0'){
                textNumeros.text = boton00.text
            } else{
                textNumeros.text = "${textNumeros.text}${boton00.text}"
            }
        }

        boton01.setOnClickListener {
            try {
                if(textNumeros.text.get(0) == '0'){
                    textNumeros.text = boton01.text
                } else{
                    textNumeros.text = "${textNumeros.text}${boton01.text}"
                }
            }catch (e: java.lang.Exception){
                println(e)
            }
        }

        boton02.setOnClickListener {
            if(textNumeros.text.get(0) == '0'){
                textNumeros.text = boton02.text
            } else{
                textNumeros.text = "${textNumeros.text}${boton02.text}"
            }
        }

        boton03.setOnClickListener {
            if(textNumeros.text.get(0) == '0'){
                textNumeros.text = boton03.text
            } else{
                textNumeros.text = "${textNumeros.text}${boton03.text}"
            }
        }

        boton04.setOnClickListener {
            if(textNumeros.text.get(0) == '0'){
                textNumeros.text = boton04.text
            } else{
                textNumeros.text = "${textNumeros.text}${boton04.text}"
            }
        }

        boton05.setOnClickListener {
            if(textNumeros.text.get(0) == '0'){
                textNumeros.text = boton05.text
            } else{
                textNumeros.text = "${textNumeros.text}${boton05.text}"
            }
        }

        boton06.setOnClickListener {
            if(textNumeros.text.get(0) == '0'){
                textNumeros.text = boton06.text
            } else{
                textNumeros.text = "${textNumeros.text}${boton06.text}"
            }
        }

        boton07.setOnClickListener {
            if(textNumeros.text.get(0) == '0'){
                textNumeros.text = boton07.text
            } else{
                textNumeros.text = "${textNumeros.text}${boton07.text}"
            }
        }

        boton08.setOnClickListener {
            if(textNumeros.text.get(0) == '0'){
                textNumeros.text = boton08.text
            } else{
                textNumeros.text = "${textNumeros.text}${boton08.text}"
            }
        }

        boton09.setOnClickListener {
            if(textNumeros.text.get(0) == '0'){
                textNumeros.text = boton09.text
            } else{
                textNumeros.text = "${textNumeros.text}${boton09.text}"
            }
        }

        //Botones de Operadores
        botonSumar.setOnClickListener {
            if(textResultado.text == ""){
                if(textNumeros.text.get(0) != '0'){
                    primerValor = textNumeros.text.toString().toDouble()
                    textResultado.text = "${textNumeros.text}${botonSumar.text}"
                    textNumeros.setText("0")
                } else{}
            } else{
                if(textResultado.text.contains('+') || textResultado.text.contains('-') || textResultado.text.contains('*') || textResultado.text.contains('/')){
                } else {
                    primerValor = textResultado.text.toString().toDouble()
                    textResultado.text = "${textResultado.text}${botonSumar.text}"
                    textNumeros.setText("0")
                }
            }
        }

        botonRestar.setOnClickListener {
            if(textResultado.text == ""){
                if(textNumeros.text.get(0) != '0'){
                    primerValor = textNumeros.text.toString().toDouble()
                    textResultado.text = "${textNumeros.text}${botonRestar.text}"
                    textNumeros.setText("0")
                } else{}
            } else{
                if(textResultado.text.contains('+') || textResultado.text.contains('-') || textResultado.text.contains('*') || textResultado.text.contains('/')){
                }else {
                    primerValor = textResultado.text.toString().toDouble()
                    textResultado.text = "${textResultado.text}${botonRestar.text}"
                    textNumeros.setText("0")
                }

            }
        }

        botonMultiplicar.setOnClickListener {
            if(textResultado.text == ""){
                if(textNumeros.text.get(0) != '0'){
                    primerValor = textNumeros.text.toString().toDouble()
                    textResultado.text = "${textNumeros.text}${botonMultiplicar.text}"
                    textNumeros.setText("0")
                } else{}
            } else{
                if(textResultado.text.contains('+') || textResultado.text.contains('-') || textResultado.text.contains('*') || textResultado.text.contains('/')){
                }else {
                    primerValor = textResultado.text.toString().toDouble()
                    textResultado.text = "${textResultado.text}${botonMultiplicar.text}"
                    textNumeros.setText("0")
                }

            }
        }

        botonDividir.setOnClickListener {
            if(textResultado.text == ""){
                if(textNumeros.text.get(0) != '0'){
                    primerValor = textNumeros.text.toString().toDouble()
                    textResultado.text = "${textNumeros.text}${botonDividir.text}"
                    textNumeros.setText("0")
                } else{}
            } else{
                if(textResultado.text.contains('+') || textResultado.text.contains('-') || textResultado.text.contains('*') || textResultado.text.contains('/')){
                } else {
                    primerValor = textResultado.text.toString().toDouble()
                    textResultado.text = "${textResultado.text}${botonDividir.text}"
                    textNumeros.setText("0")
                }
            }
        }

        botonBorrar.setOnClickListener {
            textNumeros.setText("0")
            textResultado.setText("")
            primerValor= 0.0
            segundoValor= 0.0
            resultadoFinal= 0.0
        }

        botonResult.setOnClickListener {
            segundoValor = textNumeros.text.toString().toDouble()
            val operador: Char = textResultado.text.get(textResultado.text.lastIndex)
            while (operador != ' '){
                when(operador){
                    '+' -> {
                        resultadoFinal = Sumar(primerValor, segundoValor)
                        textResultado.text = resultadoFinal.toString()
                        textNumeros.setText("0")
                        break
                    }
                    '-' -> {
                        resultadoFinal = Restar(primerValor, segundoValor)
                        textResultado.text = resultadoFinal.toString()
                        textNumeros.setText("0")
                        break
                    }
                    '*' -> {
                        resultadoFinal = Multiplicar(primerValor, segundoValor)
                        textResultado.text = resultadoFinal.toString()
                        textNumeros.setText("0")
                        break
                    }
                    '/' -> {
                        resultadoFinal = Dividir(primerValor, segundoValor)
                        textResultado.text = resultadoFinal.toString()
                        textNumeros.setText("0")
                        break
                    }
                    else -> {
                        break
                    }

                }
            }

        }

    }

    fun Sumar(numero1: Double, numero2: Double): Double{
        return numero1 + numero2
    }

    fun Restar(numero1: Double, numero2: Double): Double{
        return numero1 - numero2
    }

    fun Multiplicar(numero1: Double, numero2: Double): Double{
        return numero1 * numero2
    }

    fun Dividir(numero1: Double, numero2: Double): Double{
        return numero1 / numero2
    }
}