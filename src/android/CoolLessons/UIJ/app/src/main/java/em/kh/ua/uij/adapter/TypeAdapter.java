package em.kh.ua.uij.adapter;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import em.kh.ua.uij.R;
import em.kh.ua.uij.activity.AutoCompleActivity;
import em.kh.ua.uij.activity.ButtonActivity;
import em.kh.ua.uij.activity.CheckActivity;
import em.kh.ua.uij.activity.ChipActivity;
import em.kh.ua.uij.activity.DateActivity;
import em.kh.ua.uij.activity.TextFieldActivity;
import em.kh.ua.uij.activity.TextFieldMultyActivity;
import em.kh.ua.uij.activity.FabExtActivity;
import em.kh.ua.uij.activity.MainActivity;
import em.kh.ua.uij.activity.MenuBaseActivity;
import em.kh.ua.uij.activity.MenuIconsActivity;
import em.kh.ua.uij.activity.MenuPopupActivity;
import em.kh.ua.uij.activity.MenuGroupActivity;
import em.kh.ua.uij.activity.RadioActivity;
import em.kh.ua.uij.activity.TimeActivity;
import em.kh.ua.uij.activity.SwitchActivity;
import em.kh.ua.uij.datepicker.DatePickerActivity;
import em.kh.ua.uij.fragments.DialogChoice;
import em.kh.ua.uij.fragments.DialogCustom;
import em.kh.ua.uij.fragments.DialogCustomChoice;
import em.kh.ua.uij.fragments.DialogIcon;
import em.kh.ua.uij.fragments.DialogInput;
import em.kh.ua.uij.fragments.DialogMultiple;
import em.kh.ua.uij.fragments.DialogOne;
import em.kh.ua.uij.fragments.DialogRadio;
import em.kh.ua.uij.fragments.DialogThree;
import em.kh.ua.uij.fragments.DialogTwo;
import em.kh.ua.uij.model.Type;
import em.kh.ua.uij.utilities.SnackBarFactory;
import em.kh.ua.uij.utilities.ToastFactory;

public class TypeAdapter extends RecyclerView.Adapter<TypeAdapter.ViewHolder> {

    // уникальное наименование тега, которое система использует для сохранения и восстановления
    // состояния фрагмента, когда это необходимо
    private static final String DIALOG_ONE_BUTTON = "DialogOneButton";
    private static final String DIALOG_TWO_BUTTON = "DialogTwoButton";
    private static final String DIALOG_THREE_BUTTON = "DialogThreeButton";
    private static final String DIALOG_ICON = "DialogIcon";
    private static final String DIALOG_INPUT = "DialogInput";
    private static final String DIALOG_CHOICE = "DialogChoice";
    private static final String DIALOG_RADIO = "DialogRadio";
    private static final String DIALOG_MULTIPLE = "DialogMultiple";
    private static final String DIALOG_CUSTOM = "DialogCustom";
    private static final String DIALOG_CUSTOM_CHOICE = "DialogCustomChoice";

    private List<Type> typeList;
    private Context context;

    public TypeAdapter(List<Type> typeList, Context context) {
        this.typeList = typeList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_type,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.itemType.setText(typeList.get(position).getType());

        holder.itemType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) v.getContext();
                switch (holder.getAdapterPosition()){
                    case 0:
                        context.startActivity(new Intent(context, ButtonActivity.class));
                        break;
                    case 1:
                        context.startActivity(new Intent(context, TextFieldActivity.class));
                        break;
                    case 2:
                        context.startActivity(new Intent(context, TextFieldMultyActivity.class));
                        break;
                    case 3:
                        context.startActivity(new Intent(context, CheckActivity.class));
                        break;
                    case 4:
                        context.startActivity(new Intent(context, RadioActivity.class));
                        break;
                    case 5:
                        context.startActivity(new Intent(context, FabExtActivity.class));
                        break;
                    case 6:
                        context.startActivity(new Intent(context, SwitchActivity.class));
                        break;
                    case 7:
                        context.startActivity(new Intent(context, DateActivity.class));
                        break;
                    case 8:
                        context.startActivity(new Intent(context, DatePickerActivity.class));
                        break;
                    case 9:
                        context.startActivity(new Intent(context, TimeActivity.class));
                        break;
                    case 10:
                        ToastFactory.showToastBasic(context);
                        break;
                    case 11:
                        ToastFactory.showToastBasicTopLeft(context);
                        break;
                    case 12:
                        ToastFactory.showToastBasicCenter(context);
                        break;
                    case 13:
                        ToastFactory.showToastCustom(context);
                        break;
                    case 14:
                        ToastFactory.showToastCustomized(context);
                        break;
                    case 15:
                        ToastFactory.showToastCustomPicture(context);
                        break;
                    case 16:
                        ToastFactory.showToastLibError(context);
                        break;
                    case 17:
                        ToastFactory.showToastLibSuccess(context);
                        break;
                    case 18:
                        SnackBarFactory.showSnackBarBasic(context);
                        break;
                    case 19:
                        SnackBarFactory.showSnackBarWithAction(context);
                        break;
                    case 20:
                        SnackBarFactory.showSnackBarCustom(context);
                        break;
                    case 21:
                        SnackBarFactory.showSnackBarLib(context);
                        break;
                    case 22:
                        SnackBarFactory.showSnackBarLibCustom(context);
                        break;
                    case 23:
                        DialogOne dialogOne = new DialogOne();
                        dialogOne.show(activity.getSupportFragmentManager(), DIALOG_ONE_BUTTON);
                        break;
                    case 24:
                        DialogTwo dialogTwo = new DialogTwo();
                        dialogTwo.show(activity.getSupportFragmentManager(), DIALOG_TWO_BUTTON);
                        break;
                    case 25:
                        DialogThree dialogThree = new DialogThree();
                        dialogThree.show(activity.getSupportFragmentManager(), DIALOG_THREE_BUTTON);
                        break;
                    case 26:
                        DialogIcon dialogIcon = new DialogIcon();
                        dialogIcon.show(activity.getSupportFragmentManager(), DIALOG_ICON);
                        break;
                    case 27:
                        DialogInput dialogInput = new DialogInput();
                        dialogInput.show(activity.getSupportFragmentManager(), DIALOG_INPUT);
                        break;
                    case 28:
                        DialogChoice dialogChoice = new DialogChoice();
                        dialogChoice.show(activity.getSupportFragmentManager(), DIALOG_CHOICE);
                        break;
                    case 29:
                        DialogRadio dialogRadio = new DialogRadio();
                        dialogRadio.show(activity.getSupportFragmentManager(), DIALOG_RADIO);
                        break;
                    case 30:
                        DialogMultiple dialogMultiple = new DialogMultiple();
                        dialogMultiple.show(activity.getSupportFragmentManager(), DIALOG_MULTIPLE);
                        break;
                    case 31:
                        DialogCustom dialogCustom = new DialogCustom();
                        dialogCustom.show(activity.getSupportFragmentManager(), DIALOG_CUSTOM);
                        break;
                    case 32:
                        DialogCustomChoice dialogCustomChoice = new DialogCustomChoice();
                        dialogCustomChoice.show(activity.getSupportFragmentManager(), DIALOG_CUSTOM_CHOICE);
                        break;
                    case 33:
                        context.startActivity(new Intent(context, MenuBaseActivity.class));
                        break;
                    case 34:
                        context.startActivity(new Intent(context, MenuIconsActivity.class));
                        break;
                    case 35:
                        context.startActivity(new Intent(context, MenuPopupActivity.class));
                        break;
                    case 36:
                        context.startActivity(new Intent(context, MenuGroupActivity.class));
                        break;
                    case 37:
                        context.startActivity(new Intent(context, AutoCompleActivity.class));
                        break;
                    case 38:
                        context.startActivity(new Intent(context, ChipActivity.class));
                        break;
                    default:
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return typeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView itemType;
        public ViewHolder(View itemView) {
            super(itemView);
            itemType = itemView.findViewById(R.id.item_type);
        }
    }
}
