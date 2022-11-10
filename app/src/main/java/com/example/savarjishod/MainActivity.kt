package com.example.savarjishod

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Patterns
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name: EditText
        var lastname: EditText
        var email: EditText
        var password: EditText
        var check : CheckBox
        var knopkchik: Button

        name = findViewById(R.id.Name)
        lastname = findViewById(R.id.Lastname)
        email = findViewById(R.id.Mail)
        check = findViewById(R.id.Check)
        knopkchik = findViewById(R.id.Knopka)
        password = findViewById(R.id.Password)


        knopkchik.setOnClickListener{
        if (name.text.toString().length < 3 || name.text.toString().isEmpty() || lastname.text.toString().length < 5
            || lastname.text.toString().isEmpty() || !name.text.toString().all { it.isLetter() } ) {

            Toast.makeText(applicationContext, "გთხოვთ სწორად შეიყვანოთ თქვენი სახელი და გვარი", Toast.LENGTH_LONG).show()

        } else if (!email.text.toString().contains("@") || !email.text.toString().contains(".")){

            Toast.makeText(applicationContext, "გთხოვთ სწორად შეიყვანოთ მეილი", Toast.LENGTH_LONG).show()
        } else if (password.text.toString().length < 8 || !password.text.toString().any { it.isDigit() }) {

            Toast.makeText(applicationContext, "გთხოვთ სწორად შეიყვანოთ პაროლი", Toast.LENGTH_LONG).show()

        } else if (!check.isChecked) {

            Toast.makeText(applicationContext, "გთხოვთ დაეთანხმოთ პირობებს", Toast.LENGTH_LONG).show()

        } else {
            Toast.makeText(applicationContext, "თქვენ წარმატებით გაიარეთ რეგისტრაცია", Toast.LENGTH_LONG).show()
        }

        }
    }


}