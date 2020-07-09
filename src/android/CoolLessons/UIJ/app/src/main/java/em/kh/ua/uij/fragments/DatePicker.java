package em.kh.ua.uij.fragments;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

import em.kh.ua.uij.R;

public class DatePicker extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Используем текущую дату в качестве даты по умолчанию в DatePicker
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Новый экземпляр DatePickerDialog
        return new DatePickerDialog(requireActivity(), this, year, month, day);
    }

    @Override
    public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
        TextView tvDate = requireActivity().findViewById(R.id.tv_date);
        // январь = 0
        int monthNumber = month + 1;
        tvDate.setText(String.format(Locale.getDefault(),"%d.%d.%d", dayOfMonth, monthNumber, year));
    }
}
