package em.kh.ua.uij.utilities;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import em.kh.ua.uij.R;
import es.dmoral.toasty.Toasty;

public class ToastFactory {

    public static void showToastBasic(final Context context){
        Toast.makeText(context, R.string.toast_basic, Toast.LENGTH_SHORT).show();
    }

    public static void showToastBasicTopLeft(final Context context){
        Toast toast = Toast.makeText(context, R.string.toast_basic, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.START, 0, 0);
        toast.show();
    }

    public static void showToastBasicCenter(final Context context){
        Toast toast = Toast.makeText(context, R.string.toast_basic, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

    public static void showToastCustom(final Context context){
        final ViewGroup parent = null;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.toast_custom_a, parent, false);
        Toast customToast = new Toast(context);
        customToast.setView(view);
        customToast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
        customToast.setDuration(Toast.LENGTH_LONG);
        customToast.show();
    }

    public static void showToastCustomized(final Context context){
        final ViewGroup parent = null;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.toast_custom_b, parent, false);
        Toast customToast = new Toast(context);
        customToast.setView(view);
        customToast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
        customToast.setDuration(Toast.LENGTH_SHORT);
        customToast.show();
    }

    public static void showToastCustomPicture(final Context context){
        final ViewGroup parent = null;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.toast_custom_c, parent, false);
        Toast customToast = new Toast(context);
        customToast.setView(view);
        customToast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
        customToast.setDuration(Toast.LENGTH_SHORT);
        customToast.show();
    }

    public static void showToastLibError(final Context context){
        Toasty.error(context, "Какая-то ошибка!", Toast.LENGTH_SHORT, true).show();
    }

    public static void showToastLibSuccess(final Context context){
        Toasty.success(context, "Полный успех!", Toast.LENGTH_SHORT, true).show();
    }



}
