package com.kyotobytes.iubcompanionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView university;
    private TextView companion;
    private TextView s1;
    private TextView s2;
    private TextView help;
    private Typeface tf;
    private Button irasButton;
    private Button OfWebButton;
    private Button LibButton;
    private Button cgpaButton;
    private Button gradeButton;
    private Button ecButton;
    private Button classroomButton;
    private Button gmapButton;
    private TextView takemeto;
    private TextView findsomethingforme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("IUB: Companion App");


//        irasButton=(Button)findViewById(R.id.iras_button);
//        OfWebButton=(Button)findViewById(R.id.website_button);
//        LibButton=(Button)findViewById(R.id.library_button);
//        cgpaButton=(Button)findViewById(R.id.cgpa_button);
//        gradeButton=(Button)findViewById(R.id.gradecal_button);
//        ecButton=(Button)findViewById(R.id.contact_button);
//        classroomButton=(Button)findViewById(R.id.findmyclassroom_button);
//        gmapButton=(Button)findViewById(R.id.iublocation_button);

        takemeto=(TextView)findViewById(R.id.takemeto_tf);
        findsomethingforme=(TextView)findViewById(R.id.findmesomething_tf);

        university=(TextView)findViewById(R.id.universityname);
        companion=(TextView)findViewById(R.id.companionapp);
        help=(TextView)findViewById(R.id.help_button);
        s1=(TextView)findViewById(R.id.slogan_one);
        s2=(TextView)findViewById(R.id.slogan_two);

        tf=Typeface.createFromAsset(getAssets(),"font/action_man.ttf");
        //tf=Typeface.createFromAsset(getAssets(),"font/gloriahallelujah.ttf");
        university.setTypeface(tf);
        tf=Typeface.createFromAsset(getAssets(),"font/gloriahallelujah.ttf");
        //tf=Typeface.createFromAsset(getAssets(),"font/kaushanscriptregular.otf");
        s1.setTypeface(tf);
        s2.setTypeface(tf);
        help.setTypeface(tf);

        takemeto.setTypeface(tf);
        findsomethingforme.setTypeface(tf);

//        irasButton.setTypeface(tf);
//        OfWebButton.setTypeface(tf);
//        LibButton.setTypeface(tf);
//        cgpaButton.setTypeface(tf);
//        gradeButton.setTypeface(tf);
//        ecButton.setTypeface(tf);
//        classroomButton.setTypeface(tf);
//        gmapButton.setTypeface(tf);


        tf=Typeface.createFromAsset(getAssets(),"font/action_man_italic.ttf");
        companion.setTypeface(tf);

        getSupportActionBar().hide();
        Toast.makeText(this, "Just to let you know, this is an unofficial app. :3", Toast.LENGTH_SHORT).show();
    }

    public void iras_onClick(View view){
        Intent iras_activity=new Intent(this, iras.class);
        startActivity(iras_activity);
    }
    public void website_onClick(View view){
        Intent website_activity=new Intent(this,officialwebsite.class );
        startActivity(website_activity);
    }
    public void takemetoiub_onClick(View view){
        Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("Independent University, Bangladesh"));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    public void library_onClick(View view){
        Intent website_activity=new Intent(this,library.class);
        startActivity(website_activity);
    }
    public void findmyclassroom_onClick(View view){
        Intent findmyclassroom_activity=new Intent(this,findmyclassroom.class);
        startActivity(findmyclassroom_activity);
    }
    public void help_onClick(View view){
        Toast.makeText(this, "Initiaing help line...", Toast.LENGTH_SHORT).show();
        Intent help_activity=new Intent(this,help_main.class);
        startActivity(help_activity);
    }
}