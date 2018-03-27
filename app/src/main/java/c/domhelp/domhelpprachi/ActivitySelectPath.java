package c.domhelp.domhelpprachi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivitySelectPath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_path);
    }
    public void hire(View view){
        Intent intent=new Intent(this,ActivityLogReg.class);
        startActivity(intent);
    }
}
