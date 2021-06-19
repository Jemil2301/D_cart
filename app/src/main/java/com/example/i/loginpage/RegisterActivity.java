package com.example.i.loginpage;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class RegisterActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private EditText userName,userEmail,userPassword;
    private Button regButton;
    private TextView userLogin;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userName= findViewById(R.id.etUsername);
        userPassword=findViewById(R.id.etUserpassword);
        userEmail=findViewById(R.id.etUseremail);
        regButton=findViewById(R.id.btmRegister);
        userLogin=findViewById(R.id.tvUserlogin);
        //progressBar=findViewById(R.id.progressBar);
        firebaseAuth= FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);

       regButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             if(validate()){
                 String user_email=userEmail.getText().toString().trim();
                 String user_password=userPassword.getText().toString().trim();

                 progressDialog.setMessage("Loding");
                 progressDialog.show();
                 firebaseAuth.createUserWithEmailAndPassword(user_email,user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         Toast.makeText(RegisterActivity.this,"createUserWithEmail:onComplete:"+task.isSuccessful(),Toast.LENGTH_SHORT).show();
                         progressBar.setVisibility(View.GONE);
                         if(!task.isSuccessful()){
                             progressDialog.dismiss();
                             Toast.makeText(RegisterActivity.this,"Registretation Failed"+task.getException(),Toast.LENGTH_SHORT).show();
                         }
                         else{
                             progressDialog.dismiss();
                             startActivity(new Intent(RegisterActivity.this,MainActivity.class));
                             finish();
                         }


                     }
                 });
             }

           }
       });
       userLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(RegisterActivity.this,MainActivity.class));
           }
       });


    }

    private boolean validate(){
        Boolean result = false;
        String name = userName.getText().toString();
        String password=userPassword.getText().toString();
        String email=userEmail.getText().toString();
        if(name.isEmpty() || password.isEmpty() || email.isEmpty() ){
            Toast.makeText(this,"Please enter all the Details ",Toast.LENGTH_SHORT).show();
        }
        else if(password.length()<6) {
            userPassword.setError("Password atleast in six Characters");
        }
        else{
            result=true;
        }
        return result;
    }
}
