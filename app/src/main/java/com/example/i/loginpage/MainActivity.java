package com.example.i.loginpage;

import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {

    //private EditText Name;
    private EditText Email;
    private EditText Password;
    private Button Login;
    private TextView Register;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Name =(EditText)findViewById(R.id.etUsername);
        Email=(EditText)findViewById(R.id.etEmail);
        Password=(EditText)findViewById(R.id.etPassword);
        Login=(Button)findViewById(R.id.btnLogin);
        Register=(TextView)findViewById(R.id.tvRegister);
        firebaseAuth= FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);

        FirebaseUser user=firebaseAuth.getCurrentUser();
        if(user!=null){
            finish();
            startActivity(new Intent(MainActivity.this,SecondActivity.class));
        }

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check()){
                    validate(Email.getText().toString(),Password.getText().toString());
                }
                else{
                    Toast.makeText(MainActivity.this,"Please enter all the Details ",Toast.LENGTH_SHORT).show();
                }

            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }
        });

    }
    private void validate(String userEmail,String userPassword){

     progressDialog.setMessage("Loding");
     progressDialog.show();
     firebaseAuth.signInWithEmailAndPassword(userEmail, userPassword).addOnCompleteListener(MainActivity.this,new OnCompleteListener<AuthResult>() {
         @Override
         public void onComplete(@NonNull Task<AuthResult> task) {
              if(task.isSuccessful()){ //task.isSuccessful()
                 progressDialog.dismiss();
                 Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                 startActivity(intent);
                 finish();
                 //startActivity(new Intent(MainActivity.this,SecondActivity.class));
                 Toast.makeText(MainActivity.this,"Login Succesful",Toast.LENGTH_SHORT).show();
             }
             else {
                 progressDialog.dismiss();
                 //Toast.makeText(MainActivity.this,"Login Falied",Toast.LENGTH_SHORT).show();
                 Toast.makeText(MainActivity.this,"Login Falied........Check your password or email id",Toast.LENGTH_SHORT).show();
             }
         }
     });

    }
    private boolean check(){
        Boolean result = false;
        String email = Email.getText().toString();
        String password=Password.getText().toString();
        //String email=userEmail.getText().toString();
        if(email.isEmpty() || password.isEmpty()  ){
            result=false;
            //Toast.makeText(this,"Please enter all the Details ",Toast.LENGTH_SHORT).show();
        }
        else{
            result=true;
        }
            return result;
    }


}
