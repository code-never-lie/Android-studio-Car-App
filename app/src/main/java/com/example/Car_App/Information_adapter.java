package com.example.Car_App;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Information_adapter<onItemSelected> extends RecyclerView.Adapter<Information_adapter.ViewHolder> {
   ArrayList<Information> record;
   OnItemSelected activity;

public interface OnItemSelected
{
    void OnItemClick(int index);

}
    public Information_adapter(Context context, ArrayList<Information> list)

    {
        record=list;
        activity=(OnItemSelected) context;
    }
 class ViewHolder extends RecyclerView.ViewHolder{
        TextView model,person;
        ImageView imageView;
        public ViewHolder(View itemView)
        {
            super(itemView);
            model=itemView.findViewById(R.id.rcmodelno);
            person=itemView.findViewById(R.id.rcname);
            imageView=itemView.findViewById(R.id.imageView2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activity.OnItemClick( record.indexOf((Information)view.getTag()));


                }
            });

        }

}



    @NonNull
    @Override
    public Information_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Information_adapter.ViewHolder holder, int position) {
        holder.itemView.setTag(record.get(position));
        holder.model.setText(record.get(position).getModelno());
        holder.person.setText(record.get(position).getName());
        if (record.get(position).carname.equalsIgnoreCase("mercedes")) ;
        {
            holder.imageView.setImageResource(R.drawable.mercedes);
        }
        if (Global.record.get(position).carname.equalsIgnoreCase("nissan")) {
            holder.imageView.setImageResource(R.drawable.nissan);


        }
        if(Global.record.get(position).carname.equalsIgnoreCase("volkswagen"))
        {
           holder. imageView.setImageResource(R.drawable.volkswagen);


        }
    }

    @Override
    public int getItemCount() {
        return record.size();
    }

}
