package to.hurix.com.letx;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by damodhar.meshram on 8/1/2017.
 */

public class LETXViewer extends WebView{

    private String mLetXData;
    public LETXViewer(Context context) {
        super(context);
        webViewSetting();
    }

    public LETXViewer(Context context, AttributeSet attrs) {
        super(context, attrs);
        webViewSetting();
    }

    private void webViewSetting(){
        this.getSettings().setJavaScriptEnabled(true);
        this.getSettings().setUseWideViewPort(true);
        this.getSettings().setLoadWithOverviewMode(true);
        this.getSettings().setDefaultFontSize(50);
        this.setPadding(0, 0, 0, 0);
        this.setInitialScale(1);
    }

    public void loadLETX(String letx){
        this.mLetXData =  letx;
        String updateddata = replaceLETXDATA(letx);
        this.loadDataWithBaseURL("file:///android_asset/",updateddata,"text/html", "UTF-8", null);
    }

    private String replaceLETXDATA(String letxdata){
        String maindata;
        maindata = convertStreamToString();
        if(maindata ==null){
            maindata ="NOT FOUND";
        }
        maindata = maindata.replace("LETXDATA",letxdata);
        return maindata;

    }

    private   String convertStreamToString() {
        StringBuilder returnString = new StringBuilder();
        InputStream fIn = null;
        InputStreamReader isr = null;
        BufferedReader input = null;
        try {
            fIn = getResources().getAssets()
                    .open("letx.html", Context.MODE_WORLD_READABLE);
            isr = new InputStreamReader(fIn);
            input = new BufferedReader(isr);
            String line = "";
            while ((line = input.readLine()) != null) {
                returnString.append(line);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (isr != null)
                    isr.close();
                if (fIn != null)
                    fIn.close();
                if (input != null)
                    input.close();
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return returnString.toString();
    }
}
