package com.example.moviesapp.ui.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.moviesapp.R;
import com.example.moviesapp.model.MovieReview;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ReviewViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.movie_review_username)
    TextView mMovieReviewAuthor;
    @BindView(R.id.movie_review_content)
    TextView mMovieReviewContent;

    public ReviewViewHolder(final View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(final MovieReview mMovieReview) {
        mMovieReviewAuthor.setText(mMovieReview.author);
        mMovieReviewContent.setText(mMovieReview.content);
    }
}