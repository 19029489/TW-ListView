package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    TextView tvYear;
    ArrayList<Module> moduleY1;
    ArrayList<Module> moduleY2;
    ArrayList<Module> moduleY3;
    ArrayAdapter aa;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModule);
        tvYear = (TextView) this.findViewById(R.id.textView2);

        moduleY1 = new ArrayList<Module>();
        moduleY1.add(new Module("C208", true));
        moduleY1.add(new Module("C200", false));
        moduleY1.add(new Module("C346", true));

        moduleY2 = new ArrayList<Module>();
        moduleY2.add(new Module("C308", true));

        moduleY3 = new ArrayList<Module>();
        moduleY3.add(new Module("C248", false));

        Intent i = getIntent();
        String year = i.getStringExtra(Intent.EXTRA_TEXT);

        if(year.equals("Year 1")){
            tvYear.setText("Year 1");
            aa = new ModuleAdapter(this, R.layout.row, moduleY1);
        } else if(year.equals("Year 2")) {
            tvYear.setText("Year 2");
            aa = new ModuleAdapter(this, R.layout.row, moduleY2);
        } else {
            tvYear.setText("Year 3");
            aa = new ModuleAdapter(this, R.layout.row, moduleY3);
        }

        lv.setAdapter(aa);
    }

}
