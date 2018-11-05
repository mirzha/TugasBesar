package com.polinema.tugasbesarkatering;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PaketDetailFragment extends Fragment {

    private long paketId;

    public PaketDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_paket_detail, container, false);
    }

    public void setPaket(long id){
        this.paketId = id;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView tittle = (TextView) view.findViewById(R.id.textJudul);
            Paket paket = Paket.paketmakanan[(int) paketId];
            tittle.setText(Paket.getNama_makanan());

            TextView detail = (TextView) view.findViewById(R.id.textDetail);
            detail.setText(Paket.getDetail_makanan());

            TextView harga = (TextView) view.findViewById(R.id.textHarga);
            harga.setText(Paket.getHarga_makanan());

            ImageView gambar = (ImageView) view.findViewById(R.id.imgfood);
            gambar.setImageResource(Paket.getGambar_makanan());
        }
    }

}
