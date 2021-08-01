package com.example.glideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.image);
        //指定加载中的图片，加载失败的图片
        glideAppLoadUrlImage("https://profile.csdnimg.cn/6/5/D/1_qq_42451251");
//        RequestOptions options=new RequestOptions()
//                .placeholder(R.mipmap.ic_launcher)
//                .error(R.mipmap.ic_launcher_round)
//                .circleCrop();
//
//        Glide.with(this)
//                .load("https://profile.csdnimg.cn/6/5/D/1_qq_42451251")
//                .apply(GlideOptionsUtils.circleOptions())
//                .into(imageView);
    }
    private void glideAppLoadUrlImage(String image){
        GlideApp.with(this)
                .load(image)
                .injectOptions()
                .into(imageView);

    }
}
