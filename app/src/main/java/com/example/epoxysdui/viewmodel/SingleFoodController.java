package com.example.epoxysdui.viewmodel;

import com.airbnb.epoxy.AutoModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.airbnb.epoxy.TypedEpoxyController;
import com.example.epoxysdui.models.Food;
import com.example.epoxysdui.models.FoodDataFactory;
import com.example.epoxysdui.models.epoxy.SingleFoodModel_;

import java.util.List;

public class SingleFoodController extends Typed2EpoxyController<List<Food>, Boolean> {
    @AutoModel
    SingleFoodModel_ singleFoodModel;

    @Override
    protected void buildModels(List<Food> data, Boolean bool) {

        for (int i = 0; i < data.size(); i++) {
            Food food = data.get(i);
            new SingleFoodModel_().id(i).title(food.getTitle()).desc(food.getDescription()).image(food.getImage()).addTo(this);
        }
    }
}
