package divino.com.br.todolist2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] dados = new String[]{
                "Ir à Padaria",
                "Preparar os filhos para ir á Igreja",
                "Comprar pipoca",
                "Voltar pra casa",
                "Preparar comida",
                "receber bronca da esposa",
                "lavar o carro",
                "Ir à Padaria",
                "Preparar os filhos para ir á Igreja",
                "Comprar pipoca",
                "Voltar pra casa",
                "Preparar comida",
                "receber bronca da esposa",
                "lavar o carro",
                "Ir à Padaria",
                "Preparar os filhos para ir á Igreja",
                "Comprar pipoca",
                "Voltar pra casa",
                "Preparar comida",
                "receber bronca da esposa",
                "lavar o carro",
                "Ir à Padaria",
                "Preparar os filhos para ir á Igreja",
                "Comprar pipoca",
                "Voltar pra casa",
                "Preparar comida",
                "receber bronca da esposa",
                "lavar o carro"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_multichoice, dados);
        listagem = (ListView) findViewById(R.id.listagem);
        listagem.setAdapter(adapter);
        listagem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "posição "+position, Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void novaAtividade(View view){
        Intent terceiraTela = new Intent(this, NovaActivity.class);
        startActivity(terceiraTela);
    }


}
