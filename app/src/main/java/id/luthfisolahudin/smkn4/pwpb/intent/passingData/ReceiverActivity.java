package id.luthfisolahudin.smkn4.pwpb.intent.passingData;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiverActivity extends AppCompatActivity {

    private TextView textData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        String data = getIntent().getExtras().getString("data");

        textData = findViewById(R.id.text_data);
        textData.setText(data);
    }
}