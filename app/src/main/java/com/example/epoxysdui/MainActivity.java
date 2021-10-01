package com.example.epoxysdui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.epoxysdui.models.Food;
import com.example.epoxysdui.models.FoodDataFactory;
import com.example.epoxysdui.viewmodel.SingleFoodController;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Food> foodItems;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        SingleFoodController singleFoodController = new SingleFoodController();


        // Request a model build whenever your data changes
//        singleFoodController.requestModelBuild();

        FoodDataFactory foodDataFactory = new FoodDataFactory();
        foodItems = foodDataFactory.getFoodItems(10);
        singleFoodController.setData(foodItems, true);
        recyclerView.setAdapter(singleFoodController.getAdapter());
    }
}