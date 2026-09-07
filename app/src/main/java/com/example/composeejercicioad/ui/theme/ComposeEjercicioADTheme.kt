package com.example.composeejercicioad.ui.theme

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.material3.TextField
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Switch
import androidx.compose.material3.Card
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeejercicioad.R

@Composable
fun ConceptosBasicosCompose() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            Text(
                text = "Conceptos básicos de Compose",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )


            Spacer(
                modifier = Modifier.height(20.dp)
            )


            Image(
                painter = painterResource(
                    id = R.drawable.android_logo
                ),
                contentDescription = "Android",
                modifier = Modifier.size(100.dp)
            )


            Spacer(
                modifier = Modifier.height(20.dp)
            )


            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier.padding(20.dp)
                ) {

                    Text(
                        text = "Usuario Android"
                    )


                    Text(
                        text = "Desarrollador de aplicaciones móviles"
                    )

                }

            }


            Spacer(
                modifier = Modifier.height(20.dp)
            )


            TextField(
                value = "",
                onValueChange = {},
                label = {
                    Text("Nombre")
                }
            )


            Spacer(
                modifier = Modifier.height(20.dp)
            )


            Row(
                verticalAlignment = Alignment.CenterVertically
            ){

                Checkbox(
                    checked = true,
                    onCheckedChange = {}
                )

                Text(
                    text = "Acepto términos"
                )

            }


            Row(
                verticalAlignment = Alignment.CenterVertically
            ){

                Switch(
                    checked = true,
                    onCheckedChange = {}
                )

                Text(
                    text = "Activo"
                )

            }


            Spacer(
                modifier = Modifier.height(20.dp)
            )


            Button(
                onClick = {}
            ){

                Text(
                    text = "Guardar"
                )

            }

        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewConceptosBasicos(){

    ComposeEjercicioAdTheme(

    ) {

        ConceptosBasicosCompose()

    }
}