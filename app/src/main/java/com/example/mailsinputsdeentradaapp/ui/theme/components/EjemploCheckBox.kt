package com.example.mailsinputsdeentradaapp.ui.theme.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EjemploCheckBox(){
    var opcionA by remember { mutableStateOf(false) }
    var opcionB by remember { mutableStateOf(false) }
    var opcionC by remember { mutableStateOf(false) }

    TarjetaEjemplo(
        titulo = "CheckBox",
        description = "Permite marcar o desmarcar una opción"
    ) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = opcionA, onCheckedChange = { opcionA = it })
                Text("Opción A", modifier = Modifier.padding(start = 8.dp))
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = opcionB, onCheckedChange = { opcionB = it })
                Text("Opción B", modifier = Modifier.padding(start = 8.dp))
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = opcionC, onCheckedChange = { opcionC = it })
                Text("Opción C", modifier = Modifier.padding(start = 8.dp))
            }
        }
    }

}