package com.rhar.age.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rhar.age.Book;
import com.rhar.age.R;
import com.rhar.age.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class ShopFragment extends Fragment {

    List<Book> lstBook;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop, container, false );

        lstBook = new ArrayList<>();
        lstBook.add(new Book("Livre", "Livre", "Livre de courtoisie", "Livre de courtoisie", "Livre de courtoisie", R.drawable.book,2000, true));
        lstBook.add(new Book("Livre", "Livre", "Livre de courtoisie ", "Livre de courtoisie", "Livre de courtoisie", R.drawable.book, 2500, true));
        lstBook.add(new Book("Livre", "Livre", "Livre de courtoisie", "Livre de courtoisie","Livre de courtoisie", R.drawable.book, 2000, true));


        RecyclerView myrv = view.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity(), lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        myrv.setAdapter(adapter);


        return view;
    }
}
