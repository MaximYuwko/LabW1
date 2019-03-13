package labw1.labs.max.labw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private CharSequence selectedText = "";
    private RadioGroup radioGroup;
    private Button buttonOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                findViewById(R.id.button).setEnabled(true);
                RadioButton selectedRadioButton = findViewById(radioGroup.getCheckedRadioButtonId());
                selectedText = selectedRadioButton.getText();
            }
        });
        buttonOK = (Button)findViewById(R.id.button);
    }

    public void onClick(View view){
        Intent intent = new Intent(this, TextDisplayActivity.class);
        intent.putExtra("answerText", selectedText);
        startActivity(intent);
    }
}
