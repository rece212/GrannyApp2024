package com.cat.grannyapp2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
var arrUser=ArrayList<User>()
var Signedin :Int = -1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Username :EditText =  findViewById(R.id.txtName)
        var Password :EditText =  findViewById(R.id.txtPassword)



        arrUser.add( User("Granny","Timmy","https://picsum.photos/200/300"))
        arrUser.add( User("Granpa","John","https://picsum.photos/200/300"))
        arrUser.add( User("Timmy","1234","https://picsum.photos/200/300"))
        arrUser.add( User("Mom","4321","https://picsum.photos/200/300"))

        var btnLogin:Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener()
        {
            var Found = false
            Signedin =-1
            for (i in 0..arrUser.size-1)
            {
                if(Username.text.toString().equals(arrUser[i].Name)
                    and Password.text.toString().equals(arrUser[i].Password)  )
                {
                    Toast.makeText(this,"Name :"+Username.text+
                            "\nPassword :"+Password.text,Toast.LENGTH_SHORT).show()
                    Found=true
                    val intent = Intent(this,Welcome::class.java)
                    startActivity(intent)
                    Signedin=i
                    break;
                }

            }
            if(Found==false)
            {
                Toast.makeText(this,"RUNNNNNNN...",Toast.LENGTH_SHORT).show()
            }

        }

        var btnReg:Button = findViewById(R.id.btnRegMain)
        btnReg.setOnClickListener()
        {
            val intent = Intent(this,Reg::class.java)
            startActivity(intent)
        }



















    }
}