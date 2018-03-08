package br.com.gustavolobato.imc2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void btnCalcularOnClick(View v){
            //ao clicar no botão calcular abrir campo de para informar o nome
            //não consegui fazer a funcao de abrir o popup com o campo para o
            // usuario digitar pois meu android studio esta com problemas então
            //vamos considerar que estes comentários estão no lugar do código
            // que deveria estar aqui apenas para fins didáticos dos branchs do GIT
            TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
            EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
            EditText txtAltura = (EditText) findViewById(R.id.txtAltura);

            int peso = Integer.parseInt(txtPeso.getText().toString());
            float altura = Float.parseFloat(txtAltura.getText().toString());

            float resultado = peso / (altura * altura);
            if(resultado < 19){
                //abaixo
                lblResultado.setText("Abaixo do peso!");
            }
            else if(resultado > 32){
                //obeso
                lblResultado.setText("Acima do peso!");
            }
            else{
                //ok
                lblResultado.setText("Peso ok!");
            }
        }
}

