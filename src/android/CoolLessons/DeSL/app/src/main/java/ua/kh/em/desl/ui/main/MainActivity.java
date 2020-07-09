package ua.kh.em.desl.ui.main;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ua.kh.em.desl.R;
import ua.kh.em.desl.model.Main;


public class MainActivity extends AppCompatActivity {

    final Context context = this;
    private String [] modez;
    private List<Main> mainList;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.main_list)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        modez = getResources().getStringArray(R.array.modes);
        mainList = new ArrayList<>();

        for (String mode : modez){
            Main main = new Main(mode);
            mainList.add(main);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(linearLayoutManager);

        // Линия разделитель между RecyclerView элементами
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(itemDecoration);

        MainAdapter adapter = new MainAdapter(mainList,context);
        recyclerView.setAdapter(adapter);

    }

    @OnClick(R.id.fab) void fabClick(){
        Toast.makeText(context,"FAB clicked!",Toast.LENGTH_SHORT).show();
    }
}
