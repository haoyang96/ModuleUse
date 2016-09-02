package com.example.moduleuse;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
        Button bn,RadioBn1,RadioBn2;
        EditText show;
        TextView show3;
        CheckBox checkBox1,checkBox2;


    //RadioGroup radioGroup=(RadioGroup) findViewById(R.id.rdbGp1);

        @Override
        public void onCreate(Bundle savedInstanceState)	{
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_main);

            show = (EditText) findViewById(R.id.textView);
            //show2=(TextView) findViewById(R.id.textView2) ;
            show3=(TextView) findViewById(R.id.textView3);

            bn = (Button) findViewById(R.id.button);
            RadioBn1=(Button) findViewById(R.id.radioButton);
            RadioBn2=(Button) findViewById(R.id.radioButton2);
            checkBox1=(CheckBox) findViewById(R.id.checkBox);
            checkBox2=(CheckBox) findViewById(R.id.checkBox2);

            // 直接使用Activity作为事件监听器
            bn.setOnClickListener(new View.OnClickListener()		{
                // 实现事件处理方法
                public void onClick(View v)			{
                    show.setText("  button按钮被单击了！");
                }
            });

            RadioBn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show3.setText(RadioBn1.getText());
                }
            });

            RadioBn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show3.setText(RadioBn2.getText());
                }
            });


            checkBox1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView show2;
                    show2=(TextView)findViewById(R.id.textView2);
                    show2.setText(checkBox1.getText());
                }
            });

                checkBox2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView show2;
                        show2=(TextView)findViewById(R.id.textView2);
                        show2.setText(checkBox2.getText());
                    }
                });

        }


}
