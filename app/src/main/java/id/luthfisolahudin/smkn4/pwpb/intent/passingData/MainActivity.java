package id.luthfisolahudin.smkn4.pwpb.intent.passingData;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonAction;
    private EditText editData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editData = findViewById(R.id.edit_data);

        buttonAction = findViewById(R.id.button_action);
        buttonAction.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ReceiverActivity.class);
            intent.putExtra("data", editData.getText().toString());
            startActivity(intent);
        });
    }
}