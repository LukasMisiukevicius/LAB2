package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spCountChoice;
    private EditText etInput;
    private TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spCountChoice = findViewById(R.id.spCountChoice);
        etInput = findViewById(R.id.etInput);
        tvCount = findViewById(R.id.tvCount);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spCountChoice.setAdapter(adapter);
    }

    public void onBtnCountClick(View view)
    {
        if(spCountChoice.getSelectedItem().toString().equalsIgnoreCase(getString(R.string.selection_chars)))
        {
            tvCount.setText(TextCounter.getCharCount(etInput.getText().toString()));
        }
        else
        {
            String count = TextCounter.getWordCount(etInput.getText().toString());
            if (Integer.valueOf(count) == 0)
            {
                Toast.makeText(this, "Input is empty", Toast.LENGTH_SHORT).show();
                tvCount.setText("0");
            }
            else
            {
                tvCount.setText(String.valueOf(count));
            }
        }
    }
}