package com.example.listmuttiexample;

import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

public class InteractiveArrayAdapter extends ArrayAdapter<ReceiptModel>{
	
	private final List<ReceiptModel> list;
	private final Activity context;
	
	public InteractiveArrayAdapter(Activity context, List<ReceiptModel> list){
		super(context, R.layout.list_view, list);
		this.context = context;
		this.list = list;
	}
	
	static class ViewHolder{
		protected TextView RetailName;
		protected TextView amount;
		protected TextView date;
		protected TextView category;
		protected ImageView logo;
		protected CheckBox checkBox;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		View view = null;
		if(convertView == null){
			LayoutInflater inflater = context.getLayoutInflater();
			view = inflater.inflate(R.layout.row_view,  null);
			final ViewHolder viewHolder = new ViewHolder();
			
			viewHolder.RetailName = (TextView)view.findViewById(R.id.row_retail_name);
			viewHolder.amount = (TextView)view.findViewById(R.id.row_amount);
			viewHolder.date = (TextView)view.findViewById(R.id.row_date);
			viewHolder.category = (TextView)view.findViewById(R.id.row_category);
			viewHolder.logo = (ImageView)view.findViewById(R.id.row_logo);
			
			viewHolder.checkBox = (CheckBox)view.findViewById(R.id.row_check);
			viewHolder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					ReceiptModel element = (ReceiptModel)viewHolder.checkBox.getTag();
					element.setSelected(buttonView.isChecked());
				}
			});
			
			view.setTag(viewHolder);
			viewHolder.checkBox.setTag(list.get(position));
		}else{
			view = convertView;
			((ViewHolder)view.getTag()).checkBox.setTag(list.get(position));
		}
		
		ViewHolder holder = (ViewHolder)view.getTag();
		holder.RetailName.setText(list.get(position).getRetailName());
		holder.amount.setText(list.get(position).getAmount());
		holder.date.setText(list.get(position).getDate());
		holder.category.setText(list.get(position).getCategory());
		holder.logo.setImageResource(R.drawable.ic_launcher);
		holder.checkBox.setChecked(list.get(position).isSelected());
		return view;
	}

}
