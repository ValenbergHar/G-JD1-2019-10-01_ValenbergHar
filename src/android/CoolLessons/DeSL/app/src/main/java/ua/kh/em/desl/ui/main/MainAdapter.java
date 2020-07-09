package ua.kh.em.desl.ui.main;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import ua.kh.em.desl.R;
import ua.kh.em.desl.model.Main;
import ua.kh.em.desl.ui.bottomappbar.BottomAppbarActivity;
import ua.kh.em.desl.ui.bottomnav.BottomNavActivity;
import ua.kh.em.desl.ui.bottomnav.BottomNavExtraActivity;
import ua.kh.em.desl.ui.bottomsheet.BottomSheetActivity;
import ua.kh.em.desl.ui.collaps.CollapsActivity;
import ua.kh.em.desl.ui.collaps.CollapsFabActivity;
import ua.kh.em.desl.ui.navview.NavActivity;
import ua.kh.em.desl.ui.snackbar.SnackBarActivity;
import ua.kh.em.desl.ui.tabs.TabActivity;
import ua.kh.em.desl.ui.tabs.TabExtraActivity;
import ua.kh.em.desl.ui.textinput.TextInputActivity;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder>{

    private List<Main> modes;
    private Context context;

    public MainAdapter(List<Main> modes, Context context){
        this.context = context;
        this.modes = modes;
    }

    @NonNull
    @Override
    public MainAdapter.MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_main,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MainAdapter.MainViewHolder holder, final int position) {
        if (holder.modeItem != null) {
            holder.modeItem.setText(modes.get(position).getMode());
        }
        assert holder.modeItem != null;
        holder.modeItem.setOnClickListener(view -> {
            switch (holder.getAdapterPosition()){
                case 0:
                    Toast.makeText(context,modes.get(position).getMode(),
                            Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    context.startActivity(new Intent(context, TabActivity.class));
                    break;
                case 2:
                    context.startActivity(new Intent(context, TabExtraActivity.class));
                    break;
                case 3:
                    context.startActivity(new Intent(context, NavActivity.class));
                    break;
                case 4:
                    context.startActivity(new Intent(context, SnackBarActivity.class));
                    break;
                case 5:
                    context.startActivity(new Intent(context, TextInputActivity.class));
                    break;
                case 6:
                    context.startActivity(new Intent(context, CollapsActivity.class));
                    break;
                case 7:
                    context.startActivity(new Intent(context, CollapsFabActivity.class));
                    break;
                case 8:
                    context.startActivity(new Intent(context, BottomSheetActivity.class));
                    break;
                case 9:
                    context.startActivity(new Intent(context, BottomNavActivity.class));
                    break;
                case 10:
                    context.startActivity(new Intent(context, BottomNavExtraActivity.class));
                    break;
                case 11:
                    context.startActivity(new Intent(context, BottomAppbarActivity.class));
                    break;
                default:
                    Toast.makeText(context,modes.get(position).getMode(),
                            Toast.LENGTH_SHORT).show();
                    break;
            }
        });
    }

    @Override
    public int getItemCount() {
        return modes.size();
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder {
        @Nullable
        @BindView(R.id.mode_item) TextView modeItem;
        public MainViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
