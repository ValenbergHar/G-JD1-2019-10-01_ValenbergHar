package em.kh.ua.uij.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import em.kh.ua.uij.R;

public class AutoCompleActivity extends AppCompatActivity {

    String[] products = {"Абрикос", "Ананас", "Хлеб", "Молоко", "Крупа гречневая", "Колбаса",
            "Крем", "Красное вино", "Печенье", "Сыр", "Сметана", "Яблоко", "Apples", "Apricot",
            "Banana", "Bread", "Cheese", "Milk"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_comple);

        // Получаем ссылку на элемент AutoCompleteTextView в разметке
        AutoCompleteTextView acOne = findViewById(R.id.ac_one);
        // Создаем адаптер для автозаполнения элемента AutoCompleteTextView
        ArrayAdapter<String> adapterOne = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, products);
        acOne.setAdapter(adapterOne);

        AutoCompleteTextView acTwo = findViewById(R.id.ac_two);
        ArrayAdapter<String> adapterTwo = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, products);
        acTwo.setAdapter(adapterTwo);

    }
}
