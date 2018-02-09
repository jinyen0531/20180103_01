package com.yenyu.a20180103_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.imageView);
    }

    public void click1 (View v) //點擊顯示圖片(從res)
    {
        img.setImageResource(R.drawable.cat);
    }

    public void click2(View v) //點擊顯示圖片(從網路抓取)
    {
        Picasso.with(MainActivity.this).load("http://www.pcschool.com.tw/updimg/act/2017RWD_AD/7bAD_945d.jpg")
        .into(img);
    }
}
