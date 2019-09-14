package com.example.customeviewmodel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import static android.view.Gravity.CENTER;

public class MyButton extends AppCompatButton {

    /*
    Describe string yang akan di gunakan pada tiap fungsi MyButton.java
    */
    private Drawable enabledBackground, disableBackground;
    private int textColor;


    // Konstruktor dari MyButton
    public MyButton(Context context) {
        super(context);
        init();
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    /*
    Fungsi onDraw : Metode onDraw() digunakan untuk mengcustom button ketika enable dan disable
    */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Mengubah background dari Button
        setBackground(isEnabled() ? enabledBackground : disableBackground);

        // Mengubah warna text pada button
        setTextColor(textColor);

        // Mengubah ukuran text pada button
        setTextSize(12.f);

        // Menjadikan object pada button menjadi center
        setGravity(CENTER);

        // Mengubah text pada button pada kondisi enable dan disable
        setText(isEnabled() ? "Submit" : "Isi Dulu");
    }

    /*
    Fungsi init : Fungsi untuk get source pada source bg_button , bg_button_disable & styles.xml
    */
    private void init() {
        textColor = ContextCompat.getColor(getContext(), android.R.color.background_light);
        enabledBackground = getResources().getDrawable(R.drawable.bg_button);
        disableBackground = getResources().getDrawable(R.drawable.bg_button_disable);
    }


}
