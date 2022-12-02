package br.com.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listaFilmes;

    String titulo[] = {"Shrek","O Senhor dos Anéis: A Sociedade do Anel","Os Croods","Kung Fu Panda 3","Bob Esponja: Um Herói Fora d'Água","Como Treinar Seu Dragão 2"};
    String descricao[] = {"Um ogro tem sua vida invadida por personagens de contos de fadas que acabam com a tranquilidade de seu lar. Ele faz um acordo pra resgatar uma princesa.","Na primeira parte, O Senhor dos Anéis, um jovem e tímido hobbit chamado Frodo Bolseiro herda um simples anel de ouro que guarda o segredo da sobrevivência – ou escravidão – de todo o mundo.","Um homem das cavernas (Nicolas Cage) e sua família procuram um novo lar quando a Mãe Natureza se torna hostil.","Po treina uma vila de pandas para lutar contra um inimigo sobrenatural.","Em uma missão para salvar seu mundo, Bob Esponja Calça Quadrada está indo para o nosso pela primeira vez!","Este emocionante segundo capítulo da trilogia Como Treinar o Seu Dragão retorna ao mundo fantástico de Soluço e Banguela enquanto eles se unem para salvar o futuro de homens e dragões!"};
    String acesso[] = {"4.7","4.9","4.7","4.4","4.7","4.8"};
    int filmes[] = {R.drawable.sherek,R.drawable.lotr,R.drawable.croods,R.drawable.po,R.drawable.bob,R.drawable.soluco};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaFilmes = findViewById(R.id.idlistaFilmes);
        MyAdapter adapter = new MyAdapter();

        listaFilmes.setAdapter(adapter);
    }

    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            ImageView imgfilme;
            TextView titulofilme, descricaofilme , acessofilme;

            View v = getLayoutInflater().inflate(R.layout.modelo_filmes,null);

            imgfilme = v.findViewById(R.id.imgFilme);
            titulofilme = v.findViewById(R.id.txttituloFilme);
            descricaofilme = v.findViewById(R.id.txtdescricaoFilmes);
            acessofilme = v.findViewById(R.id.txtacessoFilme);

            titulofilme.setText(titulo[i]);
            descricaofilme.setText(descricao[i]);
            acessofilme.setText(acesso[i]);
            imgfilme.setImageResource(filmes[i]);


            return v;
        }
    }
}