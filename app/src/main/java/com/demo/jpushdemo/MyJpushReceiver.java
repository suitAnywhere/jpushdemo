package com.demo.jpushdemo;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import cn.jpush.android.api.NotificationMessage;
import cn.jpush.android.service.JPushMessageReceiver;

/**
 * @author: liercheng
 * @date: 2021/7/1
 * @description:
 */
public class MyJpushReceiver extends JPushMessageReceiver {
    @Override
    public void onNotifyMessageOpened(Context context, NotificationMessage notificationMessage) {
        super.onNotifyMessageOpened(context, notificationMessage);

        String notificationContent = notificationMessage.notificationContent;
        String extras = notificationMessage.notificationExtras;

        try {
            if (notificationContent.contains("1")) {
                Intent intent2 = new Intent(context, Main2Activity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent2);
            }
            Log.d("TAG", "onNotifyMessageOpened: " + notificationContent);
        } catch (Exception e) {

        }

    }
}
