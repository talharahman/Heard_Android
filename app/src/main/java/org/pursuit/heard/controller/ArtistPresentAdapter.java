package org.pursuit.heard.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.pursuit.heard.R;
import org.pursuit.heard.network.networkmodel.ArtistModel;
import org.pursuit.heard.view.ArtistPresentViewHolder;

import java.util.List;

public class ArtistPresentAdapter extends RecyclerView.Adapter<ArtistPresentViewHolder> {

    private List<ArtistModel> userArtists;

    public ArtistPresentAdapter(List<ArtistModel> userArtists) {
        this.userArtists = userArtists;
    }

    @NonNull
    @Override
    public ArtistPresentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ArtistPresentViewHolder(LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.artist_list_itemview,
                        viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistPresentViewHolder artistPresentViewHolder, int position) {
        artistPresentViewHolder.onBind(userArtists.get(position));
    }

    @Override
    public int getItemCount() {
        return userArtists.size();
    }
}
