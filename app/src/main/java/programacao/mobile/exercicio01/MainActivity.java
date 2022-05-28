package programacao.mobile.exercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaExersicios listaExersicios = new ListaExersicios("Lista 01");
        //System.out.println(listaExersicios.porcentagemFaltas(10,8));
        porcentagem();
    }

    public void porcentagem(){
        TextView aulas = (TextView) findViewById(R.id.aulas);
        int n1 = Integer.parseInt(aulas.getText().toString());

        TextView faltas = (TextView) findViewById(R.id.faltas);
        int n2 = Integer.parseInt(faltas.getText().toString());

        int porcentagem = (n1 * 100) / n2;

        Toast.makeText(this,"Resultado" + porcentagem,Toast.LENGTH_LONG).show();
    }
}