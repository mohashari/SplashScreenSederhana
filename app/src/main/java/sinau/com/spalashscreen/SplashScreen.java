package sinau.com.spalashscreen;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

    }
    public void onLoading(View v){
        final ProgressDialog proses = ProgressDialog.show(SplashScreen.this , "Loading", "Mohon menunggu....", true);
        new Thread(){
            public void run(){
                try {
                    Thread.sleep(5000);
                }catch (Exception e){}
                Intent intent = new Intent(SplashScreen.this, MenuActivity.class);
                proses.dismiss();
                SplashScreen.this.finish();
                startActivity(intent);
            }
        }.start();
    }

}
