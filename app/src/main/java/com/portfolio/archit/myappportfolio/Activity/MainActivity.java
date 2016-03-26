package com.portfolio.archit.myappportfolio.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.portfolio.archit.myappportfolio.R;

public class MainActivity extends BaseActivity {

    private Button btnSpotyfi, btnScoresApp, btnLibrary, btnBuildIt, btnXyzReader, btnCapstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public void initViews() {
        btnSpotyfi = (Button) findViewById(R.id.btnSpotyfi);
        btnScoresApp = (Button) findViewById(R.id.btnScoresApp);
        btnLibrary = (Button) findViewById(R.id.btnLibrary);
        btnBuildIt = (Button) findViewById(R.id.btnBuildIt);
        btnXyzReader = (Button) findViewById(R.id.btnXyzReader);
        btnCapstone = (Button) findViewById(R.id.btnCapstone);
    }

    @Override
    public void setListeners() {

        btnSpotyfi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,mContext.getString(R.string.desc_spotify_streamer),Toast.LENGTH_SHORT).show();
            }
        });
        btnScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,mContext.getString(R.string.desc_scores),Toast.LENGTH_SHORT).show();
            }
        });
        btnBuildIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,mContext.getString(R.string.desc_build_it),Toast.LENGTH_SHORT).show();
            }
        });
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,mContext.getString(R.string.desc_library),Toast.LENGTH_SHORT).show();
            }
        });
        btnXyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,mContext.getString(R.string.desc_xyz_reader),Toast.LENGTH_SHORT).show();
            }
        });
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,mContext.getString(R.string.desc_capstone),Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
