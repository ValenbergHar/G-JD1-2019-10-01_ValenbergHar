package em.kh.ua.uij.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import em.kh.ua.uij.R;

public class DialogRadio extends DialogFragment {

    private int selectedElement;
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(requireActivity());
        builder.setTitle(R.string.dialog_choice)
                .setSingleChoiceItems(R.array.fruit_array, 0,
                        new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                selectedElement = which;
                            }
                        })
                .setPositiveButton(R.string.dialog_ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(), "Ваш выбор: \n "
                                + getResources().getStringArray(R.array.fruit_array)[selectedElement],
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
