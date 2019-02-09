package com.example.radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton java,python,c,cpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        java = findViewById(R.id.radio1);
        python=findViewById(R.id.radio2);
        c=findViewById(R.id.radio3);
        cpp=findViewById(R.id.radio4);
    }

    public void onButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        String str="";
        switch (view.getId()){
            case R.id.radio1:
                if(checked)
                    str="Java Selected";
                    break;
            case R.id.radio2:
                if(checked)
                    str="Python Selected";
                    break;
            case R.id.radio3:
                if(checked)
                    str="C Selected";
                    break;
            case R.id.radio4:
                if(checked)
                    str="C++ Selected";
                    break;
        }
        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
    }
}
