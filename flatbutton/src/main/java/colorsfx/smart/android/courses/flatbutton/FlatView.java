package colorsfx.smart.android.courses.flatbutton;

import android.os.Parcelable;

public abstract class FlatView {

    abstract Parcelable onSaveInstanceState(Parcelable state);

    abstract Parcelable onRestoreInstanceState(Parcelable state);

    abstract void setFlatEnabled(boolean enable);

    abstract boolean isFlatEnabled();
}