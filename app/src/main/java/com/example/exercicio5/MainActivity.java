package com.example.exercicio5;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean currentPlayer;
    private int counterX;
    private  int counterO;
    private int grid[][] = new int [3][3];

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    private TextView winnerX;
    private TextView winnerO;
    private TextView winner;

    private void inicializaMat (){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                grid[i][j] = i+j;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.Botao1);
        button2 = findViewById(R.id.Botao2);
        button3 = findViewById(R.id.Botao3);
        button4 = findViewById(R.id.Botao4);
        button5 = findViewById(R.id.Botao5);
        button6 = findViewById(R.id.Botao6);
        button7 = findViewById(R.id.Botao7);
        button8 = findViewById(R.id.Botao8);
        button9 = findViewById(R.id.Botao9);

        final TextView player = findViewById(R.id.Jogador);
        winner = findViewById(R.id.Vencedor);
        winnerX = findViewById(R.id.VitorioasX);
        winnerO = findViewById(R.id.VitoriasO);

        inicializaMat();
        Intent intent = getIntent();
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
                    grid[0][0] = 1;
                    checkWinner();
                }else{
                    button1.setText("O");
                    button1.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    grid[0][0] = 0;
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
                    grid[0][1] = 1;
                    checkWinner();
                }else{
                    button2.setText("O");
                    button2.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    grid[0][1] = 0;
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
                    grid[0][2] = 1;
                    checkWinner();
                }else{
                    button3.setText("O");
                    button3.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    grid[0][2] = 0;
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
                    grid[1][0] = 1;
                    checkWinner();
                }else{
                    button4.setText("O");
                    button4.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    grid[1][0] = 0;
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
                    grid[1][1] = 1;
                    checkWinner();
                }else{
                    button5.setText("O");
                    button5.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    grid[1][1] = 0;
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
                    grid[1][2] = 1;
                    checkWinner();
                }else{
                    button6.setText("O");
                    button6.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    grid[1][2] = 0;
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
                    grid[2][0] = 1;
                    checkWinner();
                }else{
                    button7.setText("O");
                    button7.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    grid[2][0] = 0;
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
                    grid[2][1] = 1;
                    checkWinner();
                }else{
                    button8.setText("O");
                    button8.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    grid[2][1] = 0;
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
                    grid[2][2] = 1;
                    checkWinner();
                }else{
                    button9.setText("O");
                    button9.setClickable(false);
                    currentPlayer = true;
                    player.setText(getString(R.string.Vez_JogadorX));
                    grid[2][2] = 0;
                    checkWinner();
                }
            }
        });

    }

    private void checkWinner(){
        if (grid[0][0] == grid[0][1] && grid[0][0] == grid[0][2]){
            if(grid[0][0] == 1){
                counterX += 1;
                winnerX.setText(getString(R.string.counterX)+ " " + counterX);
                inicializaMat();
                venceu(1);
            }else if (grid[0][0] == 0){
                counterO += 1;
                winnerO.setText(getString(R.string.counterO)+ " " + counterO);
                inicializaMat();
                venceu(0);
            }
        }
        if (grid[1][0] == grid[1][1] && grid[1][0] == grid[1][2]) {
            if (grid[1][0] == 1) {
                counterX += 1;
                winnerX.setText(getString(R.string.counterX) + " " + counterX);
                inicializaMat();
                venceu(1);
            } else if (grid[1][0] == 0) {
                counterO += 1;
                winnerO.setText(getString(R.string.counterO) + " " + counterO);
                inicializaMat();
                venceu(0);
            }
        }
        if (grid[2][0] == grid[2][1] && grid[2][0] == grid[2][2]){
            if(grid[2][0] == 1){
                counterX += 1;
                winnerX.setText(getString(R.string.counterX)+ " " + counterX);
                inicializaMat();
                venceu(1);
            }else if (grid[2][0] == 0){
                counterO += 1;
                winnerO.setText(getString(R.string.counterO)+ " " + counterO);
                inicializaMat();
                venceu(0);
            }
        }
        if (grid[0][0] == grid[1][0] && grid[0][0] == grid[2][0]){
            if(grid[0][0] == 1){
                counterX += 1;
                winnerX.setText(getString(R.string.counterX)+ " " + counterX);
                inicializaMat();
                venceu(1);
            }else if (grid[0][0] == 0){
                counterO += 1;
                winnerO.setText(getString(R.string.counterO)+ " " + counterO);
                inicializaMat();
                venceu(0);
            }
        }
        if (grid[0][1] == grid[1][1] && grid[0][1] == grid[2][1]){
            if(grid[0][1] == 1){
                counterX += 1;
                winnerX.setText(getString(R.string.counterX)+ " " + counterX);
                inicializaMat();
                venceu(1);
            }else if (grid[0][1] == 0){
                counterO += 1;
                winnerO.setText(getString(R.string.counterO)+ " " + counterO);
                inicializaMat();
                venceu(0);
            }
        }
        if (grid[0][2] == grid[1][2] && grid[0][2] == grid[2][2]){
            if(grid[0][2] == 1){
                counterX += 1;
                winnerX.setText(getString(R.string.counterX)+ " " + counterX);
                inicializaMat();
                venceu(1);
            }else if (grid[0][2] == 0){
                counterO += 1;
                winnerO.setText(getString(R.string.counterO)+ " " + counterO);
                inicializaMat();
                venceu(0);
            }
        }
        if (grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2]){
            if(grid[0][0] == 1){
                counterX += 1;
                winnerX.setText(getString(R.string.counterX)+ " " + counterX);
                inicializaMat();
                venceu(1);
            }else if (grid[0][0] == 0){
                counterO += 1;
                winnerO.setText(getString(R.string.counterO)+ " " + counterO);
                inicializaMat();
                venceu(0);
            }
        }
        if (grid[0][2] == grid[1][1] && grid[0][2] == grid[2][0]){
            if(grid[0][2] == 1){
                counterX += 1;
                winnerX.setText(getString(R.string.counterX)+ " " + counterX);
                inicializaMat();
                venceu(1);
            }else if (grid[0][2] == 0){
                counterO += 1;
                winnerO.setText(getString(R.string.counterO)+ " " + counterO);
                inicializaMat();
                venceu(0);
            }
        }
    }

    private void venceu(int i){
        Handler handler = new Handler();

        if(i == 1){
            winner.setText("Jogador X venceu");
            button9.setClickable(true);
            currentPlayer = false;
        }
        if(i == 0){
            winner.setText("Jogador O venceu");
            button9.setClickable(true);
            currentPlayer = true;
        }
        handler.postDelayed(new Runnable() {
            public void run() {
                recreate();
            }
        }, 5000);
    }
}
