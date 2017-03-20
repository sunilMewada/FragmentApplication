package sunil.com.fragmentapplication2;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

import com.sunil.fragmentapplication.R;

/**
 * Created by Sunil on 19-03-2017.
 */

public class MainActivity2 extends Activity implements Communicator{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void respond(int i){
        FragmentManager manager = getFragmentManager();
        FragmentB fragmentB = (FragmentB)manager.findFragmentById(R.id.fragment_b);
        fragmentB.changeData(i);
    }
}
