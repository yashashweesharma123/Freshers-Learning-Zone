package com.example.shubham.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.shubham.myapplication.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

/**
 * Created by shubham on 20-Oct-18.
 */

public class Quiz extends AppCompatActivity {
    MaterialEditText edittext,editpassword,editemail;
    MaterialEditText editText,editPassword;
    Button button,button1;
    FirebaseDatabase database;
    DatabaseReference users;
    private static final int REQUEST_SIGNUP = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        database=FirebaseDatabase.getInstance();
        users=database.getReference("Users");
        editText=(MaterialEditText) findViewById(R.id.editText);
        editPassword=(MaterialEditText) findViewById(R.id.editPassword);
        button1=(Button) findViewById(R.id.button1);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConnectedWithInternet(Quiz.this)){
                    showSignUpDialog();

                }
                else{
                    Toast.makeText(Quiz.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                }

                //showSignUpDialog();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConnectedWithInternet(Quiz.this)) {
                    signIn(editText.getText().toString(),editPassword.getText().toString());
                    //Intent intent=new Intent(getApplicationContext(),TheorySubjectsActivity.class);
                    //startActivityForResult(intent, REQUEST_SIGNUP);

                }else {
                    Toast.makeText(Quiz.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                }
                //signIn(editText.getText().toString(),editPassword.getText().toString());
            }
        });
    }
    private void signIn(final String user,final String pwd){
        users.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot.child(user).exists()){
                    if(!user.isEmpty()){
                        User login=dataSnapshot.child(user).getValue(User.class);
                        if(login.getPassword().equals(pwd)){
                            if (isConnectedWithInternet(Quiz.this)){
                                Toast.makeText(Quiz.this,"Login Ok",Toast.LENGTH_SHORT).show();
                                Intent i=new Intent(Quiz.this,QuizSubjectsActivity.class);
                                startActivity(i);

                            }
                            else{
                                Toast.makeText(Quiz.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                            }
                        }
                            //Toast.makeText(Quiz.this,"Login Ok",Toast.LENGTH_SHORT).show();
                            //Intent i=new Intent(Quiz.this,QuizSubjectsActivity.class);
                            //startActivity(i);}


                            //Intent intent=new Intent(getApplicationContext(),QuizSubjectsActivity.class);
                        //startActivity(intent);
                        else
                            Toast.makeText(Quiz.this,"Wrong password",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(Quiz.this,"Please enter your user name",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Quiz.this,"User does not exists",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }



private void showSignUpDialog() {
    AlertDialog.Builder alertDialog = new AlertDialog.Builder(Quiz.this);
    alertDialog.setTitle("Sign Up");
    alertDialog.setMessage("Please fill full information");

    LayoutInflater inflater = this.getLayoutInflater();
    View sign_up_layout = inflater.inflate(R.layout.sign_up_layout, null);
    edittext = (MaterialEditText) sign_up_layout.findViewById(R.id.edittext);
    editpassword = (MaterialEditText) sign_up_layout.findViewById(R.id.editpassword);
    editemail = (MaterialEditText) sign_up_layout.findViewById(R.id.editemail);

    alertDialog.setView(sign_up_layout);
    alertDialog.setIcon(R.drawable.ic_group_black_24dp);
    alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
        }
    });
    alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            final User user = new User(edittext.getText().toString(),
                    editpassword.getText().toString(),
                    editemail.getText().toString().trim());
            users.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    if (dataSnapshot.child(user.getUserName()).exists())
                        Toast.makeText(Quiz.this, "User alreday exists !", Toast.LENGTH_SHORT).show();
                    else {
                        users.child(user.getUserName()).setValue(user);
                        Toast.makeText(Quiz.this, "User registration success !", Toast.LENGTH_SHORT).show();
                    }

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            dialog.dismiss();
        }
    });
    alertDialog.show();
}
    public static boolean isConnectedWithInternet(Context context) {
        boolean _isNetAvailable = false;
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo wifiNetwork = cm
                .getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (wifiNetwork != null) {
            _isNetAvailable = wifiNetwork.isConnectedOrConnecting();
        }

        NetworkInfo mobileNetwork = cm
                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        if (mobileNetwork != null) {
            _isNetAvailable = mobileNetwork.isConnectedOrConnecting();
        }

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) {
            _isNetAvailable = activeNetwork.isConnectedOrConnecting();
        }
        return _isNetAvailable;
    }
}//












