package com.example.epoxysdui.models.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.example.epoxysdui.R;

import androidx.annotation.DrawableRes;


/**
 * This class needs to be abstract as Epoxy inherits this class to form SingleFoodModel_() class.
 * Also this is one of the ways a Epoxy model can be written.
 * For more visit:
 * https://github.com/airbnb/epoxy/wiki/Epoxy-Models
 */
@EpoxyModelClass(layout = R.layout.singlefood_layout)
public abstract class SingleFoodModel extends EpoxyModelWithHolder<SingleFoodModel.FoodHolder> {

    @EpoxyAttribute
    @DrawableRes
    int image;

    @EpoxyAttribute
    String title;

    @EpoxyAttribute
    String desc;

    @Override
    public void bind(FoodHolder holder) {
        super.bind(holder);
        holder.imageView.setImageResource(image);
        holder.titleView.setText(title);
        holder.descView.setText(desc);
    }

    static class FoodHolder extends EpoxyHolder {
        ImageView imageView;
        TextView titleView;
        TextView descView;

        protected void bindView(View view) {
            descView = view.findViewById(R.id.desc);
            imageView = view.findViewById(R.id.image);
            titleView = view.findViewById(R.id.title);

        }

    }
}
