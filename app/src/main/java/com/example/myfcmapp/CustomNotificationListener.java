package com.example.myfcmapp;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import com.google.firebase.messaging.RemoteMessage;
import com.microsoft.windowsazure.messaging.notificationhubs.NotificationListener;

import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import java.util.Map;

public class CustomNotificationListener implements NotificationListener {
    private static final String TAG = "CustomNotificationListener";
    @Override
    public void onPushNotificationReceived(Context context, RemoteMessage message) {

        /* The following notification properties are available. */
        RemoteMessage.Notification notification = message.getNotification();
        String title = notification.getTitle();
        String body = notification.getBody();
        Map<String, String> data = message.getData();

        if (message != null) {
            Log.d(TAG, "Message Notification Title: " + title);
            Log.d(TAG, "Message Notification Body: " + message);
        }

        if (data != null) {
            for (Map.Entry<String, String> entry : data.entrySet()) {
                Log.d(TAG, "key, " + entry.getKey() + " value " + entry.getValue());
            }
        }
//        Intent notificationIntent = new Intent(context.getApplicationContext(), MainActivity.class);
//        PendingIntent contentIntent = PendingIntent.getActivity(context.getApplicationContext(),
//                1234, notificationIntent,
//                PendingIntent.FLAG_MUTABLE);
//
//        NotificationManager nm = (NotificationManager) context.getApplicationContext()
//                .getSystemService(Context.NOTIFICATION_SERVICE);
//
//        Resources res = context.getApplicationContext().getResources();
//        Notification.Builder builder = new Notification.Builder(context.getApplicationContext());
//
//        builder.setContentIntent(contentIntent)
//                //.setSmallIcon(R.drawable.some_img)
//                //.setLargeIcon(BitmapFactory.decodeResource(res, R.drawable.some_big_img))
//                //.setTicker(res.getString(R.string.your_ticker))
//                .setWhen(System.currentTimeMillis())
//                .setAutoCancel(true)
//                .setContentTitle(res.getString(title))
//                .setContentText(res.getString(R.string.your_notif_text));
//        Notification n = builder.build();
//
//        nm.notify(123, n);
    }
}
