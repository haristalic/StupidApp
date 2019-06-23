package tale.youaresostupid;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView myQutes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       myQutes=(TextView)findViewById(R.id.qutesText);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("");
        actionBar.setElevation(0);


    }
    public void qutesPicker(View view){

        String [] qutes ={"you called me to get my phone number.",
                "if I gave you a penny for your thoughts, I’d get change back.",
                "they had to burn the school down to get you out of third grade.",
                "you got locked in a mattress store and slept on the floor.",
        "you bought Norton antivirus when you had a cold.",
                "you put a quarter in each ear and thought you were listening to 50 Cent.",
                "you stood on a chair to raise your IQ.",
                "you went to a pipe company looking for YouTube.",
                "when a zombie said it wanted brains, it walked right past you.",
                "it took you an hour to make one minute rice.",
                "you thought TuPac Shakur was a Jewish holiday!",
                "you tripped over the cordless phone!",
                "you asked for a price check at the Dollar Store!",
                "it takes you 3 hours to watch “60 Minutes!"
        };
        Random r = new Random();
        for (int i=0;i<qutes.length;i++){

            String text =   String.valueOf(qutes[r.nextInt(qutes.length)]);         ;
            myQutes.setText(text);


        }

    }
}
