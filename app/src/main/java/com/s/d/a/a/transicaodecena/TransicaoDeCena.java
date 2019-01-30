package com.s.d.a.a.transicaodecena;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.View;
import android.transition.TransitionInflater;

public class TransicaoDeCena extends AppCompatActivity {

    ViewGroup containerPrincipal;
    Scene cena1;
    Scene cena2;
    Transition mgrTransicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transicao_de_cena);

        containerPrincipal =
                (ViewGroup) findViewById(R.id.containerPrincipal);

        mgrTransicao = TransitionInflater.from(this)
                .inflateTransition(R.transition.transicao);

        cena1 = Scene.getSceneForLayout(containerPrincipal,
                R.layout.laycena1, this);

        cena2 = Scene.getSceneForLayout(containerPrincipal,
                R.layout.laycena2, this);

        cena1.enter();


    }

    public void goToCena2 (View view)
    {
        TransitionManager.go(cena2, mgrTransicao);
    }

    public void goToCena1 (View view)
    {
        TransitionManager.go(cena1, mgrTransicao);
    }
}
