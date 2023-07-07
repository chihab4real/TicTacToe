package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainGame extends AppCompatActivity {

    ImageView _00,_01,_02,_10,_11,_12,_20,_21,_22;

    Boolean[][] filled = new Boolean[3][3];
    String[][] game = new String[3][3];

    String turn = "x";


    Boolean game_running = true;

    CardView restartGame;



    int number=0;

    TextView turnText,message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        turnText = findViewById(R.id.turn);
        message = findViewById(R.id.message);

        filled=resetFilled();

        restartGame = findViewById(R.id.reStart);
        _00 = findViewById(R.id._00);
        _01=findViewById(R.id._01);
        _02=findViewById(R.id._02);
        _10=findViewById(R.id._10);
        _11=findViewById(R.id._11);
        _12=findViewById(R.id._12);
        _20=findViewById(R.id._20);
        _21=findViewById(R.id._21);
        _22=findViewById(R.id._22);

        restartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                game = new String[3][3];
                filled = resetFilled();
                game_running = true;
                turn = "x";
                message.setText("its your turn");
                turnText.setText("X");
                turnText.setVisibility(View.VISIBLE);
                Glide.with(getApplicationContext()).clear(_00);
                Glide.with(getApplicationContext()).clear(_01);
                Glide.with(getApplicationContext()).clear(_02);
                Glide.with(getApplicationContext()).clear(_10);
                Glide.with(getApplicationContext()).clear(_11);
                Glide.with(getApplicationContext()).clear(_12);
                Glide.with(getApplicationContext()).clear(_20);
                Glide.with(getApplicationContext()).clear(_21);
                Glide.with(getApplicationContext()).clear(_22);

                number=0;

                restartGame.setVisibility(View.GONE);

            }
        });

        _00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!filled[0][0] && game_running){

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


                    Check(game,filled);
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

                if(!filled[0][1] && game_running){

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

                    Check(game,filled);
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
                if(!filled[0][2]  && game_running){

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


                    Check(game,filled);
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



                if(!filled[1][0] && game_running){

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


                    Check(game,filled);
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

                if(!filled[1][1]  && game_running){

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


                    Check(game,filled);
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

                if(!filled[1][2]  && game_running){

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

                    Check(game,filled);
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


                if(!filled[2][0] && game_running){

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

                    Check(game,filled);
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
                if(!filled[2][1] && game_running){

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


                    Check(game,filled);
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


                if(!filled[2][2]  && game_running){

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

                    Check(game,filled);
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


    private void Check(String[][] game,Boolean[][] filled){

        for(int i=0;i<3;i++){
            if(filled[i][0] && game[i][0].equals(game[i][1]) && game[i][1].equals(game[i][2])){
                Toast.makeText(getApplicationContext(),"Winner: "+game[i][2]+"\n["+i+",0]["+i+",1]["+i+",2]",Toast.LENGTH_LONG).show();
                game_running = false;
                ChnageUI(game[i][2],"i="+i);
                break;
            }
        }


        for(int j=0;j<3;j++){
            if(filled[0][j] && game[0][j].equals(game[1][j]) && game[1][j].equals(game[2][j])){
                Toast.makeText(getApplicationContext(),"Winner: "+game[2][j]+"\n[0,"+j+"][1,"+j+"][2,"+j+"]",Toast.LENGTH_LONG).show();
                game_running = false;
                ChnageUI(game[2][j],"j="+j);
                break;
            }
        }


        if(filled[0][0] && game[0][0].equals(game[1][1]) && game[1][1].equals(game[2][2])){
            Toast.makeText(getApplicationContext(),"Winner: "+game[0][0]+"\nDiaagonal I",Toast.LENGTH_LONG).show();
            ChnageUI(game[0][0],"d1");
            game_running = false;
        }

        if(filled[0][2] && game[0][2].equals(game[1][1]) && game[1][1].equals(game[2][0])){
            Toast.makeText(getApplicationContext(),"Winner: "+game[0][2]+"\nDiaagonal II",Toast.LENGTH_LONG).show();
            ChnageUI(game[1][1],"d2");
            game_running = false;
        }


    }

    private void ChnageUI(String winner,String line){

        turnText.setVisibility(View.GONE);
        message.setText(winner.toUpperCase()+" is a Winner");
        restartGame.setVisibility(View.VISIBLE);

        int drawable;
        if(winner.equals("x")){
            drawable = R.drawable.close_red;
        }else{
            drawable = R.drawable.o_red;
        }


        if(line.equals("d1")){
            Glide.with(getApplicationContext())
                    .load(drawable)
                    .into(_00);

            Glide.with(getApplicationContext())
                    .load(drawable)
                    .into(_11);

            Glide.with(getApplicationContext())
                    .load(drawable)
                    .into(_22);


        }

        if(line.equals("d2")){
            Glide.with(getApplicationContext())
                    .load(drawable)
                    .into(_02);

            Glide.with(getApplicationContext())
                    .load(drawable)
                    .into(_11);

            Glide.with(getApplicationContext())
                    .load(drawable)
                    .into(_20);


        }

        if(line.contains("i")){
            char x = line.charAt(2);

            switch (Integer.parseInt(x+"")){
                case 0:
                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_00);

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_01);

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_02);


                    break;
                case 1:
                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_10);

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_11);

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_12);
                    break;
                case 2:

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_20);

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_21);

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_22);
                    break;
            }

        }


        if(line.contains("j")){
            String x = line.charAt(2)+"";

            switch (Integer.parseInt(x)){
                case 0:
                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_00);

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_10);

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_20);


                    break;
                case 1:
                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_01);

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_11);

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_21);
                    break;
                case 2:

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_02);

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_12);

                    Glide.with(getApplicationContext())
                            .load(drawable)
                            .into(_22);
                    break;
            }

        }

    }
}