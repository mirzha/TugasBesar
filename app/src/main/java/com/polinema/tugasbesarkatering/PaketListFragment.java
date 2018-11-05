package com.polinema.tugasbesarkatering;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.polinema.tugasbesarkatering.Paket.paketmakanan;

public class PaketListFragment extends ListFragment {
    private Listener listener;

    public PaketListFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        String[] names = new String[paketmakanan.length];
        for (int i=0; i<names.length; i++) {
            names[i] = Paket.getNama_makanan();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    public interface Listener{
        void itemClicked(long id);
    }

    @Override
    public void onAttach( Context context ) {
        super.onAttach ( context );
        this.listener=(Listener) context ;
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        if(listener != null)
        {
            listener.itemClicked(id);
        }
    }
}
