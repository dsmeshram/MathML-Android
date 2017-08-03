package to.hurix.com.letx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private LETXViewer view;
    private EditText letxEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (LETXViewer)findViewById(R.id.letxView);

        letxEdit  =(EditText)findViewById(R.id.editText);

        letxEdit.setText("\\[\\frac{{7.0\\, \\times \\,{{10}^6}}}{{3.5\\, \\times \\,{{10}^3}}} = \\frac{{7.0\\, \\times \\,10\\, \\times \\,10\\, \\times \\,10\\, \\times \\,\\rlap{-}1 \\rlap{-}0\\, \\times \\,\\rlap{-}1 \\rlap{-}0\\, \\times \\,\\rlap{-}1 \\rlap{-}0}}{{3.5\\, \\times \\,\\rlap{-}1 \\rlap{-}0\\, \\times \\,\\rlap{-}1 \\rlap{-}0 \\times \\,\\rlap{-}1 \\rlap{-}0}}\\]");
        view.loadLETX("\\[\\frac{{7.0\\, \\times \\,{{10}^6}}}{{3.5\\, \\times \\,{{10}^3}}} = \\frac{{7.0\\, \\times \\,10\\, \\times \\,10\\, \\times \\,10\\, \\times \\,\\rlap{-}1 \\rlap{-}0\\, \\times \\,\\rlap{-}1 \\rlap{-}0\\, \\times \\,\\rlap{-}1 \\rlap{-}0}}{{3.5\\, \\times \\,\\rlap{-}1 \\rlap{-}0\\, \\times \\,\\rlap{-}1 \\rlap{-}0 \\times \\,\\rlap{-}1 \\rlap{-}0}}\\]");

        letxEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                view.loadLETX(editable.toString());

            }
        });
    }
}
