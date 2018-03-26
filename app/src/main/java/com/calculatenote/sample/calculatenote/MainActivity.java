package com.calculatenote.sample.calculatenote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout mParent,mHeader;
    int total = 0;
    int Rupes2000 = 0, Rupes1000 = 0, Rupes500 = 0, Rupes200 = 0, Rupes100 = 0, Rupes50 = 0, Rupes20 = 0,
            Rupes10 = 0, Rupes5 = 0, Rupes1 = 0, Paise50 = 0, Paise25 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Reading the fields
        final EditText mAmount = findViewById(R.id.amount);
        Button mSubmit = findViewById(R.id.btnsubmit);
        mParent = (LinearLayout) findViewById(R.id.parent);
        mHeader = (LinearLayout) findViewById(R.id.header);


        //onclick for submit button
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strAmt = mAmount.getText().toString();
                if (!strAmt.trim().equals("")) {
                    mParent.removeAllViews();

                    if (strAmt.contains(".")) {
                        double number = Double.parseDouble(strAmt);
                        while (number >= 2000) {
                            Rupes2000 = (int) (number / 2000);
                            number = number % 2000;

                            if (Rupes2000 > 0) {
                                total = total + Rupes2000;
                                addRow("2000", Rupes2000 + "");
                            }
                            break;

                        }

                        while (number >= 1000) {
                            Rupes1000 = (int) (number / 1000);
                            number = number % 1000;

                            if (Rupes1000 > 0) {
                                total = total + Rupes1000;
                                addRow("1000", Rupes1000 + "");
                            }

                            break;
                        }
                        while (number >= 500) {
                            Rupes500 = (int) (number / 500);
                            number = number % 500;
                            if (Rupes500 > 0) {
                                total = total + Rupes500;
                                addRow("500", Rupes500 + "");
                            }
                            break;
                        }
                        while (number >= 200) {
                            Rupes200 = (int) (number / 200);
                            number = number % 200;
                            if (Rupes200 > 0) {
                                total = total + Rupes200;
                                addRow("200", Rupes200 + "");
                            }
                            break;
                        }
                        while (number >= 100) {
                            Rupes100 = (int) (number / 100);
                            number = number % 100;

                            if (Rupes100 > 0) {
                                total = total + Rupes100;
                                addRow("100", Rupes100 + "");
                            }

                            break;
                        }
                        while (number >= 50) {
                            Rupes50 = (int) (number / 50);
                            number = number % 50;
                            if (Rupes50 > 0) {
                                total = total + Rupes50;
                                addRow("50", Rupes50 + "");
                            }

                            break;
                        }

                        while (number >= 20) {
                            Rupes20 = (int) (number / 20);
                            number = number % 20;
                            if (Rupes20 > 0) {
                                total = total + Rupes2000;
                                addRow("20", Rupes20 + "");
                            }

                            break;
                        }

                        while (number >= 10) {
                            Rupes10 = (int) (number / 10);
                            number = number % 10;

                            if (Rupes10 > 0) {
                                total = total + Rupes10;
                                addRow("10", Rupes10 + "");
                            }

                            break;
                        }
                        while (number >= 5) {
                            Rupes5 = (int) (number / 5);
                            number = number % 5;

                            if (Rupes5 > 0) {
                                total = total + Rupes5;
                                addRow("5", Rupes5 + "");
                            }

                            break;
                        }
                        while (number >= 1) {
                            Rupes1 = (int) (number / 1);
                            number = number % 1;

                            if (Rupes1 > 0) {
                                total = total + Rupes1;
                                addRow("1", Rupes1 + "");
                            }
                            break;
                        }



                        while (number >= 0.50) {
                            Paise50 = (int) (number / 0.50);
                            number = number % 0.50;
                            if (Paise50 > 0) {
                                total = total + Paise50;
                                //addRow(0.500+"", Paise50+"");
                                addRow("0.50", Paise50 + "");
                            }

                            break;
                        }

                        while (number >= 0.25) {
                            Paise25 = (int) (number / 0.25);
                            number = number % 0.25;
                            if (Paise25 > 0) {
                                total = total + Paise25;
                                addRow("0.25", Paise25 + "");
                            }
                            break;
                        }

                        addFooter(total, mAmount.getText().toString());
                        mHeader.setVisibility(View.VISIBLE);

                    } else {
                        
                        int number = Integer.parseInt(strAmt);

                        while (number >= 2000) {
                            Rupes2000 = number / 2000;
                            number = number % 2000;
                            if (Rupes2000 > 0) {
                                total = total + Rupes2000;
                                addRow("2000", Rupes2000 + "");
                            }
                            break;
                        }

                        while (number >= 1000) {
                            Rupes1000 = number / 1000;
                            number = number % 1000;
                            if (Rupes1000 > 0) {
                                total = total + Rupes1000;
                                addRow("1000", Rupes1000 + "");
                            }
                            break;
                        }
                        while (number >= 500) {
                            Rupes500 = number / 500;
                            number = number % 500;

                            if (Rupes500 > 0) {
                                total = total + Rupes500;
                                addRow("500", Rupes500 + "");
                            }
                            break;
                        }
                        while (number >= 200) {
                            Rupes200 = number / 200;
                            number = number % 200;

                            if (Rupes200 > 0) {
                                total = total + Rupes200;
                                addRow("200", Rupes200 + "");
                            }

                            break;
                        }
                        while (number >= 100) {
                            Rupes100 = number / 100;
                            number = number % 100;
                            if (Rupes100 > 0) {
                                total = total + Rupes100;
                                addRow("100", Rupes100 + "");
                            }

                            break;
                        }
                        while (number >= 50) {
                            Rupes50 = number / 50;
                            number = number % 50;

                            if (Rupes50 > 0) {
                                total = total + Rupes50;
                                addRow("50", Rupes50 + "");
                            }

                            break;
                        }

                        while (number >= 20) {
                            Rupes20 = number / 20;
                            number = number % 20;

                            if (Rupes20 > 0) {
                                total = total + Rupes20;
                                addRow("20", Rupes20 + "");
                            }
                            break;
                        }

                        while (number >= 10) {
                            Rupes10 = number / 10;
                            number = number % 10;
                            if (Rupes10 > 0) {
                                total = total + Rupes10;
                                addRow("10", Rupes10 + "");
                            }
                            break;
                        }
                        while (number >= 5) {
                            Rupes5 = number / 5;
                            number = number % 5;

                            if (Rupes5 > 0) {
                                total = total + Rupes5;
                                addRow("5", Rupes5 + "");
                            }

                            break;
                        }
                        while (number >= 1) {
                            Rupes1 = number / 1;
                            number = number % 1;

                            if (Rupes1 > 0) {
                                total = total + Rupes1;
                                addRow("1", Rupes1 + "");
                            }

                            break;
                        }

                        addFooter(total, mAmount.getText().toString());
                        mHeader.setVisibility(View.VISIBLE);

                    }
                } else {
                    Toast.makeText(MainActivity.this, "Please enter amount", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    void addFooter(int total, String amount) {
        LinearLayout layout = new LinearLayout(MainActivity.this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout.setLayoutParams(params);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setWeightSum(7);
        layout.setPadding(5, 5, 5, 5);

        TextView txtrs = new TextView(MainActivity.this);
        LinearLayout.LayoutParams txtrsparams = new LinearLayout.LayoutParams
                (0, LinearLayout.LayoutParams.WRAP_CONTENT, 3);
        txtrs.setLayoutParams(txtrsparams);
        txtrs.setGravity(Gravity.RIGHT);
        txtrs.setText("Total   ");
        txtrs.setTextColor(getResources().getColor(R.color.colorwhite));


        TextView txtcount = new TextView(MainActivity.this);
        LinearLayout.LayoutParams txtcountparams = new LinearLayout.LayoutParams
                (0, LinearLayout.LayoutParams.WRAP_CONTENT, 2);
        txtcount.setLayoutParams(txtcountparams);
        txtcount.setText(total + "");
        txtcount.setTextColor(getResources().getColor(R.color.colorwhite));


        TextView txtCalculation = new TextView(MainActivity.this);
        LinearLayout.LayoutParams txtCalculationparams = new LinearLayout.LayoutParams
                (0, LinearLayout.LayoutParams.WRAP_CONTENT, 2);
        txtCalculation.setLayoutParams(txtCalculationparams);
        txtCalculation.setText(amount);
        txtCalculation.setTextColor(getResources().getColor(R.color.colorwhite));

        ImageView img = new ImageView(MainActivity.this);
        LinearLayout.LayoutParams imgparams = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, 1);
        img.setBackgroundColor(getResources().getColor(R.color.colorwhite));
        img.setLayoutParams(imgparams);

        layout.addView(txtrs);
        layout.addView(txtcount);
        layout.addView(txtCalculation);
        mParent.addView(layout);
        mParent.addView(img);
    }

    void addRow(String rs, String count) {
        LinearLayout layout = new LinearLayout(MainActivity.this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout.setLayoutParams(params);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setWeightSum(7);
        layout.setPadding(5, 5, 5, 5);

        TextView txtrs = new TextView(MainActivity.this);
        LinearLayout.LayoutParams txtrsparams = new LinearLayout.LayoutParams
                (0, LinearLayout.LayoutParams.WRAP_CONTENT, 3);
        txtrs.setLayoutParams(txtrsparams);
        txtrs.setText("Rs." + rs);
        txtrs.setTextColor(getResources().getColor(R.color.colorwhite));

        TextView txtcount = new TextView(MainActivity.this);
        LinearLayout.LayoutParams txtcountparams = new LinearLayout.LayoutParams
                (0, LinearLayout.LayoutParams.WRAP_CONTENT, 2);
        txtcount.setLayoutParams(txtcountparams);
        txtcount.setText(count + "");
        txtcount.setTextColor(getResources().getColor(R.color.colorwhite));

        TextView txtCalculation = new TextView(MainActivity.this);
        LinearLayout.LayoutParams txtCalculationparams = new LinearLayout.LayoutParams
                (0, LinearLayout.LayoutParams.WRAP_CONTENT, 2);
        txtCalculation.setLayoutParams(txtCalculationparams);
        txtCalculation.setText(rs + " * " + count);
        txtCalculation.setTextColor(getResources().getColor(R.color.colorwhite));

        ImageView img = new ImageView(MainActivity.this);
        LinearLayout.LayoutParams imgparams = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, 1);
        img.setBackgroundColor(getResources().getColor(R.color.colorwhite));
        img.setLayoutParams(imgparams);

        layout.addView(txtrs);
        layout.addView(txtcount);
        layout.addView(txtCalculation);
        mParent.addView(layout);
        mParent.addView(img);
    }

}
