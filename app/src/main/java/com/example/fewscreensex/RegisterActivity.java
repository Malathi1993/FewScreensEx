package com.example.fewscreensex;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.util.Log;
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
    TextView Registerdlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Registerdlogin = (TextView) findViewById(R.id.textView);
        Email = (EditText) findViewById(R.id.editText);
        Password = (EditText) findViewById(R.id.editText2);
        MobileNo = (EditText) findViewById(R.id.editText3);
        Login = (Button) findViewById(R.id.button);
        // getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        // getSupportActionBar().setCustomView(R.id.actionbar);

        String text = "Login";
        SpannableStringBuilder ssBuilder = new SpannableStringBuilder(text);
        UnderlineSpan underlineSpan = new UnderlineSpan();
        ssBuilder.setSpan(
                underlineSpan,
                text.indexOf("Login"),
                text.indexOf("Login") + String.valueOf("Login").length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        //TextView.setText(ssBuilder);

       Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (Email.getText().toString().length() == 0) {
                    Email.setError("Email not entered");
                    Email.requestFocus();
                    Log.d("value of x is ", String.valueOf(Email.getText()));
                }
                else if (Password.getText().toString().length() == 0) {
                    Password.setError("Password not entered");
                    Password.requestFocus();
                    Log.d("value of x is ", String.valueOf(Password.getText()));
                }
                else if (MobileNo.getText().toString().length() == 0) {
                    MobileNo.setError("PhoneNO is Required");
                    MobileNo.requestFocus();
                    Log.d("value of x is ", String.valueOf(MobileNo.getText()));
                }
                else {
                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                    Intent it = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(it);
                   // Registerdlogin.setPaintFlags(Registerdlogin.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                   // Registerdlogin.getPaint().setUnderlineText(true);
                }
            }
        });
}
}