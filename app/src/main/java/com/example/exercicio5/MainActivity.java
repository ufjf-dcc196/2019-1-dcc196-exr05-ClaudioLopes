package com.example.exercicio5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean currentPlayer;
    private int counterX;
    private  int counterO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = findViewById(R.id.Botao1);
        final Button button2 = findViewById(R.id.Botao2);
        final Button button3 = findViewById(R.id.Botao3);
        final Button button4 = findViewById(R.id.Botao4);
        final Button button5 = findViewById(R.id.Botao5);
        final Button button6 = findViewById(R.id.Botao6);
        final Button button7 = findViewById(R.id.Botao7);
        final Button button8 = findViewById(R.id.Botao8);
        final Button button9 = findViewById(R.id.Botao9);

        final TextView player = findViewById(R.id.Jogador);
        TextView winner = findViewById(R.id.Vencedor);
        TextView winnerX = findViewById(R.id.VitorioasX);
        TextView winnerO = findViewById(R.id.VitoriasO);

        currentPlayer = true;
        counterX = 0;
        counterO = 0;

        player.setText(getString(R.string.Vez_JogadorX));
        winnerX.setText(getString(R.string.counterX)+ " " + counterX);
        winnerO.setText(getString(R.string.counterO)+ " " + counterO);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer){
                    button1.setText("X");
                    button1.setClickable(false);
                    currentPlayer = false;
                    player.setText(getString(R.string.Vez_JogadorO));
                    checkWinner();
                }else{
                    button1.setText("O");
                    button1.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    checkWinner();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer){
                    button2.setText("X");
                    button2.setClickable(false);
                    currentPlayer = false;
                    checkWinner();
                }else{
                    button2.setText("O");
                    button2.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    checkWinner();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer){
                    button3.setText("X");
                    button3.setClickable(false);
                    currentPlayer = false;
                    player.setText(getString(R.string.Vez_JogadorO));
                    checkWinner();
                }else{
                    button3.setText("O");
                    button3.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    checkWinner();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer){
                    button4.setText("X");
                    button4.setClickable(false);
                    currentPlayer = false;
                    player.setText(getString(R.string.Vez_JogadorO));
                    checkWinner();
                }else{
                    button4.setText("O");
                    button4.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    checkWinner();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer){
                    button5.setText("X");
                    button5.setClickable(false);
                    currentPlayer = false;
                    player.setText(getString(R.string.Vez_JogadorO));
                    checkWinner();
                }else{
                    button5.setText("O");
                    button5.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    checkWinner();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer){
                    button6.setText("X");
                    button6.setClickable(false);
                    currentPlayer = false;
                    player.setText(getString(R.string.Vez_JogadorO));
                    checkWinner();
                }else{
                    button6.setText("O");
                    button6.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    checkWinner();
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer){
                    button7.setText("X");
                    button7.setClickable(false);
                    currentPlayer = false;
                    player.setText(getString(R.string.Vez_JogadorO));
                    checkWinner();
                }else{
                    button7.setText("O");
                    button7.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    checkWinner();
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer){
                    button8.setText("X");
                    button8.setClickable(false);
                    currentPlayer = false;
                    player.setText(getString(R.string.Vez_JogadorO));
                    checkWinner();
                }else{
                    button8.setText("O");
                    button8.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    checkWinner();
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer){
                    button9.setText("X");
                    button9.setClickable(false);
                    currentPlayer = false;
                    player.setText(getString(R.string.Vez_JogadorO));
                    checkWinner();
                }else{
                    button9.setText("O");
                    button9.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    checkWinner();
                }
            }
        });

    }

    private void checkWinner(){

    }
}
