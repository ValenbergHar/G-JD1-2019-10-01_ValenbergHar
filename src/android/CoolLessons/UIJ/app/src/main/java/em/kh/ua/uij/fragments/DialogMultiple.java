package em.kh.ua.uij.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;

import em.kh.ua.uij.R;

public class DialogMultiple extends DialogFragment {
    private ArrayList<Integer> selectedElements;
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        selectedElements = new ArrayList<>();  // элементы для выбора
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(requireActivity());
        builder.setTitle(R.string.dialog_choice)
                // Определяем список для выбора и слушатель выбора
                .setMultiChoiceItems(R.array.fruit_array, null,
                        new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which,
                                                boolean isChecked) {
                                if (isChecked) {
                                    // выбранный элемент добавляем в набор выбора
                                    selectedElements.add(which);
                                } else if (selectedElements.contains(which)) {
                                    // удаляем выбранный элемент из набора выбора
                                    selectedElements.remove(Integer.valueOf(which));
                                }
                            }
                        })
                .setPositiveButton(R.string.dialog_ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // сохранения выбора после нажатия кнопки
                        StringBuilder stringBuilder = new StringBuilder();
                        for(int i:selectedElements){
                            stringBuilder.append(getResources().getStringArray(R.array.fruit_array)[i]);
                            stringBuilder.append("\n");
                        }
                        Toast.makeText(requireActivity(), "Ваш выбор:\n"+stringBuilder,
                                Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(), R.string.toast_no_choice, Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }
}
