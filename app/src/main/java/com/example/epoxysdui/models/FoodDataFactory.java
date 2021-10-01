package com.example.epoxysdui.models;

import com.example.epoxysdui.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FoodDataFactory {

    Random random = new Random();
    String[] titles = new String[]{"Nachos", "Fries", "Cheese Balls", "Pizza"};

    private String randomTitle() {
        int titleId = random.nextInt(4);
        return titles[titleId];
    }

    private int randomPicture() {
        int grid = random.nextInt(7);

        switch (grid) {
            case 0:
                return R.drawable.nachos1;
            case 1:
                return R.drawable.nachos2;
            case 2:
                return R.drawable.nachos3;
            case 3:
                return R.drawable.nachos4;
            case 4:
                return R.drawable.nachos5;
            case 5:
                return R.drawable.nachos6;
            case 6:
                return R.drawable.nachos7;
            default:
                return R.drawable.nachos8;
        }
    }

    public List<Food> getFoodItems(int count) {
        List foodItems = new ArrayList<Food>();
        int i = 0;
        while (i < count) {
            int image = randomPicture();
            String title = randomTitle();
            String desc = "   Nachos is a dish from northern Mexico that\n" +
                    "        consists of tortilla chips covered with mince and cheese.";
            foodItems.add(new Food(image, title, desc));
            i++;
        }
        return foodItems;
    }


}
