package dotinc.attendancemanager2.p044b;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import dotinc.attendancemanager2.R;

public class C2306e extends Fragment {
    private TextView f7923a;
    private String[] f7924b;

    public View mo1786a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_third, viewGroup, false);
        this.f7923a = (TextView) inflate.findViewById(R.id.title_text);
        this.f7924b = m1200j().getResources().getStringArray(R.array.viewpager_title);
        this.f7923a.setTypeface(Typeface.createFromAsset(m1200j().getAssets(), "fonts/oxygen-bold.ttf"));
        this.f7923a.setText(this.f7924b[2]);
        return inflate;
    }
}
