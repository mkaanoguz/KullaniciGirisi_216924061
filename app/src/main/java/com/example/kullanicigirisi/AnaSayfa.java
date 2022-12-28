package com.example.kullanicigirisi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.kullanicigirisi.databinding.ActivityAnaSayfaBinding;

public class AnaSayfa extends AppCompatActivity {

    private ActivityAnaSayfaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAnaSayfaBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        String kullaniciAdi = Singleton.getInstance().getKullaniciAdi();
        String parola = Singleton.getInstance().getKullaniciParola();
        binding.textViewKullaniciAdi.setText(kullaniciAdi);
        binding.textViewKullaniciSifresi.setText(parola);
    }
}