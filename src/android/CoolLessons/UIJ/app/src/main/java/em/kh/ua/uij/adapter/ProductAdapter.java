package em.kh.ua.uij.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import em.kh.ua.uij.R;
import em.kh.ua.uij.model.Type;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private List<Type> typeList;

    public ProductAdapter(List<Type> typeList) {
        this.typeList = typeList;
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_type,parent,false);
        return new ProductAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolder holder, int position) {
        holder.itemType.setText(typeList.get(position).getType());
    }

    @Override
    public int getItemCount() {
        return typeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView itemType;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemType = itemView.findViewById(R.id.item_type);
        }
    }
}
