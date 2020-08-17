package com.example.moviesapp.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.moviesapp.R;
import com.example.moviesapp.model.MovieTrailer;
import com.example.moviesapp.ui.util.TrailerClickListener;
import com.example.moviesapp.ui.viewholder.TrailerViewHolder;

import org.jetbrains.annotations.NonNls;

import java.util.ArrayList;


public class TrailerAdapter extends RecyclerView.Adapter<TrailerViewHolder> {

    private final TrailerClickListener mTrailerClickListener;
    private final ArrayList<MovieTrailer> mMovieTrailers;

    public TrailerAdapter(ArrayList<MovieTrailer> mMovieTrailers, TrailerClickListener mTrailerClickListener) {
        this.mMovieTrailers = mMovieTrailers;
        this.mTrailerClickListener = mTrailerClickListener;
    }

    @NonNls
    @Override
    public TrailerViewHolder onCreateViewHolder(@NonNls ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_trailer_card, parent, false);
        return new TrailerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNls TrailerViewHolder holder, int position) {
        MovieTrailer mMovieTrailer = this.mMovieTrailers.get(position);
        holder.bind(mMovieTrailer, mTrailerClickListener);
    }

    @Override
    public int getItemCount() {
        return this.mMovieTrailers.size();
    }

    @Override
    public void onViewRecycled(@NonNls TrailerViewHolder holder) {
        super.onViewRecycled(holder);
    }
}
