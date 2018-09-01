package iics.ancheta.jeanroy.evennumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button runMeButton = (Button) findViewById(R.id.runMeButton);
        runMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                String result;

               int a = 0;
               for(int x = a; x <=10 ; x+=2){
                   resultTextView.setText(x + "");
               }

            }
        });
    }
}
