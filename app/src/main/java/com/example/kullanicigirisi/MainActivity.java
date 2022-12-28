package com.example.kullanicigirisi;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kullanicigirisi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
        private ActivityMainBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                binding = ActivityMainBinding.inflate(getLayoutInflater());
                View view = binding.getRoot();
                setContentView(view);
        }

        public void kullaniciGirisi(View view) {
                String kullaniciAdi = binding.editTextTextKullaniciAdi.getText().toString();
                String parola = binding.editTextTextKullaniciParola.getText().toString();
//Singletoon tanımlama ve değer atamaları
                Singleton singleton = Singleton.getInstance();
                singleton.setKullaniciAdi(kullaniciAdi);
                singleton.setKullaniciParola(parola);
//Diğer Activity’ye geçiş
                Intent intent = new Intent(this, AnaSayfa.class);
                startActivity(intent);
        }
}