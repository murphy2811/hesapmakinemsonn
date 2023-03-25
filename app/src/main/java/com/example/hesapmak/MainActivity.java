package com.example.hesapmak;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    TextView girdi_ekrani,sonuç;
    MaterialButton parantez_aç,parantez_kapa,bölme,çarpma,toplama,çıkarma,eşittir,buton1,buton2,buton3,buton4,buton5,buton6,buton7,buton8,buton9,buton0,butonsil,butontümsil,nokta ;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sonuç = findViewById(R.id.sonuç);
        girdi_ekrani = findViewById(R.id.girdi_ekrani);
        buton0 = findViewById(R.id.sıfır_butonu);
        buton1 = findViewById(R.id.bir_butonu);
        buton2 = findViewById(R.id.iki_butonu);
        buton3 = findViewById(R.id.üç_butonu);
        buton4 = findViewById(R.id.dört_butonu);
        buton5 = findViewById(R.id.beş_butonu);
        buton6 = findViewById(R.id.altı_butonu);
        buton7 = findViewById(R.id.yedi_butonu);
        buton8 = findViewById(R.id.sekiz_butonu);
        buton9 = findViewById(R.id.dokuz_butonu);
        butonsil = findViewById(R.id.C_butonu);
        butontümsil = findViewById(R.id.AC_butonu);
        parantez_aç = findViewById(R.id.açma_parantezi);
        parantez_kapa = findViewById(R.id.kapama_parantezi);
        bölme = findViewById(R.id.bölme_butonu);
        çarpma = findViewById(R.id.çarpma_butonu);
        çıkarma = findViewById(R.id.çıkarma_butonu);
        toplama = findViewById(R.id.toplama_butonu);
        eşittir = findViewById(R.id.eşittir_butonu);
        çarpma = findViewById(R.id.çarpma_butonu);
        nokta = findViewById(R.id.nokta_butonu);
        girdi_ekrani.setText("0");
        sonuç.setText("0");
        buton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = 0;
                if (girdi_ekrani.getText().toString() == "0") {
                    girdi_ekrani.setText("");
                } else if (girdi_ekrani.getText().toString() == "+" ||
                        girdi_ekrani.getText().toString() == "X" ||
                        girdi_ekrani.getText().toString() == "/" ||
                        girdi_ekrani.getText().toString() == "-") {
                    girdi_ekrani.setText("");
                }
                girdi_ekrani.setText(girdi_ekrani.getText() + String.valueOf(s1));

            }

        });
        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = 1;
                if (girdi_ekrani.getText().toString() == "0") {
                    girdi_ekrani.setText("");
                } else if (girdi_ekrani.getText().toString() == "+" ||
                        girdi_ekrani.getText().toString() == "X" ||
                        girdi_ekrani.getText().toString() == "/" ||
                        girdi_ekrani.getText().toString() == "-") {
                    girdi_ekrani.setText("");
                }
                girdi_ekrani.setText(girdi_ekrani.getText() + String.valueOf(s1));

            }

        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = 2;
                if (girdi_ekrani.getText().toString() == "0") {
                    girdi_ekrani.setText("");
                } else if (girdi_ekrani.getText().toString() == "+" ||
                        girdi_ekrani.getText().toString() == "X" ||
                        girdi_ekrani.getText().toString() == "/" ||
                        girdi_ekrani.getText().toString() == "-") {
                    girdi_ekrani.setText("");
                }
                girdi_ekrani.setText(girdi_ekrani.getText() + String.valueOf(s1));

            }

        });
        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = 3;
                if (girdi_ekrani.getText().toString() == "0") {
                    girdi_ekrani.setText("");
                } else if (girdi_ekrani.getText().toString() == "+" ||
                        girdi_ekrani.getText().toString() == "X" ||
                        girdi_ekrani.getText().toString() == "/" ||
                        girdi_ekrani.getText().toString() == "-") {
                    girdi_ekrani.setText("");
                }
                girdi_ekrani.setText(girdi_ekrani.getText() + String.valueOf(s1));

            }

        });
        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = 4;
                if (girdi_ekrani.getText().toString() == "0") {
                    girdi_ekrani.setText("");
                } else if (girdi_ekrani.getText().toString() == "+" ||
                        girdi_ekrani.getText().toString() == "X" ||
                        girdi_ekrani.getText().toString() == "/" ||
                        girdi_ekrani.getText().toString() == "-") {
                    girdi_ekrani.setText("");
                }
                girdi_ekrani.setText(girdi_ekrani.getText() + String.valueOf(s1));

            }

        });
        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = 5;
                if (girdi_ekrani.getText().toString() == "0") {
                    girdi_ekrani.setText("");
                } else if (girdi_ekrani.getText().toString() == "+" ||
                        girdi_ekrani.getText().toString() == "X" ||
                        girdi_ekrani.getText().toString() == "/" ||
                        girdi_ekrani.getText().toString() == "-") {
                    girdi_ekrani.setText("");
                }
                girdi_ekrani.setText(girdi_ekrani.getText() + String.valueOf(s1));

            }

        });
        buton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = 6;
                if (girdi_ekrani.getText().toString() == "0") {
                    girdi_ekrani.setText("");
                } else if (girdi_ekrani.getText().toString() == "+" ||
                        girdi_ekrani.getText().toString() == "X" ||
                        girdi_ekrani.getText().toString() == "/" ||
                        girdi_ekrani.getText().toString() == "-") {
                    girdi_ekrani.setText("");
                }
                girdi_ekrani.setText(girdi_ekrani.getText() + String.valueOf(s1));

            }

        });
        buton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = 7;
                if (girdi_ekrani.getText().toString() == "0") {
                    girdi_ekrani.setText("");
                } else if (girdi_ekrani.getText().toString() == "+" ||
                        girdi_ekrani.getText().toString() == "X" ||
                        girdi_ekrani.getText().toString() == "/" ||
                        girdi_ekrani.getText().toString() == "-") {
                    girdi_ekrani.setText("");
                }
                girdi_ekrani.setText(girdi_ekrani.getText() + String.valueOf(s1));

            }

        });
        buton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = 8;
                if (girdi_ekrani.getText().toString() == "0") {
                    girdi_ekrani.setText("");
                } else if (girdi_ekrani.getText().toString() == "+" ||
                        girdi_ekrani.getText().toString() == "X" ||
                        girdi_ekrani.getText().toString() == "/" ||
                        girdi_ekrani.getText().toString() == "-") {
                    girdi_ekrani.setText("");
                }
                girdi_ekrani.setText(girdi_ekrani.getText() + String.valueOf(s1));

            }

        });
        buton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1 = 9;
                if (girdi_ekrani.getText().toString() == "0") {
                    girdi_ekrani.setText("");
                } else if (girdi_ekrani.getText().toString() == "+" ||
                        girdi_ekrani.getText().toString() == "X" ||
                        girdi_ekrani.getText().toString() == "/" ||
                        girdi_ekrani.getText().toString() == "-") {
                    girdi_ekrani.setText("");
                }
                girdi_ekrani.setText(girdi_ekrani.getText() + String.valueOf(s1));

            }

        });
        toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int b = sonuç.getText().length();
                String c = sonuç.getText().toString();
                String d = c.substring(b - 1, b);
                if (d.equals("X") || d.equals("-") || d.equals("/")) {
                    String f = c.substring(0, b - 1);
                    sonuç.setText(f + "+");
                    girdi_ekrani.setText("0");
                } else {
                    String s1 = sonuç.getText().toString();
                    String l = girdi_ekrani.getText().toString();
                    if (l.equals("0")) {
                        sonuç.setText("0");
                    } else {
                        sonuç.setText(l + "+");
                        girdi_ekrani.setText("0");
                    }
                }
            }
        });
        çıkarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int b = sonuç.getText().length();
                String c = sonuç.getText().toString();
                String d = c.substring(b - 1, b);
                if (d.equals("X") || d.equals("+") || d.equals("/")) {
                    String f = c.substring(0, b - 1);
                    sonuç.setText(f + "-");
                    girdi_ekrani.setText("0");
                } else {
                    String s1 = sonuç.getText().toString();
                    String l = girdi_ekrani.getText().toString();
                    if (l.equals("0")) {
                        sonuç.setText("0");
                    } else {
                        sonuç.setText(l + "-");
                        girdi_ekrani.setText("0");
                    }
                }
            }
        });
        bölme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int b = sonuç.getText().length();
                String c = sonuç.getText().toString();
                String d = c.substring(b - 1, b);
                if (d.equals("X") || d.equals("-") || d.equals("+")) {
                    String f = c.substring(0, b - 1);
                    sonuç.setText(f + "/");
                    girdi_ekrani.setText("0");
                } else {
                    String s1 = sonuç.getText().toString();
                    String l = girdi_ekrani.getText().toString();
                    if (l.equals("0")) {
                        sonuç.setText("0");
                    } else {
                        sonuç.setText(l + "/");
                        girdi_ekrani.setText("0");
                    }
                }
            }
        });
        çarpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int b = sonuç.getText().length();
                String c = sonuç.getText().toString();
                String d = c.substring(b - 1, b);
                if (d.equals("+") || d.equals("-") || d.equals("/")) {
                    String f = c.substring(0, b - 1);
                    sonuç.setText(f + "X");
                    girdi_ekrani.setText("0");
                } else {
                    String s1 = sonuç.getText().toString();
                    String l = girdi_ekrani.getText().toString();
                    if (l.equals("0")) {
                        sonuç.setText("0");
                    } else {
                        sonuç.setText(l + "X");
                        girdi_ekrani.setText("0");
                    }
                }
            }
        });
        butontümsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (girdi_ekrani.getText().toString().equals("0")) {
                    girdi_ekrani.setText("0");
                    sonuç.setText("0");
                } else {
                    girdi_ekrani.setText("0");
                    sonuç.setText("0");
                }
            }
        });
        nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (girdi_ekrani.getText().toString() == "0") {
                    girdi_ekrani.setText("");
                } else if (
                        girdi_ekrani.getText().toString() == "+" ||
                                girdi_ekrani.getText().toString() == "X" ||
                                girdi_ekrani.getText().toString() == "÷" ||
                                girdi_ekrani.getText().toString() == "-") {
                    girdi_ekrani.setText("");
                }
                girdi_ekrani.setText(girdi_ekrani.getText() + ".");
            }
        });
        eşittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = sonuç.getText().length();
                String sembol = sonuç.getText().toString().substring(a - 1, a);
                if (sembol.equals("+")) {
                    int f = sonuç.getText().length();
                    String b = girdi_ekrani.getText().toString();
                    String c = sonuç.getText().toString().substring(0, f - 1);
                    double sayi1 = Double.parseDouble(b);
                    double sayi2 = Double.parseDouble(c);
                    double sonuc = sayi1 + sayi2;
                    String sonuc1 = String.valueOf(sonuc);
                    sonuç.setText(sonuc1 + "+");
                    girdi_ekrani.setText("0");
                } else if (sembol.equals("*")) {
                    int f = sonuç.getText().length();
                    String b = girdi_ekrani.getText().toString();
                    String c = sonuç.getText().toString().substring(0, f - 1);
                    double sayi1 = Double.parseDouble(b);
                    double sayi2 = Double.parseDouble(c);
                    double sonuc = sayi1 * sayi2;
                    String sonuc1 = String.valueOf(sonuc);
                    sonuç.setText(sonuc1 + "X");
                    girdi_ekrani.setText("0");
                } else if (sembol.equals("-")) {
                    int f = sonuç.getText().length();
                    String b = girdi_ekrani.getText().toString();
                    String c = sonuç.getText().toString().substring(0, f - 1);
                    double sayi1 = Double.parseDouble(b);
                    double sayi2 = Double.parseDouble(c);
                    double sonuc = sayi2 - sayi1;
                    String sonuc1 = String.valueOf(sonuc);
                    sonuç.setText(sonuc1 + "-");
                    girdi_ekrani.setText("0");
                } else if (sembol.equals("÷")) {
                    int f = sonuç.getText().length();
                    String b = girdi_ekrani.getText().toString();
                    String c = sonuç.getText().toString().substring(0, f - 1);
                    double sayi1 = Double.parseDouble(b);
                    double sayi2 = Double.parseDouble(c);
                    double sonuc = sayi2 / sayi1;
                    String sonuc1 = String.valueOf(sonuc);
                    sonuç.setText(sonuc1 + "÷");
                    girdi_ekrani.setText("0");
                } else if (sembol.equals("%")) {
                    int f = sonuç.getText().length();
                    String b = girdi_ekrani.getText().toString();
                    String c = sonuç.getText().toString().substring(0, f - 1);
                    double sayi1 = Double.parseDouble(b);
                    double sayi2 = Double.parseDouble(c);
                    double ara = sayi2 * sayi1;
                    double sonuc = ara / 100;
                    String sonuc1 = String.valueOf(sonuc);
                    sonuç.setText(sonuc1 + "%");
                    girdi_ekrani.setText("0");
                }
            }
        });
        butonsil.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a = girdi_ekrani.getText().length();
                String b =  girdi_ekrani.getText().toString();
                String c = b.substring(0,a-1);
                girdi_ekrani.setText(c);
            }
        });

    }




}