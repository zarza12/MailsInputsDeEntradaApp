package com.example.mailsinputsdeentradaapp.ui.theme.components

import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

@Composable
fun EjemploSwitch(){

    var estado by remember { mutableStateOf(false) }

    Switch(
        checked = estado,
        onCheckedChange = { estado = it },
        enabled = true,
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.Green,
            uncheckedThumbColor = Color.Gray
        )
    )
}