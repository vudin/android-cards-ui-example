package com.yasinyildirim.cardlayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.yasinyildirim.cardlayout.R;

public class CardLayoutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_layout);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.container, new CardLayoutFragment()).commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.card_layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(R.string.dialog_message).setTitle(R.string.app_name);
            builder.setPositiveButton(R.string.dialog_ok, null);
            builder.setIcon(R.drawable.ic_launcher);
            
            AlertDialog dialog = builder.create();
            dialog.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
