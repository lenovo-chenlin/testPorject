package com.example.glideapp;

import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideOption;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;

@GlideExtension
public class MyGildeExtension {

    private MyGildeExtension(){ }

    /**
     * 全局统一配置
     * @param options
     */
    public static BaseRequestOptions<?> injectOptions(BaseRequestOptions<?> options){
        return options.placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher_round)
                .circleCrop();
    }
}
