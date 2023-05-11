package com.yardra.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<MushroomModel> mushroomModelList = new ArrayList<MushroomModel>();

    RecyclerView scroller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        setInitialData();
        scroller = (RecyclerView) findViewById(R.id.scrollthink);

        MushroomAdapter adapter = new MushroomAdapter(this, mushroomModelList);

        scroller.setAdapter(adapter);
    }

    private void setInitialData() {
        mushroomModelList.add(new MushroomModel(R.drawable.openok, "Опёнок", "Не ядовит", "Встречается часто" ));
        mushroomModelList.add(new MushroomModel(R.drawable.beliu, "Белый гриб", "Не ядовит", "Встречается часто"));
        mushroomModelList.add(new MushroomModel(R.drawable.lisichka, "Лисичка", "Не ядовит", "Встречается редко"));
        mushroomModelList.add(new MushroomModel(R.drawable.muxomor, "Мухомор", "", "Встречается редко"));
        mushroomModelList.add(new MushroomModel(R.drawable.podosinovik, "Подосиновик", "Не ядовит", "Встречается часто"));
        mushroomModelList.add(new MushroomModel(R.drawable.svinushka, "Свинушка", "", "Встречается редко"));
        mushroomModelList.add(new MushroomModel(R.drawable.podberez, "Подберёзовик", "Не ядовит", "Встречается часто"));

    }
}