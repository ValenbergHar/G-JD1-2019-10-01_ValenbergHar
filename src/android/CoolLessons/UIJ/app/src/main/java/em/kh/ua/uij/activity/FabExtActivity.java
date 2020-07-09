package em.kh.ua.uij.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import em.kh.ua.uij.R;
import em.kh.ua.uij.adapter.ProductAdapter;
import em.kh.ua.uij.model.Type;
import em.kh.ua.uij.utilities.SnackBarFactory;

public class FabExtActivity extends AppCompatActivity {

    final Context context = this;
    RecyclerView recyclerView;
    String[] typez;
    List<Type> listTypes;
    ExtendedFloatingActionButton fab;
    CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab_ext);

        initViews();
        setupRecyclerView();
        setupFab();
    }

    private void initViews(){
        coordinatorLayout = findViewById(R.id.coordinator_layout_1);
    }

    private void setupRecyclerView(){
        recyclerView = findViewById(R.id.rv_list);
        typez = getResources().getStringArray(R.array.product_array);
        listTypes = new ArrayList<>();

        for (String typss : typez){
            Type typzz = new Type(typss);
            listTypes.add(typzz);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        // разделитель элементов RecyclerView
        RecyclerView.ItemDecoration dividerItemDecoration =
                new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        ProductAdapter adapter = new ProductAdapter(listTypes);
        recyclerView.setAdapter(adapter);
    }

    private void setupFab(){
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SnackBarFactory.showSnackBarBasic1(context);
            }
        });
    }
}
