package co.mobilemakers.zooanimals;

import android.app.Activity;
import android.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().
                add(R.id.frame_main, new StartFragment()).addToBackStack(null).commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        switch (v.getId()){
            case (R.id.button_start):
                fragmentManager.beginTransaction().
                        replace(R.id.frame_main, new BrownBearFragment()).addToBackStack(null).commit();
                break;
            case (R.id.button_brown_bear_description):
                fragmentManager.beginTransaction().
                        replace(R.id.frame_main, new BrownBearInfoFragment()).addToBackStack(null).commit();
                break;
            case (R.id.button_brown_bear_next):
                fragmentManager.beginTransaction().
                        replace(R.id.frame_main, new GrizzlyBearFragment()).addToBackStack(null).commit();
                break;
            case (R.id.button_grizzly_bear_description):
                fragmentManager.beginTransaction().
                        replace(R.id.frame_main, new GrizzlyBearFragmentInfo()).addToBackStack(null).commit();
                break;
            case (R.id.button_grizzly_bear_next):
                fragmentManager.beginTransaction().
                        replace(R.id.frame_main, new WombatFragment()).addToBackStack(null).commit();
                break;
            case (R.id.button_wombat_description):
                fragmentManager.beginTransaction().
                        replace(R.id.frame_main, new WombatInfoFragment()).addToBackStack(null).commit();
                break;
            case (R.id.button_wombat_next):
                fragmentManager.beginTransaction().
                        replace(R.id.frame_main, new GeckoFragment()).addToBackStack(null).commit();
                break;
            case (R.id.button_gecko_description):
                fragmentManager.beginTransaction().
                        replace(R.id.frame_main, new GeckoInfoFragment()).addToBackStack(null).commit();
                break;
            case (R.id.button_gecko_next):
                fragmentManager.beginTransaction().
                        replace(R.id.frame_main, new CoralSnakeFragment()).addToBackStack(null).commit();
                break;
            case (R.id.button_coral_snake_description):
                fragmentManager.beginTransaction().
                        replace(R.id.frame_main, new CoralSnakeInfoFragment()).addToBackStack(null).commit();
                break;
            case (R.id.button_coral_snake_next):
                fragmentManager.beginTransaction().
                        replace(R.id.frame_main, new TortoiseFragment()).addToBackStack(null).commit();
                break;
            case (R.id.button_tortoise_description):
                fragmentManager.beginTransaction().
                        replace(R.id.frame_main, new TortoiseInfoFragment()).addToBackStack(null).commit();


        }
    }
}
