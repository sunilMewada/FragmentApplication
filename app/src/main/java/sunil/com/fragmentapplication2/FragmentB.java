package sunil.com.fragmentapplication2;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sunil.fragmentapplication.R;

/**
 * Created by Sunil on 19-03-2017.
 */

public class FragmentB extends Fragment {

    private TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        textView = (TextView)getActivity().findViewById(R.id.textView);
    }
    public void changeData(int i){
        Resources resources = getResources();
        String[] discription = resources.getStringArray(R.array.discription);
        textView.setText(discription[i]);
    }
}
