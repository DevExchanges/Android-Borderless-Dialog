package info.devexchanges.borderlessdialog;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class BorderlessDialogFragment extends DialogFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_dialog, container);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView btnPlus = (ImageView)view.findViewById(R.id.btn_plus);
        ImageView btnOK = (ImageView)view.findViewById(R.id.btn_ok);
        ImageView btnClose = (ImageView)view.findViewById(R.id.btn_close);

        btnOK.setOnClickListener(onClickListener("Button OK clicked!"));
        btnPlus.setOnClickListener(onClickListener("Button Plus Clicked!"));
        btnClose.setOnClickListener(onCloseClickListener());
    }

    private View.OnClickListener onCloseClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BorderlessDialogFragment.this.dismiss();
            }
        };
    }

    private View.OnClickListener onClickListener(final String msg) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
            }
        };
    }
}
