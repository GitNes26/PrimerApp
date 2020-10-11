package com.nestor.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EmptyStackException;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    TextView display, historial;
    Button btn0, btn1, btn2, btn3, btn4,btn5, btn6, btn7, btn8, btn9,
            btnP, btnI, btnS,btnR, btnM, btnD, btnPo, btnMM, btnC;
    String operador;
    double n1,n2,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.Resultado);
        historial = (TextView) findViewById(R.id.Historial);
        btn0 = (Button) findViewById(R.id.Btn_0); //devolver las propiedades especificas
        btn1 = (Button) findViewById(R.id.Btn_1);
        btn2 = (Button) findViewById(R.id.Btn_2);
        btn3 = (Button) findViewById(R.id.Btn_3);
        btn4 = (Button) findViewById(R.id.Btn_4);
        btn5 = (Button) findViewById(R.id.Btn_5);
        btn6 = (Button) findViewById(R.id.Btn_6);
        btn7 = (Button) findViewById(R.id.Btn_7);
        btn8 = (Button) findViewById(R.id.Btn_8);
        btn9 = (Button) findViewById(R.id.Btn_9);
        btnP = (Button) findViewById(R.id.Btn_Punto);
        btnI = (Button) findViewById(R.id.Btn_Igual);
        btnS = (Button) findViewById(R.id.Btn_Sumar);
        btnR = (Button) findViewById(R.id.Btn_Resta);
        btnM = (Button) findViewById(R.id.Btn_Multi);
        btnD = (Button) findViewById(R.id.Btn_Divi);
        btnPo = (Button) findViewById(R.id.Btn_Porcentaje);
        btnMM = (Button) findViewById(R.id.Btn_MasMenos);
        btnC = (Button) findViewById(R.id.Btn_C);



        //Btn7 = (Button)findViewById(R.id.Btn_7);
        //TextView TVresultado = (TextView) findViewById(R.id.Resultado);
        //TVresultado.setText("0");
        //Toast.makeText(this,"a sumar", Toast.LENGTH_SHORT).show(); //mostrar dialogo emergente
    }

    public void miclick(View num){
        String montoAcumulado = display.getText().toString();

        if (btn0.equals(num)) {
            if (montoAcumulado.equals("0")) {
                display.setText("0");
            } else {
                display.setText(montoAcumulado + "0");
            }
        } else if (btn1.equals(num)) {
            if (montoAcumulado.equals("0")) {
                display.setText("1");
            } else {
                display.setText(montoAcumulado + "1");
            }
        } else if (btn2.equals(num)) {
            if (montoAcumulado.equals("0")) {
                display.setText("2");
            } else {
                display.setText(montoAcumulado + "2");
            }
        } else if (btn3.equals(num)) {
            if (montoAcumulado.equals("0")) {
                display.setText("3");
            } else {
                display.setText(montoAcumulado + "3");
            }
        } else if (btn4.equals(num)) {
            if (montoAcumulado.equals("0")) {
                display.setText("4");
            } else {
                display.setText(montoAcumulado + "4");
            }
        } else if (btn5.equals(num)) {
            if (montoAcumulado.equals("0")) {
                display.setText("5");
            } else {
                display.setText(montoAcumulado + "5");
            }
        } else if (btn6.equals(num)) {
            if (montoAcumulado.equals("0")) {
                display.setText("6");
            } else {
                display.setText(montoAcumulado + "6");
            }
        } else if (btn7.equals(num)) {
            if (montoAcumulado.equals("0")) {
                display.setText("7");
            } else {
                display.setText(montoAcumulado + "7");
            }
        } else if (btn8.equals(num)) {
            if (montoAcumulado.equals("0")) {
                display.setText("8");
            } else {
                display.setText(montoAcumulado + "8");
            }
        } else if (btn9.equals(num)) {
            if (montoAcumulado.equals("0")) {
                display.setText("9");
            } else {
                display.setText(montoAcumulado + "9");
            }
        } else if (btnP.equals(num)) {
            if (montoAcumulado == ""){
                display.setText(montoAcumulado + "0.");
            }
            else if (montoAcumulado.contains(".")){
                display.setText(montoAcumulado);
            }
            else { display.setText(montoAcumulado + ".");}
        }else if (btnC.equals(num)){
            display.setText("0");
            historial.setText("");
            n1 = 0; n2 = 0; resultado = 0;
        }

    }

    public void Sumar(View view){
        String montoAcumulado = display.getText().toString();
        String Historial = historial.getText().toString();
        if (Historial.isEmpty()) {
            historial.setText(montoAcumulado + "+");
        }else {historial.setText(Historial + "+"); }
        operador = "+";
        n1 = Double.parseDouble(montoAcumulado);
        display.setText("");
    }
    public void Restar(View view){
        String montoAcumulado = display.getText().toString();
        String Historial = historial.getText().toString();
        if (Historial.isEmpty()) {
            historial.setText(montoAcumulado + "-");
        }else {historial.setText(Historial + "-"); }
        operador = "-";
        n1 = Double.parseDouble(montoAcumulado);
        display.setText("");
    }
    public void Multiplicar(View view){
        String montoAcumulado = display.getText().toString();

        operador = "×";
        n1 = Double.parseDouble(montoAcumulado);
        display.setText("");
//        try {
//            historial.setText(historial.getText().toString() + display.getText().toString() + "+");
//            n1 *= Double.parseDouble(montoAcumulado);
//            display.setText("");
//            Toast.makeText(this, "SUMAn1="+n1, Toast.LENGTH_SHORT).show();
//        } catch (EmptyStackException e) {
//            Toast.makeText(this, "Ingresa un valor o pulsa el igual", Toast.LENGTH_SHORT).show();
//        }
    }
    public void Dividir(View view){
        String montoAcumulado = display.getText().toString();

        operador = "÷";
        n1 = Double.parseDouble(montoAcumulado);
        display.setText("");
//        try {
//            historial.setText(historial.getText().toString() + display.getText().toString() + "-");
//            n1 /= Double.parseDouble(montoAcumulado);
//            display.setText("");
//            Toast.makeText(this, "RESTAn1="+n1, Toast.LENGTH_SHORT).show();
//        } catch (EmptyStackException e) {
//            Toast.makeText(this, "Ingresa un valor o pulsa el igual", Toast.LENGTH_SHORT).show();
//        }
    }

    public void Porcentaje(View view){
        String montoAcumulado = display.getText().toString();

        operador = "%";
        n1 = Double.parseDouble(montoAcumulado);
        display.setText("");
//        try {
//            historial.setText(historial.getText().toString() + display.getText().toString() + "-");
//            n1 = Double.parseDouble(display.getText().toString());
//            display.setText("");
//            Toast.makeText(this, "RESTAn1="+n1, Toast.LENGTH_SHORT).show();
//        } catch (EmptyStackException e) {
//            Toast.makeText(this, "Ingresa un valor o pulsa el igual", Toast.LENGTH_SHORT).show();
//        }
    }

    public void Invertir(View view){
        String montoAcumulado = display.getText().toString();

        n1 = Double.parseDouble(montoAcumulado) * -1;
        display.setText(String.valueOf(n1));
//        try {
//            historial.setText(historial.getText().toString() + display.getText().toString() + "-");
//            n1 = Double.parseDouble(display.getText().toString());
//            display.setText("");
//            Toast.makeText(this, "RESTAn1="+n1, Toast.LENGTH_SHORT).show();
//        } catch (EmptyStackException e) {
//            Toast.makeText(this, "Ingresa un valor o pulsa el igual", Toast.LENGTH_SHORT).show();
//        }
    }

    public void Total(View view){
        String montoAcumulado = display.getText().toString();
        try {
            switch (operador){
                case "+":
                    n2 = Double.parseDouble(montoAcumulado);
                    resultado = n1 + n2;
                    display.setText(String.valueOf(resultado));
                    break;
                case "-":
                    n2 = Double.parseDouble(montoAcumulado);
                    resultado = n1 - n2;
                    display.setText(String.valueOf(resultado));
                    break;
                case "×":
                    n2 = Double.parseDouble(montoAcumulado);
                    resultado = n1 * n2;
                    display.setText(String.valueOf(resultado));
                    break;
                case "÷":
                    n2 = Double.parseDouble(montoAcumulado);
                    resultado = n1 / n2;
                    display.setText(String.valueOf(resultado));
                    break;
                case "%":
                    n2 = Double.parseDouble(montoAcumulado);
                    resultado = (n1 * n2) / 100;
                    display.setText(String.valueOf(resultado));
                    break;
            }
            Toast.makeText(this, "n1="+n1+"--n2="+n2+"--Total="+resultado, Toast.LENGTH_SHORT).show();

        } catch (EmptyStackException e) {
            Toast.makeText(this, "Ingresa un valor o pulsa el igual", Toast.LENGTH_SHORT).show();
        }
    }
}