package kalamtechcorp.thinkific.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view) {
        openUrl("https://kalamtechcorp.thinkific.com/cart/add_product/659426?price_id=699367");
    }

    public void demoButton(View view) {
        openUrl("https://kalamtechcorp.thinkific.com/enroll/659426?et=free_trial");
    }

    public void openUrl (String url){
        Uri uri = Uri.parse(url);
        Intent launchWeb = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(launchWeb);
    }
}
