package com.example.mailsinputsdeentradaapp.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
    fun EjemploText() {
        TarjetaEjemplo(
            titulo = "Text",
            description = "Componente basico para mostrar texto"
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Text normal")
                Text("Texto en negritas", fontWeight = FontWeight.Bold)
                Text("Texto grande", fontSize = 24.sp)
                Text("Texto de color", color = Color.Blue)

            }
        }
    }