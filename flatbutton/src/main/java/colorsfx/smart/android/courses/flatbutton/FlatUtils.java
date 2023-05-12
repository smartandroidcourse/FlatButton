package colorsfx.smart.android.courses.flatbutton;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.os.Build;
import android.view.View;

import androidx.annotation.RequiresApi;

public class FlatUtils {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static void setupRaiflat(View view) {
        StateListAnimator stateListAnimator
                = AnimatorInflater.loadStateListAnimator(view.getContext(),
                R.drawable.flatbutton_animator);
        view.setStateListAnimator(stateListAnimator);
    }
}