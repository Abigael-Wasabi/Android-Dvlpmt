package com.ist.loginscreen.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ist.loginscreen.components.ButtonComponent
import com.ist.loginscreen.components.HeadingTextComponent
import com.ist.loginscreen.components.PasswordTextFieldComponent
import com.ist.loginscreen.components.SimpleTextComponent
import com.ist.loginscreen.components.UserFieldComponent

@Composable
@Preview

fun SignupScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            SimpleTextComponent(value = "Hello")
            HeadingTextComponent(value = "Welcome back")
            UserFieldComponent(labelValue ="Firstname", icon = Icons.Default.Person)
            UserFieldComponent(labelValue ="Lastname", icon = Icons.Default.Person)
            UserFieldComponent(labelValue ="Email", icon = Icons.Default.Email)
            PasswordTextFieldComponent(labelValue = "Password", icon = Icons.Default.Lock )
            ButtonComponent(value = "Signup")



        }
    }
}


