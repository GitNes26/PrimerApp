package com.nestor.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Btn7 = (Button)findViewById(R.id.Btn_7);
        //TextView TVresultado = (TextView) findViewById(R.id.Resultado);
        //TVresultado.setText("0");
        //Toast.makeText(this,"a sumar", Toast.LENGTH_SHORT).show(); //mostrar dialogo emergente
    }


    public void miclick(View view) { // View View para generalizar cualquier componente
        TextView display = (TextView) findViewById(R.id.Resultado);
        double Resultado = 0;

        switch (view.getId()) {
            case R.id.Btn_0:
                Button Btn0 = (Button) view;
                display.setText(display.getText() + "0");
                break;
            case R.id.Btn_1:
                Button Btn1 = (Button) view;
                display.setText(display.getText()+"1");
                break;
            case R.id.Btn_2:
                Button Btn2 = (Button) view;
                display.setText(display.getText()+"2");
                break;
            case R.id.Btn_3:
                Button Btn3 = (Button) view;
                display.setText(display.getText()+"3");
                break;
            case R.id.Btn_4:
                Button Btn4 = (Button) view;
                display.setText(display.getText()+"4");
                break;
            case R.id.Btn_5:
                Button Btn5 = (Button) view;
                display.setText(display.getText()+"5");
                break;
            case R.id.Btn_6:
                Button Btn6 = (Button) view;
                display.setText(display.getText()+"6");
                break;
            case R.id.Btn_7:
                Button Btn7 = (Button) view;
                display.setText(display.getText()+"7");
                break;
            case R.id.Btn_8:
                Button Btn8 = (Button) view;
                display.setText(display.getText()+"8");
                break;
            case R.id.Btn_9:
                Button Btn9 = (Button) view;
                display.setText(display.getText()+"9");
                break;

            case R.id.Btn_Sumar:
                Button BtnSuma = (Button) view;

                break;
            case R.id.Btn_Resta:
                Button BtnResta = (Button) view;
                break;
            case R.id.Btn_Igual:
                Button b= (Button) view; //devolver las propiedades especificas

                break;
            case R.id.Btn_C:
                Button BtnC = (Button) view;
                display.setText("0");
                break;


        }
    }

    public void Sumar(View view) {

    }
}