package com.xxx.ency.di.component;

import android.content.Context;

import com.xxx.ency.di.module.ApplicationModule;
import com.xxx.ency.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by xiarh on 2017/9/21.
 */

@Singleton
@Component(modules = {ApplicationModule.class, HttpModule.class})
public interface AppComponent {

    Context getContext(); // 提供Context给子Component使用

    Retrofit.Builder getRetrofitBuilder(); //提供RetrofitBuilder给子Component使用
}