package com.example.jetbmicalculator

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetbmicalculator.ui.theme.JetBMICalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetBMICalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(20.dp)) {
                        Text(
                            text = "BMI計算アプリ",
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 26.sp,
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        //height
                        Text(
                            text = "身長(cm)",
                            color = Color(0xFFF85F6A),
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        //height
                        PinkLabeledTextField(
                            value = "",
                            onValueChange = {},
                            label = "身長(cm)",
                            placeholder = "170",
                        )
                        Spacer(modifier = Modifier.height(20.dp))

                        //weight

                        Text(
                            text = "体重(kg)",
                            color = Color(0xFFF85F6A),
                            fontWeight = FontWeight.Bold,
                        )

                        PinkLabeledTextField(
                            value = "",
                            onValueChange = {} ,
                            label = "体重(kg)",
                            placeholder = "65",
                        )

                        Spacer(modifier = Modifier.height(30.dp))

                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = Color(0xFFF85F6A),
                            )
                        ) {
                            Text(
                                text = "計算する",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp)
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun PinkLabeledTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    placeholder: String,
){
    TextField(
        modifier = Modifier.fillMaxWidth(),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent,
        ),
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Number,
        ),
        singleLine = true,
        value = "",
        onValueChange = onValueChange,
        placeholder = { Text(text = placeholder) }
    )
}