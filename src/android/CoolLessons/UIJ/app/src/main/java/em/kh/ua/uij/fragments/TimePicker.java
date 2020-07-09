package em.kh.ua.uij.fragments;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

import em.kh.ua.uij.R;

public class TimePicker extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Используем текущее время в качестве значений по умолчанию для TimePicker
        final Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        // Новый экземпляр TimePickerDialog
        return new TimePickerDialog(requireActivity(), this, hour, minute,
                DateFormat.is24HourFormat(requireActivity()));
    }

    @Override
    public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
        TextView tvTime = requireActivity().findViewById(R.id.tv_time);
        tvTime.setText(String.format(Locale.getDefault(),"%d:%d", hourOfDay, minute));
    }
}
