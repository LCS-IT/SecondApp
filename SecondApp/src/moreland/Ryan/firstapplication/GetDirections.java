package moreland.Ryan.firstapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GetDirections extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.get_directions);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.get_directions, menu);
		return true;
	}

}
