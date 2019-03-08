package com.headspire.animationtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    private TextView description;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
        description=findViewById(R.id.descriptionofbike);

    }

    @Override
    protected void onResume() {
        super.onResume();
        description.setText("harley davidson bike..........." +
                "invented by arthur davidson and william harley");
    }
}
