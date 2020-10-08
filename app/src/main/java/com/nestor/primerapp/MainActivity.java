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
        double Resultado = 0, Numero1 = 0, Numero2 = 0;
        String Operador="";

        switch (view.getId()) {
            case R.id.Btn_0:
                Button Btn0 = (Button) view;
                if (display.equals("0")){display.setText("0");}
                else{
                display.setText(display.getText().toString()+"0");}
                break;
            case R.id.Btn_1:
                Button Btn1 = (Button) view;
                display.setText(display.getText().toString()+"1");
                break;
            case R.id.Btn_2:
                Button Btn2 = (Button) view;
                display.setText(display.getText().toString()+"2");
                break;
            case R.id.Btn_3:
                Button Btn3 = (Button) view;
                display.setText(display.getText().toString()+"3");
                break;
            case R.id.Btn_4:
                Button Btn4 = (Button) view;
                display.setText(display.getText().toString()+"4");
                break;
            case R.id.Btn_5:
                Button Btn5 = (Button) view;
                display.setText(display.getText().toString()+"5");
                break;
            case R.id.Btn_6:
                Button Btn6 = (Button) view;
                display.setText(display.getText().toString()+"6");
                break;
            case R.id.Btn_7:
                Button Btn7 = (Button) view;
                display.setText(display.getText().toString()+"7");
                break;
            case R.id.Btn_8:
                Button Btn8 = (Button) view;
                display.setText(display.getText().toString()+"8");
                break;
            case R.id.Btn_9:
                Button Btn9 = (Button) view;
                display.setText(display.getText().toString()+"9");
                break;
            case R.id.Btn_Punto:
                Button BtnP = (Button) view;
                display.setText(display.getText().toString()+".");
                break;

            case R.id.Btn_Sumar:
                Operador = "+";
                Button BtnSuma = (Button) view;
                Numero1 = Double.parseDouble(display.getText().toString());
                display.setText("");
                //display.setText(display.getText().toString()+"+");
                break;
            case R.id.Btn_Resta:
                Operador = "-";
                Button BtnResta = (Button) view;
                Numero1 = Double.parseDouble(display.getText().toString());
                display.setText("");
                //display.setText(display.getText().toString()+"-");
                break;
            case R.id.Btn_Multi:
                Operador = "×";
                Button BtnMulti = (Button) view;
                Numero1 = Double.parseDouble(display.getText().toString());
                display.setText("");
                //display.setText(display.getText().toString()+"×");
                break;
            case R.id.Btn_Divi:
                Operador = "÷";
                Button BtnDivi = (Button) view;
                Numero1 = Double.parseDouble(display.getText().toString());
                display.setText("");
                //display.setText(display.getText().toString()+"÷");
                break;
            case R.id.Btn_Porcentaje:
                Operador = "%";
                Button BtnPorcentaje = (Button) view;
                Numero1 = Double.parseDouble(display.getText().toString());
                display.setText("");
                //display.setText(display.getText().toString()+"%");
                break;

            case R.id.Btn_Igual:
                Button b= (Button) view; //devolver las propiedades especificas
                Numero2 = Double.parseDouble(display.getText().toString());

                switch (Operador) {
                    case "+":
                        display.setText("");
                        Resultado = Numero1 + Numero2;
                        break;
                    case "-":
                        display.setText("");
                        Resultado = Numero1 - Numero2;
                        break;
                    case "×":
                        display.setText("");
                        Resultado = Numero1 * Numero2;
                        break;
                    case "÷":
                        display.setText("");
                        Resultado = Numero1 / Numero2;
                        break;
                    //case "%":
                      //  display.setText("");
                      //  Resultado = Numero1 ;
                      //  break;
                }

                    display.setText(String.valueOf(Resultado));
                break;
            case R.id.Btn_C:
                Button BtnC = (Button) view;
                display.setText("");
                Resultado=0;
                Numero1=0;
                Numero2=0;
                Operador="";
                break;


        }
    }

    public void Sumar(View view) {

    }
}