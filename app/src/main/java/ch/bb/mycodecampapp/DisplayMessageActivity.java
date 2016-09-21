package ch.bb.mycodecampapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setText(message);
        textView.append("\n--------------------");

        SharedPreferences sharedPref = this.getSharedPreferences(
                MainActivity.SHARED_PREFERENCES, Context.MODE_PRIVATE);
        for (Object s : sharedPref.getAll().values()) {
            textView.append("\n" + s);
        }

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
}
