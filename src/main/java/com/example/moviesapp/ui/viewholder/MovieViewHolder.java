package com.example.moviesapp.ui.viewholder;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.moviesapp.R;
import com.example.moviesapp.model.Movie;
import com.example.moviesapp.ui.util.MovieClickListener;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.moviesapp.ui.activity.MainActivity.getMeasuredPosterHeight;
import static com.example.moviesapp.ui.activity.MainActivity.getScreenWidth;
import static com.example.moviesapp.ui.activity.MainActivity.movieImagePathBuilder;


@SuppressWarnings("ALL")
public class MovieViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.iv_movie_poster) ImageView mMoviePoster;
    @BindView(R.id.cv_movie_card) CardView mMovieCard;

    public MovieViewHolder(final View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(final Movie movie, final MovieClickListener movieClickListener) {
        mMovieCard.setLayoutParams(new ViewGroup.LayoutParams(getScreenWidth()/2, getMeasuredPosterHeight(getScreenWidth()/2)));

        Picasso.with(mMoviePoster.getContext()).load(movieImagePathBuilder(movie.posterPath)).placeholder(R.drawable.placeholder).fit().centerCrop().into(mMoviePoster);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movieClickListener.onMovieClick(movie);
            }
        });
    }
}
