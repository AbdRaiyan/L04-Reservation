package sg.edu.rp.c346.id20022280.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText phoneNum;
    EditText pplNum;
    CheckBox areaS;
    CheckBox areaNS;
    DatePicker dp;
    TimePicker tp;
    TextView display;
    Button submit;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name.findViewById(R.id.editTextName);
        phoneNum.findViewById(R.id.editTextNumber);
        pplNum.findViewById(R.id.editTextGroupNo);
        areaS.findViewById(R.id.CheckboxSA);
        areaNS.findViewById(R.id.CheckboxNSA);
        dp.findViewById(R.id.dp);
        tp.findViewById(R.id.tp);
        display.findViewById(R.id.textViewEnd);
        submit.findViewById(R.id.buttonSubmit);
        reset.findViewById(R.id.buttonReset);

        dp.updateDate(2020,6,1);
        tp.setCurrentHour(7);
        tp.setCurrentMinute(30);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dispText = "Your Reservation is set.";
                dispText += " Name: " +name.getText().toString();
                dispText += " Tel No: " + phoneNum.getText().toString();
                dispText += " Number of People: " + pplNum.getText().toString();

                if(areaS.isChecked()){
                    dispText +=" Area: Smoking";
                } else {
                    dispText +=" Area: Non-Smoking";
                }

                display.setText(dispText);
            }
        });

    }
}