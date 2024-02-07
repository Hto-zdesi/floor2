package com.example.floor2;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupGender;
    private RadioButton radioButtonMale, radioButtonFemale;
    private Button buttonApply;
    private View mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupGender = findViewById(R.id.radioGroupGender);
        radioButtonMale = findViewById(R.id.radioButtonMale);
        radioButtonFemale = findViewById(R.id.radioButtonFemale);
        buttonApply = findViewById(R.id.buttonApply);
        mainLayout = findViewById(R.id.mainLayout);

        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applyChanges();
            }
        });
    }

    private void applyChanges() {
        int selectedGenderId = radioGroupGender.getCheckedRadioButtonId();
        if (selectedGenderId == R.id.radioButtonMale) {
            // Выбран мужской пол
            mainLayout.setBackgroundColor(Color.BLUE); // Изменяем цвет фона на синий
        } else if (selectedGenderId == R.id.radioButtonFemale) {
            // Выбран женский пол
            mainLayout.setBackgroundColor(Color.RED); // Изменяем цвет фона на красный
        }
    }
}
