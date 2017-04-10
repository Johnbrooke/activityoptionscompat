package com.example.administrator.mydemo_kaiyuanceshi;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
public class Activityoptionscompat extends Activity {

    ImageView imageView_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optionscompat);

        imageView_item = (ImageView) findViewById(R.id.imageview_item);
        ViewCompat.setTransitionName(imageView_item,"one");
    }
}
