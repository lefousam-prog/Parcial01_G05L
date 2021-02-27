package sv.edu.udb.parcial01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*  Para que el splash screen sea de pantalla completa*/
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        /*Este metodo llama a una funcion que permite colocarle un delay de 5 segundos a esta Activity
        * cuando terminete a través de Intent llamaremos a la segunda actividad y finalizaremos esta*/

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (MainActivity.this , segundaActividad.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}