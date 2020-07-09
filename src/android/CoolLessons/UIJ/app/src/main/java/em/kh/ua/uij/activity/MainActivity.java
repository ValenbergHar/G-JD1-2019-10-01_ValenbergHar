package em.kh.ua.uij.activity;

import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import em.kh.ua.uij.R;
import em.kh.ua.uij.adapter.TypeAdapter;
import em.kh.ua.uij.model.Type;
import em.kh.ua.uij.utilities.SnackBarFactory;

public class MainActivity extends AppCompatActivity {

    final Context context = this;
    RecyclerView recyclerView;
    String[] typez;
    List<Type> listTypes;
    FloatingActionButton fab;
    CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupRecyclerView();
        setupFab();
    }

    private void initViews(){
        coordinatorLayout = findViewById(R.id.coordinator_layout);
    }

    private void setupRecyclerView(){
        recyclerView = findViewById(R.id.type_list);
        typez = getResources().getStringArray(R.array.types);
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
        TypeAdapter adapter = new TypeAdapter(listTypes,context);
        recyclerView.setAdapter(adapter);
    }

    private void setupFab(){
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SnackBarFactory.showSnackBarBasic(context);
            }
        });
    }
}
