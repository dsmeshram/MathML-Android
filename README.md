# MathML-Android

Synopsis

Math-ML support tiny lib for Android

Code Example

package to.hurix.com.letx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private LETXViewer view;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (LETXViewer)findViewById(R.id.letxView);
        view.loadLETX("\\[\\frac{{7.0\\, \\times \\,{{10}^6}}}{{3.5\\, \\times \\,{{10}^3}}} = \\frac{{7.0\\, \\times \\,10\\, \\times \\,10\\, \\times \\,10\\, \\times \\,\\rlap{-}1 \\rlap{-}0\\, \\times \\,\\rlap{-}1 \\rlap{-}0\\, \\times \\,\\rlap{-}1 \\rlap{-}0}}{{3.5\\, \\times \\,\\rlap{-}1 \\rlap{-}0\\, \\times \\,\\rlap{-}1 \\rlap{-}0 \\times \\,\\rlap{-}1 \\rlap{-}0}}\\]");
    }
}


Motivation:

API Reference:
letx.html

dependency :
http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML

Tests:
case 1:"("\\[\\frac{{7.0\\, \\times \\,{{10}^6}}}{{3.5\\, \\times \\,{{10}^3}}} = \\frac{{7.0\\, \\times \\,10\\, \\times \\,10\\, \\times \\,10\\, \\times \\,\\rlap{-}1 \\rlap{-}0\\, \\times \\,\\rlap{-}1 \\rlap{-}0\\, \\times \\,\\rlap{-}1 \\rlap{-}0}}{{3.5\\, \\times \\,\\rlap{-}1 \\rlap{-}0\\, \\times \\,\\rlap{-}1 \\rlap{-}0 \\times \\,\\rlap{-}1 \\rlap{-}0}}\\]"

Contributors:
me only

License:
MIT
