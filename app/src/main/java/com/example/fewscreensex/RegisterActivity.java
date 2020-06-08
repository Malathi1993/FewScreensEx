package com.example.fewscreensex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText Email;
    EditText Password;
    EditText MobileNo;
    Button Login;
    TextView Rigisterdlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Rigisterdlogin = (TextView) findViewById(R.id.textView);
        Email = (EditText) findViewById(R.id.editText);
        Password = (EditText) findViewById(R.id.editText2);
        MobileNo = (EditText) findViewById(R.id.editText3);
        Login = (Button) findViewById(R.id.button);

        Rigisterdlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (Email.getText().toString().length() == 0) {
                    Email.setError("Email not entered");
                    Email.requestFocus();
                }  if (Password.getText().toString().length() == 0) {
                    Password.setError("Password not entered");
                    Password.requestFocus();
                }  if (MobileNo.getText().toString().length() == 0) {
                    MobileNo.setError("PhoneNO is Required");
                    MobileNo.requestFocus();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                    Intent it = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(it);
                }
            }
        });
    }
}