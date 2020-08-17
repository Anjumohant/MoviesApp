package com.example.moviesapp.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.moviesapp.R;
import com.example.moviesapp.model.MovieReview;
import com.example.moviesapp.ui.viewholder.ReviewViewHolder;

import org.jetbrains.annotations.NonNls;

import java.util.ArrayList;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewViewHolder> {

    private final ArrayList<MovieReview> mMovieReviews;

    public ReviewAdapter(ArrayList<MovieReview> mMovieReviews) {
        this.mMovieReviews = mMovieReviews;
    }

    @NonNls
    @Override
    public ReviewViewHolder onCreateViewHolder(@NonNls ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_review_card, parent, false);
        return new ReviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNls ReviewViewHolder holder, int position) {
        MovieReview mMovieReview = this.mMovieReviews.get(position);
        holder.bind(mMovieReview);
    }

    @Override
    public int getItemCount() {
        return this.mMovieReviews.size();
    }

    @Override
    public void onViewRecycled(@NonNls ReviewViewHolder holder) {
        super.onViewRecycled(holder);
    }
}
