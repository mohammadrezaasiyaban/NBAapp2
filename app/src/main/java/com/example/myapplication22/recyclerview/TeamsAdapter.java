package com.example.myapplication22.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication22.DetailsActivit;
import com.example.myapplication22.R;
import com.example.myapplication22.model.TeamModel;

import java.util.List;


public class TeamsAdapter extends RecyclerView.Adapter<TeamsAdapter.TeamsViewHolder> {
    private OnItemClickTeam onItemClickTeam;
    private List<TeamModel> teamModelList;

    public TeamsAdapter(OnItemClickTeam onItemClickTeam, List<TeamModel> teamModelList) {
        this.onItemClickTeam = onItemClickTeam;
        this.teamModelList = teamModelList;
    }

    @NonNull
    @Override
    public TeamsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.teams_row_lavout,parent,false);
        return new TeamsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamsViewHolder holder, int position) {
        TeamModel teamModel=teamModelList.get(position);
        Glide.with(holder.itemView.getContext())
                .load(teamModel.getImage())
                .centerCrop()
                .placeholder(R.drawable.loading)
                .into(holder.imageViewteams);

        holder.texsviewteam.setText(teamModel.getNames());

        holder.itemView.setOnClickListener(view -> {
            Context context = view.getContext();
            Intent intent = new Intent(context, DetailsActivit.class);
            intent.putExtra(TeamImage.INFO_TEAM_KEY,teamModel.getInfoTeam());
            intent.putExtra(TeamImage.INFO_IMAGE_KEY,teamModel.getImage());

            context.startActivity(intent);

        });

    }

    @Override
    public int getItemCount() {
        return teamModelList.size();
    }

    public class TeamsViewHolder extends RecyclerView.ViewHolder {
        private AppCompatImageView imageViewteams;
        private AppCompatTextView texsviewteam;
        public TeamsViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewteams=itemView.findViewById(R.id.image_teams_view);
            texsviewteam=itemView.findViewById(R.id.text_teams_view);

        }
    }
}
