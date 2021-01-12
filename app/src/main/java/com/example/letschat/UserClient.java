package com.example.letschat;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.example.letschat.models.User;

public class UserClient extends Application {


        private User user = null;

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(getBaseContext());
    }
    }

