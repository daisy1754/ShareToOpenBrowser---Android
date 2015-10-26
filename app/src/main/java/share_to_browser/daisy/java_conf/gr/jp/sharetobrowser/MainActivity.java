package share_to_browser.daisy.java_conf.gr.jp.sharetobrowser;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String url = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        Log.d(MainActivity.class.getSimpleName(), "Opening " + url + "...");
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
        finish();
    }
}
