package em.kh.ua.uij.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import em.kh.ua.uij.R;

public class DialogCustom extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(requireActivity(),
                R.style.CustomDialogSimple);
        builder.setTitle(R.string.dialog_title)
                .setMessage(R.string.dialog_two_text)
                .setPositiveButton(R.string.dialog_ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(requireActivity(),R.string.toast_confirm,Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(requireActivity(),R.string.toast_cancel, Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }
}
