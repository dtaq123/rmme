package com.dtaq.myrmme;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.getbase.floatingactionbutton.FloatingActionsMenu;
import com.transitionseverywhere.TransitionManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.hide();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Send remind now!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//         Floating Button toggle
        final FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frame_layout);
        frameLayout.getBackground().setAlpha(0);
        final FloatingActionsMenu fabMenu = (FloatingActionsMenu) findViewById(R.id.fab_menu);
        fabMenu.setOnFloatingActionsMenuUpdateListener(new FloatingActionsMenu.OnFloatingActionsMenuUpdateListener() {
            @Override
            public void onMenuExpanded() {
                frameLayout.getBackground().setAlpha(240);
                frameLayout.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        fabMenu.collapse();
                        return true;
                    }
                });
            }

            @Override
            public void onMenuCollapsed() {
                frameLayout.getBackground().setAlpha(0);
                frameLayout.setOnTouchListener(null);
            }
        });


        // Transition Button
        final CircleImageView avatar1_btn = (CircleImageView) findViewById(R.id.avatar1);
        final CircleImageView avatar2_btn = (CircleImageView) findViewById(R.id.avatar2);
        final CircleImageView avatar3_btn = (CircleImageView) findViewById(R.id.avatar3);
        final CircleImageView avatar4_btn = (CircleImageView) findViewById(R.id.avatar4);
        final CircleImageView avatar5_btn = (CircleImageView) findViewById(R.id.avatar5);
        final CircleImageView avatar6_btn = (CircleImageView) findViewById(R.id.avatar6);


        // Create default layout params for each avatar
        RelativeLayout.LayoutParams param_1 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        param_1.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
        param_1.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        param_1.setMargins(0, 100, 0, 0);
        avatar1_btn.setLayoutParams(param_1);
        ViewGroup.LayoutParams size_1 = avatar1_btn.getLayoutParams();
        size_1.width = 300;
        size_1.height = 300;
        avatar1_btn.setLayoutParams(size_1);


        RelativeLayout.LayoutParams param_2 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        param_2.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);
        param_2.setMargins(50, 0, 0, 0);
        avatar2_btn.setLayoutParams(param_2);
        ViewGroup.LayoutParams size_2 = avatar2_btn.getLayoutParams();
        size_2.width = 200;
        size_2.height = 200;
        avatar2_btn.setLayoutParams(size_2);


        RelativeLayout.LayoutParams param_3 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        param_3.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);
        param_3.setMargins(450, 0, 0, 0);
        avatar3_btn.setLayoutParams(param_3);
        ViewGroup.LayoutParams size_3 = avatar3_btn.getLayoutParams();
        size_3.width = 200;
        size_3.height = 200;
        avatar3_btn.setLayoutParams(size_3);


        RelativeLayout.LayoutParams param_4 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        param_4.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        param_4.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        param_4.setMargins(18, 0, 0, 200);
        avatar4_btn.setLayoutParams(param_4);
        ViewGroup.LayoutParams size_4 = avatar4_btn.getLayoutParams();
        size_4.width = 150;
        size_4.height = 150;
        avatar4_btn.setLayoutParams(size_4);


        RelativeLayout.LayoutParams param_5 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        param_5.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        param_5.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        param_5.setMargins(270, 0, 0, 200);
        avatar5_btn.setLayoutParams(param_5);
        ViewGroup.LayoutParams size_5 = avatar5_btn.getLayoutParams();
        size_5.width = 150;
        size_5.height = 150;
        avatar5_btn.setLayoutParams(size_5);

        RelativeLayout.LayoutParams param_6 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        param_6.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        param_6.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        param_6.setMargins(530, 0, 0, 200);
        avatar6_btn.setLayoutParams(param_6);
        ViewGroup.LayoutParams size_6 = avatar6_btn.getLayoutParams();
        size_6.width = 150;
        size_6.height = 150;
        avatar6_btn.setLayoutParams(size_6);

        // OnClick Avatar Listener
        avatar1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move(R.id.avatar1);
            }
        });
        avatar2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move(R.id.avatar2);
            }
        });
        avatar3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move(R.id.avatar3);
            }
        });
        avatar4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move(R.id.avatar4);
            }
        });
        avatar5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move(R.id.avatar5);
            }
        });
        avatar6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move(R.id.avatar6);
            }
        });
    }

    private void move(int avatar_ID) {
        CircleImageView avatar_btn = (CircleImageView) findViewById(avatar_ID);
        ViewGroup mainlayout = (ViewGroup) findViewById(R.id.drawer_layout);
        TransitionManager.beginDelayedTransition(mainlayout);
        RelativeLayout.LayoutParams position = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT
        );
        position.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        position.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        avatar_btn.setLayoutParams(position);

        ViewGroup.LayoutParams size = avatar_btn.getLayoutParams();
        size.width = 100;
        size.height = 100;
        avatar_btn.setLayoutParams(size);
    }


    // DrawerLayout
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    // Show icon in actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // Selecting items on actionbar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.add_friend) {
            return true;
        }
        if (id == R.id.search_friend) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // Selecting item on drawer navigation
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_history) {

        } else if (id == R.id.nav_contact) {

        } else if (id == R.id.setting) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_about) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
