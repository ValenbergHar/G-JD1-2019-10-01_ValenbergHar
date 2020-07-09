package em.kh.ua.uij.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import em.kh.ua.uij.R;

public class DialogThree extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(requireActivity());
        builder.setTitle(R.string.dialog_title)
                .setMessage(R.string.dialog_three_text)
                .setPositiveButton(R.string.dialog_ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(),R.string.toast_ok,Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(),R.string.toast_cancel,Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton(R.string.dialog_latter, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(),R.string.toast_latter,Toast.LENGTH_SHORT).show();
                    }
                });

        return builder.create();
    }
}