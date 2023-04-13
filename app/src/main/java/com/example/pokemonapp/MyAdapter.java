package com.example.pokemonapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MyAdapter extends ArrayAdapter<Pokemon> {

    ArrayList<Pokemon> pokemons;


    public MyAdapter(@NonNull Context context, int textViewResourceId, @NonNull ArrayList<Pokemon> objects) {
        super(context, textViewResourceId, objects);
        pokemons = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.grid_view_list, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        Picasso.get().load("https://assets.pokemon.com/assets/cms2/img/pokedex/full/" + pokemons.get(position).getNum() + ".png").into(imageView);
        textView.setText(pokemons.get(position).getName());
        return view;
    }
}
