package ua.kh.em.desl.ui.tabs;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ua.kh.em.desl.R;

// ViewHolder описывает представление элемента и метаданные о его месте в RecyclerView.
// Предоставляет ссылку на представления для каждого элемента данных.
class ViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.cardView) CardView cardView;
    @BindView(R.id.station_name) TextView station_Name;
    @BindView(R.id.station_icon) ImageView station_Icon;

    ViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}