package com.nghia.pvn.blth4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView   gridView,gridView2;
    String[] title={
            "Không thể giữ kín trong tim,\"Nhà mời bạn 50%",
            "Không thể giữ kín trong tim,\"Nhà mời bạn 50%",
            "Không thể giữ kín trong tim,\"Nhà mời bạn 50%",
            "Không thể giữ kín trong tim,\"Nhà mời bạn 50%",
            "Không thể giữ kín trong tim,\"Nhà mời bạn 50%",
    };
    String[] tv={
            "Điều nhà không thể giữ kín\"trong tim...\"Thương bạn vì thương thôi...",
            "Điều nhà không thể giữ kín\"trong tim...\"Thương bạn vì thương thôi...",
            "Điều nhà không thể giữ kín\"trong tim...\"Thương bạn vì thương thôi...",
            "Điều nhà không thể giữ kín\"trong tim...\"Thương bạn vì thương thôi...",
            "Điều nhà không thể giữ kín\"trong tim...\"Thương bạn vì thương thôi...",

    };
    Integer[] image={
            R.drawable.hh,
            R.drawable.hh,
            R.drawable.hh,
            R.drawable.hh,
            R.drawable.hh,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomList adapter1=new CustomList(this,title,tv,image);
        gridView= findViewById(R.id.gr_1);
        gridView2=findViewById(R.id.gr_2);
        gridView.setAdapter(adapter1);
        gridView2.setAdapter(adapter1);
    }
}