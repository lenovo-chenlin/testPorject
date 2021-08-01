package com.example.glideapp;

import com.bumptech.glide.request.RequestOptions;

public class GlideOptionsUtils {
    /**
     * 设置加载中和加载失败的图片
     * @return
     */
    public static RequestOptions baseOptions(){
        return new RequestOptions()
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher_round);
    }

    /**
     * 设置图片圆角
     * @return
     */
    public static RequestOptions circleOptions(){
        return baseOptions().centerCrop();
    }
}
