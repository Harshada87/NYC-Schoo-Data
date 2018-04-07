package retrofit.harshada.com.retrofitdemo.UI;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import retrofit.harshada.com.retrofitdemo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class MainActivityTest {
@Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity sActivity = null;
    @Before
    public void setUp() {
        sActivity = mainActivityActivityTestRule.getActivity();
    }
    @Test
    public void onCreate() {
       View view = sActivity.findViewById(R.id.card_recycleView);
  //  assertThat(view, is(not(null)));
       onView(withId(R.id.card_recycleView));


    }
    @After
    public void tearDown() {
        sActivity = null;
    }
}