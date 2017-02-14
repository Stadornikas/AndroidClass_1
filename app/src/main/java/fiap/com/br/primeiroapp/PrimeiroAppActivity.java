package fiap.com.br.primeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PrimeiroAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiro_app);
    }

    public void mostrarMensagem(View view){
        Toast.makeText(this, "Hello SIR", Toast.LENGTH_SHORT).show();
    }
}
