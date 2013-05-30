package com.example.listmuttiexample;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.main);
		ArrayAdapter<ReceiptModel> adapter = new InteractiveArrayAdapter(this, getModel());
		setListAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private List<ReceiptModel> getModel(){
		List<ReceiptModel> list = new ArrayList<ReceiptModel>();
		list.add(get("128.3", "null", "FairPrice", "Jan, 2, 2013", "grocery", "null"));
		list.add(get("8.35", "null", "Starbucks", "May, 3, 2013", "drinks", "null"));
		list.add(get("12.3", "null", "Cheer", "Jan, 8, 2013", "grocery", "null"));
		list.add(get("7.5", "null", "Coffee Bean and Tea Leaves", "Mar, 2, 2013", "drinks", "null"));
		list.add(get("58.8", "null", "Ding Tai Feng", "Jan, 24, 2013", "food", "null"));
		list.add(get("128.3", "null", "FairPrice", "Jan, 2, 2013", "grocery", "null"));
		list.add(get("8.35", "null", "Starbucks", "May, 3, 2013", "drinks", "null"));
		list.add(get("12.3", "null", "Cheer", "Jan, 8, 2013", "grocery", "null"));
		list.add(get("7.5", "null", "Coffee Bean and Tea Leaves", "Mar, 2, 2013", "drinks", "null"));
		list.add(get("58.8", "null", "Ding Tai Feng", "Jan, 24, 2013", "food", "null"));
		list.add(get("128.3", "null", "FairPrice", "Jan, 2, 2013", "grocery", "null"));
		list.add(get("8.35", "null", "Starbucks", "May, 3, 2013", "drinks", "null"));
		list.add(get("12.3", "null", "Cheer", "Jan, 8, 2013", "grocery", "null"));
		list.add(get("7.5", "null", "Coffee Bean and Tea Leaves", "Mar, 2, 2013", "drinks", "null"));
		list.add(get("58.8", "null", "Ding Tai Feng", "Jan, 24, 2013", "food", "null"));
		list.add(get("128.3", "null", "FairPrice", "Jan, 2, 2013", "grocery", "null"));
		list.add(get("8.35", "null", "Starbucks", "May, 3, 2013", "drinks", "null"));
		list.add(get("12.3", "null", "Cheer", "Jan, 8, 2013", "grocery", "null"));
		list.add(get("7.5", "null", "Coffee Bean and Tea Leaves", "Mar, 2, 2013", "drinks", "null"));
		list.add(get("58.8", "null", "Ding Tai Feng", "Jan, 24, 2013", "food", "null"));
		
		return list;
	}
	
	private ReceiptModel get(String amount, String logoUrl, String retailName, String date, String category, String txtUrl){
		return new ReceiptModel(amount, logoUrl, retailName,  date,  category,  txtUrl);
	}

}
