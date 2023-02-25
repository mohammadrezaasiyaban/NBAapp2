package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication22.databinding.ActivityMainBinding;
import com.example.myapplication22.model.TeamModel;
import com.example.myapplication22.recyclerview.OnItemClickTeam;
import com.example.myapplication22.recyclerview.TeamImage;
import com.example.myapplication22.recyclerview.TeamsAdapter;

import java.util.ArrayList;
import java.util.List;

import classs.InfoTeam;

public class MainActivity extends AppCompatActivity implements OnItemClickTeam {
    private RecyclerView recyclerView;
    private TeamsAdapter teamsAdapter;
    private List<TeamModel>teamModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.myapplication22.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
            InfoTeam infoTeam =new InfoTeam();
        recyclerView=findViewById(R.id.recyclerview_teams);
        teamModelList=new ArrayList<>();
        teamModelList.add(new TeamModel(TeamImage.TEAM_ONE_FLAG_IMAGE_URL,"Boston Celtics", infoTeam.getCharlotteHornets()));
        teamModelList.add(new TeamModel(TeamImage.TEAM_TOW_FLAG_IMAGE_URL,"Philadelphia 76ers",infoTeam.Philadelphia76ers));
        teamModelList.add(new TeamModel(TeamImage.TEAM_FOUR_FLAG_IMAGE_URL,"Milwaukee Hawks",infoTeam.AtlantaHawks));
        teamModelList.add(new TeamModel(TeamImage.TEAM_FIVE_FLAG_IMAGE_URL,"Toronto Raptors",infoTeam.getTorontoRaptors()));
        teamModelList.add(new TeamModel(TeamImage.TEAM_SIX_FLAG_IMAGE_URL,"Bulls",infoTeam.ChicagoBulls));
        teamModelList.add(new TeamModel(TeamImage.TEAM_SEVEN_FLAG_IMAGE_URL,"Indiana Pacers",infoTeam.getIndianaPacers()));
        teamModelList.add(new TeamModel(TeamImage.TEAM_THREE_FLAG_IMAGE_URL,"Washington Wizards",infoTeam.WashingtonWizards));

        teamsAdapter=new TeamsAdapter(this, teamModelList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext(),RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(teamsAdapter);
    }

    @Override
    public void OnItemClick(TeamModel teamModel) {

    }
}