package com.android.phonebook.adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.phonebook.R;
import com.android.phonebook.model.Contact;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    Context mContext;
    List<Contact> mData;
    Dialog mdialog;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_contact, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        mdialog = new Dialog(mContext);
        mdialog.setContentView(R.layout.dialog_contact);
        mdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); // xoa vien trang

        myViewHolder.contact_item_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name = mdialog.findViewById(R.id.dialog_name_id);
                TextView dialog_phone = mdialog.findViewById(R.id.dialog_phone_id);
                ImageView dialog_img = mdialog.findViewById(R.id.img_dialog);
                dialog_name.setText(mData.get(myViewHolder.getAdapterPosition()).getName());
                dialog_phone.setText(mData.get(myViewHolder.getAdapterPosition()).getPhone());
                dialog_img.setImageResource(mData.get(myViewHolder.getAdapterPosition()).getPhoto());
                mdialog.show();
//                Toast.makeText(mContext, "Test Click " + String.valueOf(myViewHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
            }
        });

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_phone.setText(mData.get(position).getPhone());
        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private RelativeLayout contact_item_id;
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            contact_item_id = (RelativeLayout) itemView.findViewById(R.id.contact_item_id);
            tv_name = (TextView) itemView.findViewById(R.id.name_contact);
            tv_phone = (TextView) itemView.findViewById(R.id.phone_contact);
            img = (ImageView) itemView.findViewById(R.id.img_contact);
        }
    }
}
