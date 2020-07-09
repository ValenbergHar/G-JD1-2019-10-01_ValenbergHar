package em.kh.ua.uij.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import em.kh.ua.uij.R;

public class DialogInput extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        View view = LayoutInflater.from(requireActivity())
                .inflate(R.layout.dialog_login,(ViewGroup)null);

        final EditText login = view.findViewById(R.id.login);
        final EditText password = view.findViewById(R.id.password);

        return new MaterialAlertDialogBuilder(requireActivity())
            .setView(view)
            .setTitle(R.string.dialog_title)
            .setPositiveButton(R.string.dialog_ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    String getLogin = login.getText().toString();
                    String getPass = password.getText().toString();
                    if (getLogin.isEmpty() || getPass.isEmpty()){
                        Toast.makeText(requireActivity(), R.string.toast_empty, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(requireActivity(), R.string.toast_confirm, Toast.LENGTH_SHORT).show();
                    }
                }
            })
        .create();
    }
}
