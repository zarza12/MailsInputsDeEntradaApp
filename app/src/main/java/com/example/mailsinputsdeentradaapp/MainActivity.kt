package com.example.mailsinputsdeentradaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mailsinputsdeentradaapp.ui.theme.MailsInputsDeEntradaAppTheme
import com.example.mailsinputsdeentradaapp.ui.theme.components.EjemploOutlinedTextField
import com.example.mailsinputsdeentradaapp.ui.theme.components.EjemploText
import com.example.mailsinputsdeentradaapp.ui.theme.components.EjemploTextField
import com.example.mailsinputsdeentradaapp.ui.theme.components.TarjetaEjemplo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MailsInputsDeEntradaAppTheme {
                ComponentesApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComponentesApp(){
    Scaffold (
        topBar = {
            TopAppBar(
                title = {Text("Componentes de Entrada - Compose")},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = Color.White
                )
            )
        }
    ) { padding ->
        LazyColumn (
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ){
            item { SeleccionTitulo("1. TEXTOS Y ETIQUETAS") }
            item { EjemploText() }
            item { SeleccionTitulo("2. CAMPOS DE TEXTO") }
            item { EjemploTextField() }
            item { SeleccionTitulo("3. Email") }
            item { EjemploOutlinedTextField() }
        }

    }
}

@Composable
fun SeleccionTitulo(titulo: String){
    Text(
        text = titulo,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
    )
}