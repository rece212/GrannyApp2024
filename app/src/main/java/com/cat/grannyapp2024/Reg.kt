package com.cat.grannyapp2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Reg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)



        var btnSave: Button = findViewById(R.id.btnReg)
        btnSave.setOnClickListener()
        {
            val Name :EditText = findViewById(R.id.txtUserReg)
            val Pass1 :EditText = findViewById(R.id.txtPassReg)
            val Pass2 :EditText = findViewById(R.id.txtPassConf)
            if ( Pass1.text.toString().equals(Pass2.text.toString())
                and (Name.text.toString().length >=1))
            {
                arrUser.add(User(Name.text.toString(),Pass1.text.toString(),""))
                Toast.makeText(this,"User Added",Toast.LENGTH_LONG).show()
            }
            else
            {
                Name.error="This needs to be filled in";
                Pass1.error="This needs to be filled in";
                Pass2.error="This needs to be filled in";

            }
        }

        var btnBack: Button = findViewById(R.id.btnMain)
        btnBack.setOnClickListener()
        {
            finish()
        }
    }
}