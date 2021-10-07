package umn.ac.id;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class DaftarAudioAdapter extends RecyclerView.Adapter<DaftarAudioAdapter.ItemAudioViewHolder>{
    private LinkedList<SumberVideo> mDaftarVideo;
    private LayoutInflater mInflater;
    private Context mContext;
    public DaftarAudioAdapter(Context context, LinkedList<SumberVideo> daftarVideo){
        this.mContext = context;
        this.mDaftarVideo = daftarVideo;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ItemAudioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.video_layout , parent , false);
        return new ItemAudioViewHolder(view, this);
    }
    @Override
    public void onBindViewHolder(@NonNull ItemAudioViewHolder holder, int position) {
        SumberVideo mSumberVideo = mDaftarVideo.get(position);
        holder.tvJudul.setText(mSumberVideo.getJudul());
        holder.tvKeterangan.setText(mSumberVideo.getKeterangan());

    }
    @Override
    public int getItemCount() {
        return mDaftarVideo.size();
    }
    class ItemAudioViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tvJudul;
        private TextView tvKeterangan;
        private DaftarAudioAdapter mAdapter;
        private int mPosisi;
        private SumberVideo mSumberVideo;
        private ImageView delete;
        public ItemAudioViewHolder(@NonNull View itemView, DaftarAudioAdapter adapter) {
            super(itemView);
            mAdapter = adapter;
            tvJudul = (TextView) itemView.findViewById(R.id.tvJudul);
            tvKeterangan = (TextView) itemView.findViewById(R.id.tvKeterangan);
            itemView.setOnClickListener(this);
            delete = (ImageView) itemView.findViewById(R.id.delete);
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mDaftarVideo.remove(getLayoutPosition());
                    notifyItemRemoved(getLayoutPosition());
                    notifyItemRangeChanged(getLayoutPosition(),mDaftarVideo.size());
                }
            });
        }
        @Override
        public void onClick(View v) {
            mPosisi = getLayoutPosition();
            mSumberVideo = mDaftarVideo.get(mPosisi);
            Intent detilInten = new Intent(mContext, DetilAudioActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("DetilVideo",mSumberVideo);
            detilInten.putExtras(bundle);
            mContext.startActivity(detilInten);
        }

    }
}
