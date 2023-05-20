package com.example.cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    List<Car> cars = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list_car);
        CarAdapter adapter = new CarAdapter(this, cars);
        recyclerView.setAdapter(adapter);





    }
    private void setInitialData() {
        cars.add(new Car("BMW", "7 марта 1916г", "производитель автомобилей премиум-класса с ориентацией на динамичность и инновации;", R.drawable.img_4 ));
        cars.add(new Car("Mercedes","1926г","производитель автомобилей премиум-класса с ориентацией на комфорт и надежность", R.drawable.img_5 ));
        cars.add(new Car("Masserati", "1 декабря 1914г", "производитель автомобилей премиум-класса с ориентацией на дизайн и производительность", R.drawable.img_7));
        cars.add(new Car("Audi", "16 июля 1909г", "производитель автомобилей премиум-класса с ориентацией на технологии и инновации", R.drawable.img_8));
        cars.add(new Car("Renault", "25 февраля 1899г", "массовый производитель автомобилей с ориентацией на бюджетный сегмент", R.drawable.img_6));
        cars.add(new Car("Mazda", "30 января 1920г", "массовый производитель автомобилей с ориентацией на качество и экономичность", R.drawable.img_9));
        cars.add(new Car("Lamborghini", "30 октября 1963", "производитель спортивных автомобилей премиум-класса с ориентацией на экстремальную производительность и дизайн.", R.drawable.img_10));
    }



}