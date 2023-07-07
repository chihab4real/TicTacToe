package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainGame extends AppCompatActivity {

    ImageView _00,_01,_02,_10,_11,_12,_20,_21,_22;

    Boolean[][] filled = new Boolean[3][3];
    String[][] game = new String[3][3];

    String turn = "x";



    int number=0;

    TextView turnText,message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        turnText = findViewById(R.id.turn);
        message = findViewById(R.id.message);

        filled=resetFilled();

        _00 = findViewById(R.id._00);
        _01=findViewById(R.id._01);
        _02=findViewById(R.id._02);
        _10=findViewById(R.id._10);
        _11=findViewById(R.id._11);
        _12=findViewById(R.id._12);
        _20=findViewById(R.id._20);
        _21=findViewById(R.id._21);
        _22=findViewById(R.id._22);

        _00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!filled[0][0]){

                    filled[0][0] = true;
                    game[0][0] = turn;
                    if(turn.equals("x")){
                        Glide.with(getApplicationContext())
                                .load(R.drawable.close)
                                .into(_00);




                        turn="o";
                    }else {
                        Glide.with(getApplicationContext())
                                .load(R.drawable.o)
                                .into(_00);

                        turn="x";
                    }


                    number+=1;
                    if(number==9){
                        turnText.setVisibility(View.GONE);
                        message.setText("Game Ended");
                    }
                    turnText.setText(turn);
                }



            }
        });


        _01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!filled[0][1]){

                    filled[0][1] = true;


                    game[0][1] = turn;
                    if(turn.equals("x")){
                        Glide.with(getApplicationContext())
                                .load(R.drawable.close)
                                .into(_01);




                        turn="o";
                    }else {
                        Glide.with(getApplicationContext())
                                .load(R.drawable.o)
                                .into(_01);

                        turn="x";
                    }

                    number+=1;
                    if(number==9){
                        turnText.setVisibility(View.GONE);
                        message.setText("Game Ended");
                    }
                    turnText.setText(turn);
                }

            }
        });

        _02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!filled[0][2]){

                    filled[0][2] = true;
                    game[0][2] = turn;
                    if(turn.equals("x")){
                        Glide.with(getApplicationContext())
                                .load(R.drawable.close)
                                .into(_02);




                        turn="o";
                    }else {
                        Glide.with(getApplicationContext())
                                .load(R.drawable.o)
                                .into(_02);

                        turn="x";
                    }


                    number+=1;
                    if(number==9){
                        turnText.setVisibility(View.GONE);
                        message.setText("Game Ended");
                    }
                    turnText.setText(turn);
                }
            }
        });

        _10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(!filled[1][0]){

                    filled[1][0] = true;
                    game[1][0] = turn;
                    if(turn.equals("x")){
                        Glide.with(getApplicationContext())
                                .load(R.drawable.close)
                                .into(_10);




                        turn="o";
                    }else {
                        Glide.with(getApplicationContext())
                                .load(R.drawable.o)
                                .into(_10);

                        turn="x";
                    }


                    number+=1;
                    if(number==9){
                        turnText.setVisibility(View.GONE);
                        message.setText("Game Ended");
                    }
                    turnText.setText(turn);
                }


            }
        });

        _11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!filled[1][1]){

                    filled[1][1] = true;
                    game[1][1] = turn;
                    if(turn.equals("x")){
                        Glide.with(getApplicationContext())
                                .load(R.drawable.close)
                                .into(_11);




                        turn="o";
                    }else {
                        Glide.with(getApplicationContext())
                                .load(R.drawable.o)
                                .into(_11);

                        turn="x";
                    }


                    number+=1;
                    if(number==9){
                        turnText.setVisibility(View.GONE);
                        message.setText("Game Ended");
                    }
                    turnText.setText(turn);
                }
            }
        });

        _12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!filled[1][2]){

                    filled[1][2] = true;
                    game[1][2] = turn;
                    if(turn.equals("x")){
                        Glide.with(getApplicationContext())
                                .load(R.drawable.close)
                                .into(_12);




                        turn="o";
                    }else {
                        Glide.with(getApplicationContext())
                                .load(R.drawable.o)
                                .into(_12);

                        turn="x";
                    }

                    number+=1;
                    if(number==9){
                        turnText.setVisibility(View.GONE);
                        message.setText("Game Ended");
                    }

                    turnText.setText(turn);
                }
            }
        });

        _20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(!filled[2][0]){

                    filled[2][0] = true;
                    game[2][0] = turn;
                    if(turn.equals("x")){
                        Glide.with(getApplicationContext())
                                .load(R.drawable.close)
                                .into(_20);




                        turn="o";
                    }else {
                        Glide.with(getApplicationContext())
                                .load(R.drawable.o)
                                .into(_20);

                        turn="x";
                    }

                    number+=1;
                    if(number==9){
                        turnText.setVisibility(View.GONE);
                        message.setText("Game Ended");
                    }

                    turnText.setText(turn);
                }
            }
        });

        _21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!filled[2][1]){

                    filled[2][1] = true;
                    game[2][1] = turn;
                    if(turn.equals("x")){
                        Glide.with(getApplicationContext())
                                .load(R.drawable.close)
                                .into(_21);




                        turn="o";
                    }else {
                        Glide.with(getApplicationContext())
                                .load(R.drawable.o)
                                .into(_21);

                        turn="x";
                    }


                    number+=1;
                    if(number==9){
                        turnText.setVisibility(View.GONE);
                        message.setText("Game Ended");
                    }
                    turnText.setText(turn);
                }
            }
        });

        _22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(!filled[2][2]){

                    filled[2][2] = true;
                    game[2][2] = turn;
                    if(turn.equals("x")){
                        Glide.with(getApplicationContext())
                                .load(R.drawable.close)
                                .into(_22);




                        turn="o";
                    }else {
                        Glide.with(getApplicationContext())
                                .load(R.drawable.o)
                                .into(_22);

                        turn="x";
                    }

                    number+=1;
                    if(number==9){
                        turnText.setVisibility(View.GONE);
                        message.setText("Game Ended");
                    }

                    turnText.setText(turn);
                }
            }
        });
    }


    private Boolean[][] resetFilled(){
        Boolean[][] table = new Boolean[3][3];


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                table[i][j] = false;
            }
        }

        return table;
    }
}