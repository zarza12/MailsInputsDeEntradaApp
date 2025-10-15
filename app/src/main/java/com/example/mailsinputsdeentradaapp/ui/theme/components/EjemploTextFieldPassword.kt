package com.example.mailsinputsdeentradaapp.ui.theme.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.sp

@Composable
fun EjemploTextFieldPassword(){
    var password by remember { mutableStateOf("") }
    var visible by remember { mutableStateOf(false) }

    TarjetaEjemplo(
        titulo = "TextField para Contraseña",
        description = "Oculta el texto por seguridad"
    ) {
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            visualTransformation = if (visible) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
            trailingIcon = {
                IconButton(onClick = { visible!=visible }) {
                    Icon(
                        if(visible) Icons.Default.Lock else Icons.Default.Person,
                        if(visible) "Ocultar" else "Mostrar"
                    )
                }
            },
            modifier = Modifier.fillMaxWidth()
        )
        if(password.isNotEmpty()){
            Text("Escribiste: $password", fontSize = 12.sp, color = Color.Gray)
        }
    }

}