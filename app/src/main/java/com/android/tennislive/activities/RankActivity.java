package com.android.tennislive.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.tennislive.R;
import com.android.tennislive.player.Player;
import com.android.tennislive.player.PlayerAdapter;

import java.util.ArrayList;
import java.util.List;

public class RankActivity extends Activity {

    private List<Player> playerList = new ArrayList<>();

    private String[] players = {"Williams", "NaLi", "Osaka", "Radwanska", "Barty", "Sharapova", "Zhang", "Wang", "Kvitova", "Halep", "Williams", "NaLi", "Osaka", "Radwanska", "Barty", "Sharapova", "Zhang", "Wang", "Kvitova", "Halep"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);
        initPlayerList();
        PlayerAdapter adapter = new PlayerAdapter(RankActivity.this, R.layout.player_item, playerList);
        ListView list_player = (ListView) findViewById(R.id.list_player);
        list_player.setAdapter(adapter);
    }

    private void initPlayerList() {
        for (int i = 0; i <= players.length-1; i++) {
            Player item = new Player(players[i], R.drawable.ic_launcher_background);
            playerList.add(item);
        }
    }
}
