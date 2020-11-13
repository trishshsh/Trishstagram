package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("aWTLF9EjzIMdd3TzSzV17VmCIEUxzvWxTRwEXgaW")
                .clientKey("C4NyYtcczAf1rBIOuTCHUgHXGXA8nsMNtvuDVgot")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
