package com.example.Car_App;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.textfield.TextInputEditText;



public class MainActivity  extends AppCompatActivity implements Information_adapter.OnItemSelected{
    Owner_Frage_Information ownerinfo=new Owner_Frage_Information();
   Car_Information carinfo =new Car_Information();
    TextInputEditText etname, etcontactno, etcarmodel, etcarname;
    TextView tvmodelno, tvownername, tvcontact;
    Button btn1,btn2;
    ImageView imageView,imageView2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname = findViewById(R.id.etownername);
        etcontactno = findViewById(R.id.etcontactnumber);
        etcarmodel = findViewById(R.id.etmodelnumber);
        etcarname = findViewById(R.id.etcarname);
        tvmodelno = findViewById(R.id.CarModel);
        tvownername = findViewById(R.id.OwnerName);
        tvcontact = findViewById(R.id.ContactNo);
        btn1=findViewById(R.id.btncarinfo);
        btn2=findViewById(R.id.btnownerinfo);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);


        FragmentManager fm= getSupportFragmentManager();
        carinfo= (Car_Information) fm.findFragmentById(R.id.fragment6);
        ownerinfo= (Owner_Frage_Information) fm.findFragmentById(R.id.fragment2);
        fm.beginTransaction().hide(carinfo).commit();
        fm.beginTransaction().hide(ownerinfo).commit();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm= getSupportFragmentManager();
                carinfo= (Car_Information) fm.findFragmentById(R.id.fragment6);
                ownerinfo= (Owner_Frage_Information) fm.findFragmentById(R.id.fragment2);
                fm.beginTransaction().show(carinfo).commit();
                fm.beginTransaction().hide(ownerinfo).commit();

            }
        });

      btn2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              FragmentManager fm= getSupportFragmentManager();
              carinfo= (Car_Information) fm.findFragmentById(R.id.fragment6);
              ownerinfo= (Owner_Frage_Information) fm.findFragmentById(R.id.fragment2);
              fm.beginTransaction().hide(carinfo).commit();
              fm.beginTransaction().show(ownerinfo).commit();
          }
      });



    }

    @Override


    public void OnItemClick(int index) {
        tvownername.setText(Global.record.get(index).getName());
        tvcontact.setText(Global.record.get(index).getContactno());
        tvmodelno.setText(Global.record.get(index).getModelno());
        if(Global.record.get(index).carname.equalsIgnoreCase("MERCEDES"));
        {

            imageView.setImageResource(R.drawable.mercedes);
        }
        if(Global.record.get(index).carname.equalsIgnoreCase("NISSAN"))
        {
            imageView.setImageResource(R.drawable.nissan);


        }
        if(Global.record.get(index).carname.equalsIgnoreCase("VOLKSWAGEN"))
        {
            imageView.setImageResource(R.drawable.volkswagen);


        }

    }

}