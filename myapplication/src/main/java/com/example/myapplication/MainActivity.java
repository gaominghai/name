package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.activity_list_item,new String[]{"布局管理器","瀑布流","多条目 下划线条目点击"}));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(this,Main1Activity.class));
                break;
            case 1 :
                startActivity(new Intent(this,Main2Activity.class));
                break;
            case 2:
                startActivity(new Intent(this,Main3Activity.class));
                break;

        }
    }

    private void startActivity(MainActivity mainActivity, Class<Main1Activity> main1ActivityClass) {
    }
}
