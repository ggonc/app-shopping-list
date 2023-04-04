package com.mobile.sistemadecompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {

    public Button btnTotal;
    public TextView textResultado, textValorTotal;
    public CheckBox chkProduto1, chkProduto2, chkProduto3, chkProduto4, chkProduto5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTotal = findViewById(R.id.btnTotal);
        chkProduto1 = findViewById(R.id.chkProduto1);
        chkProduto2 = findViewById(R.id.chkProduto2);
        chkProduto3 = findViewById(R.id.chkProduto3);
        chkProduto4 = findViewById(R.id.chkProduto4);
        chkProduto5 = findViewById(R.id.chkProduto5);
        textResultado = findViewById(R.id.textResultado);
        textValorTotal = findViewById(R.id.textValorTotal);
    }

    public void calcularTotal(View view){
        double[] produtos = {5.99, 3.68, 26.35, 4.76, 7.98};
        boolean[] checkBoxes = {chkProduto1.isChecked(), chkProduto2.isChecked(), chkProduto3.isChecked(), chkProduto4.isChecked(), chkProduto5.isChecked()};
        double resultado = 0.00;

        for(int i = 0; i < checkBoxes.length; i++){
            if (checkBoxes[i] == true){
                resultado += produtos[i];
            }
        }

        textResultado.setText("R$ " + String.format("%.2f", resultado));
    }

}