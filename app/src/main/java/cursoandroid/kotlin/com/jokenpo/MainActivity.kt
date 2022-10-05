package cursoandroid.kotlin.com.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun opcaoTesoura(view: View){
        this.opcaoSelecionada("Tesoura")

    }
    fun opcaoPedra(view: View){
        this.opcaoSelecionada("Pedra")

    }
    fun opcaoPapel(view: View){
        this.opcaoSelecionada("Papel")
    }
    fun opcaoSelecionada(opcaoUser: String){
        val escolhaApp = arrayListOf<String>("Pedra", "Papel", "Tesoura")
        val imagemOpcaoApp: ImageView = findViewById(R.id.id_escolha_app)
        val textoResultado: TextView = findViewById(R.id.id_text_resultado)
        val opcaoApp = escolhaApp.random()

        when(opcaoApp){
            "Pedra" ->imagemOpcaoApp.setImageResource(R.drawable.pedra)
            "Tesoura" -> imagemOpcaoApp.setImageResource(R.drawable.tesoura)
            else -> imagemOpcaoApp.setImageResource(R.drawable.papel)
        }

        if ( (opcaoApp == "Tesoura" && opcaoUser == "Papel")||
            (opcaoApp == "Papel" && opcaoUser == "Pedra") ||
            (opcaoApp == "Pedra" && opcaoUser == "Tesoura")
        ){
            textoResultado.setText("Você Perdeu!")

        } else if ((opcaoApp == "Papel" && opcaoUser == "Tesoura")||
            (opcaoApp == "Pedra" && opcaoUser == "Papel") ||
            (opcaoApp == "Tesoura" && opcaoUser == "Pedra")){
            textoResultado.setText("Você Ganhou!!!")
        } else {
            textoResultado.setText("Empatamos!")
        }





    }


}