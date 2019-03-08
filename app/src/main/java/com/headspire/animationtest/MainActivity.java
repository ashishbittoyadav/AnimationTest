package com.headspire.animationtest;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * version 1.0
 * created by Ashish Yadav 08-03-2019
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView description;
    private ImageView bike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        description=findViewById(R.id.describe);
        bike=findViewById(R.id.harley);
        description.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.describe:
                Intent intent=new Intent(MainActivity.this,NewActivity.class);

                Pair[] pairs=new Pair[2];
                pairs[0]=new Pair<View,String>(description,"description");
                pairs[1]=new Pair<View,String>(bike,"harley");

                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(
                            MainActivity.this, pairs);
                    startActivity(intent,options.toBundle());
                }
                else
                    startActivity(intent);


                break;
        }
    }
}
