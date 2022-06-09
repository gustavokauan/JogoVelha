package com.example.jogovelha3infd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btnReset;
    TextView txt1, txt2;
    String jogador;
    int[] jogadas = {-1, -2, -3, -4, -5, -6, -7, -8, -9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btnReset = findViewById(R.id.btnReset);

        jogador = "X";

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
    }

    public void play(View v) {
        Button botaoClicado = findElementById(v.getId());

        //coloca o X/O no texto do botão e desabilita-o
        botaoClicado.setText(jogador);
        botaoClicado.setEnabled(false);

        // troca jogador
        if (jogador.equals("X"))
            jogador = "O";
        else
            jogador = "X";

        // verifica vencedor
        //if((btn0.getText() == btn1.getText() && btn1.getText() == btn2.getText()) || (btn3.getText() == btn4.getText() && btn4.getText() == btn5.getText()))

        //012
        if ((jogadas[0] == jogadas[1]) && (jogadas[1] == jogadas[2])) {

        }
        //345
        else if ((jogadas[3] == jogadas[4]) && (jogadas[4] == jogadas[5])) {

        }
        //678
        else if ((jogadas[6] == jogadas[7]) && (jogadas[7] == jogadas[8])) {

        }
        //036
        else if ((jogadas[0] == jogadas[3]) && (jogadas[3] == jogadas[6])) {

        }
        //147
        else if ((jogadas[1] == jogadas[4]) && (jogadas[4] == jogadas[7])) {

        }
        //258
        else if ((jogadas[2] == jogadas[5]) && (jogadas[5] == jogadas[8])) {

        }
        //048
        else if ((jogadas[0] == jogadas[4]) && (jogadas[4] == jogadas[8]))
        {

        }
        //246
        else if((jogadas[2] == jogadas[4]) && (jogadas[4] == jogadas[6]))
        {

        }
    }

    public void reset(View v){

    }
  /*
    public void pontinho(int pato){
        if(pato == 0)
        {

        }
        if (pato == 1)
        {

        }

    }*/
}