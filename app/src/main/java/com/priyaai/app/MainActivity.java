package com.priyaai.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(40, 40, 40, 40);
        layout.setBackgroundColor(Color.rgb(245, 240, 255));

        TextView title = new TextView(this);
        title.setText("💜 PriyaAI");
        title.setTextSize(32);
        title.setTextColor(Color.rgb(100, 60, 170));
        title.setGravity(Gravity.CENTER);

        TextView welcome = new TextView(this);
        welcome.setText("\nস্বাগতম ❤️\nআমি প্রিয়া।\n\nচলো গল্প করি! 😊");
        welcome.setTextSize(20);
        welcome.setGravity(Gravity.CENTER);
        welcome.setTextColor(Color.DKGRAY);

        layout.addView(title);
        layout.addView(welcome);

        setContentView(layout);
    }
}
