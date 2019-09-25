package com.example.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListviewActivity extends AppCompatActivity {
    private ListView course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_listview );

        course=findViewById( R.id.l_list );


        initData();
        final ArrayAdapter adapter = new ArrayAdapter <>(ListviewActivity.this, android.R.layout.simple_list_item_1, datas);
        course.setAdapter( adapter );
        course.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                String datas = (String )parent.getItemAtPosition( position );

                Intent intent = new Intent( ListviewActivity.this, LastActivity.class );
                startActivity( intent );
            }
        } );
    }
    private List<String> datas;
    private void initData() {
        datas = new ArrayList<>(  );
        datas.add( "Android应用程序开发" );
        datas.add( "移动应用程序测试" );
        datas.add( "高等数学" );
        datas.add( "高职英语" );
        datas.add( "Java程序设计语言" );
        datas.add( "Android游戏开发" );
        datas.add( "心理健康" );
        datas.add( "体育" );
    }
}
