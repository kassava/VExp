package com.android.shiz.videoexperiment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		 // имена атрибутов для Map
		  final String ATTRIBUTE_NAME_DUR = "Duartion";
		  final String ATTRIBUTE_NAME_NAME = "Name";
		  final String ATTRIBUTE_NAME_IMAGE = "Image";
		
		final ListView listview = (ListView) findViewById(R.id.lvMain);

		

		int img = R.drawable.ic_launcher;
		String[] texts = { "1111", "2222", "3333", "4444", "5555", "1111", "2222", "3333", "4444", "5555", "1111", "2222", "3333", "4444", "5555" };
		String[] texts2 = { "sometext 11", "sometext 22", "sometext 33",
		        "sometext 44", "sometext 55", "sometext 11", "sometext 22", "sometext 33",
		        "sometext 44", "sometext 55", "sometext 11", "sometext 22", "sometext 33",
		        "sometext 44", "sometext 55" };
		
		ArrayList<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>(texts.length);
		HashMap<String, Object> map;
		
		for (int i = 0; i < texts.length; i++) {
		      map = new HashMap<String, Object>();
		      map.put(ATTRIBUTE_NAME_DUR, texts[i]);
		      map.put(ATTRIBUTE_NAME_NAME, texts2[i]);
		      map.put(ATTRIBUTE_NAME_IMAGE, img);
		      data.add(map);
		    }	

		SimpleAdapter adapter;
		adapter = new SimpleAdapter(this, data,	R.layout.row, 
				new String[] {ATTRIBUTE_NAME_DUR, ATTRIBUTE_NAME_NAME, ATTRIBUTE_NAME_IMAGE}, 
				new int[] { R.id.ColDuration, R.id.ColName, R.id.ivImg });
		listview.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
