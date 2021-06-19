package com.example.i.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class buynow extends AppCompatActivity {

    private TextView Proname, Proprice;
    private EditText Firstname, Lastname, Address, City, State, Pincode, Phone, Email, Quantity;
    private Button PlaceOrder;
    String prname,prprice,fname,lname,address,city,state,pincd,pho,email,qua;

    String st, jt;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buynow);

        Proname = (TextView) findViewById(R.id.tvProname);
        Proprice = (TextView) findViewById(R.id.tvProprice);
        Firstname = (EditText) findViewById(R.id.etfirstname);
        Lastname = (EditText) findViewById(R.id.etlastname);
        Address = (EditText) findViewById(R.id.etAddress);
        City = (EditText) findViewById(R.id.etCity);
        State = (EditText) findViewById(R.id.etState);
        Pincode = (EditText) findViewById(R.id.etPincode);
        Phone = (EditText) findViewById(R.id.etPhoneno);
        Email = (EditText) findViewById(R.id.etEmail);
        Quantity = (EditText) findViewById(R.id.etquantity);
        PlaceOrder = (Button) findViewById(R.id.btnPlaceorder);
        st = getIntent().getExtras().getString("Value");
        jt = getIntent().getExtras().getString("Price");
        Proname.setText(st);
        Proprice.setText(jt);

        PlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prname=Proname.getText().toString();
                prprice=Proprice.getText().toString();
                fname=Firstname.getText().toString();
                lname=Lastname.getText().toString();
                address=Address.getText().toString();
                city=City.getText().toString();
                state=State.getText().toString();
                pincd=Pincode.getText().toString();
                pho=Phone.getText().toString();
                email=Email.getText().toString();
                qua=Quantity.getText().toString();
            if(prname.isEmpty() || prprice.isEmpty() || fname.isEmpty() || lname.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || pincd.isEmpty() || pho.isEmpty() || email.isEmpty() || qua.isEmpty()) {

                Toast.makeText(buynow.this,"Please enter all the Details ",Toast.LENGTH_SHORT).show();
            }
            else {

                setData();

                //Toast.makeText(buynow.this,"Your Order has been Placed ",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(buynow.this,Payment.class);
                intent.putExtra("Price",prprice);
                startActivity(intent);
            }
            }
        });


    }

    private void setData(){
        FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
        DatabaseReference myRef=firebaseDatabase.getReference();
        String i=myRef.push().getKey();
        Order order=new Order(fname,lname,address,city,state,pincd,pho,email,qua,prname,prprice);
        myRef.child(i).setValue(order);
    }
}
