package test.supradip.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    EditText vikalp1,vikalp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.tb_main);
        setSupportActionBar(toolbar);

        vikalp1 = findViewById(R.id.et_v1);
        vikalp1.setBackgroundResource(R.drawable.et_states);
        vikalp2 = findViewById(R.id.et_v2);
        vikalp2.setBackgroundResource(R.drawable.et_states);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.add_poll_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.action_add_poll:
                Toast.makeText(this, "Post this Poll!!", Toast.LENGTH_SHORT)
                        .show();
                break;

            case R.id.homeAsUp:
                finish();
                break;

            default:
                break;
        }

        return true;
    }
}
