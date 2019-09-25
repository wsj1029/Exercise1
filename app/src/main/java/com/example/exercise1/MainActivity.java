package com.example.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText userName;
    private EditText passWord;
    private Button login;
    private Button exit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        userName = findViewById( R.id.username);
        passWord =findViewById( R.id.password );
        login=findViewById( R.id.login );
        exit=findViewById( R.id.exit );

        login.setOnClickListener( this );
        exit.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login:
                String username = userName.getText().toString();

                String password =passWord.getText().toString();

                if(username.equals("wang")&&password.equals("1029") ){

                    Intent intent = new Intent( MainActivity.this, WelcomeActivity.class );
                    intent.putExtra( "id",userName.getText().toString());
                    startActivityForResult( intent ,100);


                }else{

                    Toast.makeText( this, "用户名或密码为空！", Toast.LENGTH_SHORT);
                }



                break;

            case R.id.exit:

                break;
        }


    }
}
