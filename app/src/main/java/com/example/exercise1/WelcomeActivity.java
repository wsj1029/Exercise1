package com.example.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView w_course;
    private  TextView tool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_welcome );
        initView();
    }
    private void initView() {
        w_course =findViewById( R.id.reception );
        tool = findViewById( R.id.course );
        tool.setOnClickListener( this );
        Intent intent  = getIntent();
        String xxx = intent.getStringExtra( "id" );
        w_course.setText("欢迎"+ xxx +"来到学生空间");
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.course:

                Intent intent = new Intent( WelcomeActivity.this, ListviewActivity.class );
                startActivity( intent );

                break;

        }

    }
}

