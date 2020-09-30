package mx.edu.tesoem.isc.emm.a7s212021prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CuadradoActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);

        num1 = findViewById(R.id.txtnum1);
        num2 = findViewById(R.id.txtnum2);
        resultado = findViewById(R.id.lblreul);
    }

    public void pcalcular(View v){
        int vnum1 = Integer.parseInt(num1.getText().toString());
        int vnum2 = Integer.parseInt(num2.getText().toString());
        resultado.setText("El cuadrado es: " + (vnum1 * vnum1));
    }
}
