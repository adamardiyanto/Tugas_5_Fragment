package com.example.tugas5_fragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class OlshopAdapter extends RecyclerView.Adapter<com.example.tugas5_fragment.OlshopAdapter.ViewHolder> {
    private Context context;
    private ArrayList<com.example.tugas5_fragment.OlshopModel> olshopModels;

    public OlshopAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<com.example.tugas5_fragment.OlshopModel> getOlshopModels() {
        return olshopModels;
    }
    public void setOlshopModels(ArrayList<com.example.tugas5_fragment.OlshopModel> olshopModels) {
        this.olshopModels = olshopModels;
    }

    @NonNull
    @Override
    public com.example.tugas5_fragment.OlshopAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_olshop,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.tugas5_fragment.OlshopAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getOlshopModels().get(i).getLogoOlshop()).into(viewHolder.ivGambar);
        viewHolder.tvJudul.setText(getOlshopModels().get(i).getNamaOlshop());

        viewHolder.btnShare.setOnClickListener(v -> {
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            context.startActivity(Intent.createChooser(share,"Share via" ));
        });

        viewHolder.btnPreview.setOnClickListener(v -> {
            Intent preview = new Intent(context, com.example.tugas5_fragment.PreviewActivity.class);
            preview.putExtra("nama",getOlshopModels().get(i).getNamaOlshop());
            preview.putExtra("lambang",getOlshopModels().get(i).getLogoOlshop());

            context.startActivity(preview);
        });


    }

    @Override
    public int getItemCount() {
        return getOlshopModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivGambar;
        private TextView tvJudul;
        private Button btnShare, btnPreview;

        public ViewHolder( View itemView){
            super(itemView);
            ivGambar = itemView.findViewById(R.id.gambar);
            tvJudul = itemView.findViewById(R.id.judul);
            btnShare = itemView.findViewById(R.id.btn_share);
            btnPreview = itemView.findViewById(R.id.btn_preview);
        }


    }
}
