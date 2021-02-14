package com.android.phonebook.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.phonebook.R;
import com.android.phonebook.adapter.RecyclerViewAdapter;
import com.android.phonebook.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {
    View view;
    private RecyclerView mrecyclerView;
    private List<Contact> listContact;

    public FragmentContact(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.contact_fragment, container, false);
        mrecyclerView = view.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), listContact);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mrecyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listContact = new ArrayList<>();
        listContact.add(new Contact("Lê Huyền Linh", "0936196691", R.drawable.linh));
        listContact.add(new Contact("Phạm Thị Quyên", "0339823224", R.drawable.quyen));
        listContact.add(new Contact("Nguyễn Nhật Minh", "0944342322",R.drawable.minh));
        listContact.add(new Contact("Lê Phúc Huy", "0309344343", R.drawable.huy));
        listContact.add(new Contact("Nguyễn Nhật Minh", "0944342322",R.drawable.minh));
        listContact.add(new Contact("Lê Phúc Huy", "0309344343", R.drawable.huy));
        listContact.add(new Contact("Lê Huyền Linh", "0936196691", R.drawable.linh));
        listContact.add(new Contact("Phạm Thị Quyên", "0339823224", R.drawable.quyen));
        listContact.add(new Contact("Nguyễn Nhật Minh", "0944342322",R.drawable.minh));
        listContact.add(new Contact("Lê Phúc Huy", "0309344343", R.drawable.huy));
        listContact.add(new Contact("Lê Huyền Linh", "0936196691", R.drawable.linh));
        listContact.add(new Contact("Phạm Thị Quyên", "0339823224", R.drawable.quyen));
        listContact.add(new Contact("Lê Huyền Linh", "0936196691", R.drawable.linh));
        listContact.add(new Contact("Phạm Thị Quyên", "0339823224", R.drawable.quyen));
        listContact.add(new Contact("Nguyễn Nhật Minh", "0944342322",R.drawable.minh));
        listContact.add(new Contact("Lê Phúc Huy", "0309344343", R.drawable.huy));
        listContact.add(new Contact("Lê Huyền Linh", "0936196691", R.drawable.linh));
    }
}
