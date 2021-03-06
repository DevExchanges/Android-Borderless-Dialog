package info.devexchanges.borderlessdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn_dialog);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BorderlessDialogFragment dFragment = new BorderlessDialogFragment();

                dFragment.setCancelable(false); //don't close when touch outside
                dFragment.show(getSupportFragmentManager(), "Dialog Fragment");
            }
        });
    }
}
