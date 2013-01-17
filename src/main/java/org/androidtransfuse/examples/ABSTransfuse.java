package org.androidtransfuse.examples;

import com.actionbarsherlock.app.SherlockActivity;
import org.androidtransfuse.annotations.*;

/**
 * @author John Ericksen
 */
@Activity(type = SherlockActivity.class, theme = "@style/Theme.Sherlock")
@Layout(R.layout.text)
@IntentFilter({
        @Intent(type = IntentType.ACTION, name = android.content.Intent.ACTION_MAIN),
        @Intent(type = IntentType.CATEGORY, name = android.content.Intent.CATEGORY_LAUNCHER)
})
public class ABSTransfuse {


}
