package labw1.labs.max.labw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_display);
        Intent intent = getIntent();
        TextView textView = findViewById(R.id.textView2);
        textView.setText(intent.getStringExtra("answerText"));
    }
}
