package com.example

import android.os.Bundle
import android.widget.TextView
import android.widget.LinearLayout
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val rootLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(0xFFECEFF1.toInt())
            setPadding(40, 40, 40, 40)
        }

        val brandView = TextView(this).apply {
            text = "vivo."
            textSize = 36f
            setTextColor(0xFF660099.toInt())
            gravity = Gravity.CENTER
            setPadding(0, 0, 0, 24)
        }

        val titleView = TextView(this).apply {
            text = "Gestão de Qualidade"
            textSize = 20f
            setTextColor(0xFF33004D.toInt())
            gravity = Gravity.CENTER
            setPadding(0, 0, 0, 16)
        }

        val descView = TextView(this).apply {
            text = "O sistema de gestão web completo com FCA, PDCA, Ishikawa, GUT, Diagrama de Pareto, Folhas de Verificação, Gráficos CEP e o Co-Piloto de IA Vivo está em execução paralela e pronto para Vercel."
            textSize = 12f
            setTextColor(0xFF555555.toInt())
            gravity = Gravity.CENTER
        }

        rootLayout.addView(brandView)
        rootLayout.addView(titleView)
        rootLayout.addView(descView)

        setContentView(rootLayout)
    }
}
