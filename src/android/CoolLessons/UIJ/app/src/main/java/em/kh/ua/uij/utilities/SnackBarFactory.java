package em.kh.ua.uij.utilities;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import com.google.android.material.snackbar.Snackbar;
import android.view.View;

import de.mateware.snacky.Snacky;
import em.kh.ua.uij.R;


public class SnackBarFactory {

    public static void showSnackBarSimple(final Context context){
        View baseView = ((Activity) context).getWindow().getDecorView().findViewById(android.R.id.content);
        View v = baseView.findViewById(R.id.btn_activity);

        Snackbar snackbar = Snackbar.make(v, R.string.snackbar_text_1,Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    public static void showSnackBarBasic(final Context context){
        View baseView = ((Activity) context).getWindow().getDecorView().findViewById(android.R.id.content);
        View v = baseView.findViewById(R.id.coordinator_layout);

        Snackbar snackbar = Snackbar.make(v, R.string.snackbar_text_1,Snackbar.LENGTH_LONG);
                snackbar.show();
    }

    public static void showSnackBarBasic1(final Context context){
        View baseView = ((Activity) context).getWindow().getDecorView().findViewById(android.R.id.content);
        View v = baseView.findViewById(R.id.coordinator_layout_1);

        Snackbar snackbar = Snackbar.make(v, R.string.snackbar_text_1,Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    public static void showSnackBarWithAction(final Context context){
        View baseView = ((Activity) context).getWindow().getDecorView().findViewById(android.R.id.content);
        final View v = baseView.findViewById(R.id.coordinator_layout);

        Snackbar snackbar = Snackbar.make(v,R.string.snackbar_text_2,Snackbar.LENGTH_LONG)
                .setAction(R.string.snackbar_text_3, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(v,R.string.snackbar_text_4,Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });
        snackbar.show();
    }

    public static void showSnackBarCustom(final Context context){
        View baseView = ((Activity) context).getWindow().getDecorView().findViewById(android.R.id.content);
        final View v = baseView.findViewById(R.id.coordinator_layout);

        Snackbar snackbar = Snackbar.make(v,R.string.snackbar_text_2,Snackbar.LENGTH_LONG)
                .setAction(R.string.snackbar_text_3, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(v,R.string.snackbar_text_4,Snackbar.LENGTH_SHORT);
                        snackbar1.getView().setBackgroundColor(Color.parseColor("#ff4081"));
                        snackbar1.show();
                    }
                }).setActionTextColor(Color.BLACK);
        snackbar.getView().setBackgroundColor(Color.parseColor("#f78d2e"));
        snackbar.show();
    }


    public static void showSnackBarLib(final Context context){
        View baseView = ((Activity) context).getWindow().getDecorView().findViewById(android.R.id.content);
        View v = baseView.findViewById(R.id.coordinator_layout);

        Snacky.builder()
                .setView(v)
                .setText("Snackbar библиотечный.")
                .setDuration(Snacky.LENGTH_SHORT)
                .build()
                .show();
    }

    public static void showSnackBarLibCustom(final Context context){
        View baseView = ((Activity) context).getWindow().getDecorView().findViewById(android.R.id.content);
        View v = baseView.findViewById(R.id.coordinator_layout);

        Snacky.builder()
                .setView(v)
                .setText("Полезная информация.")
                .centerText()
                .setDuration(Snacky.LENGTH_LONG)
                .info()
                .show();
    }

}
