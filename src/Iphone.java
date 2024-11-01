import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

public static void main(String[] args) {
    Iphone iphone = new Iphone();
    System.out.println("Aplicativo de musica:");
    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica("Arde outra vez");
    System.out.println("\n\nAplicativo de ligação:");
    iphone.ligar("11 1234567");
    iphone.atender();
    iphone.iniciarCorreioVoz();
    System.out.println("\n\nNavegador de internet:");
    iphone.exibirPagina("www.iphone.com.br");
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
}
@Override
public void tocar(){
    System.out.println("tocando musica");
}
@Override
public void pausar(){
    System.out.println("musica pausada");
}
@Override
public void selecionarMusica(String musica){
    System.out.println("musica: "+musica+" selecionada");
}
@Override
public void ligar(String numero){
    System.out.println("ligando para o numero: "+numero);;
}
@Override
public void atender(){
    System.out.println("Atendendo ligação");
}
@Override
public void iniciarCorreioVoz(){
    System.out.println("iniciando correio de voz:");
}
@Override
public void exibirPagina(String url){
    System.out.println("Exibindo pagina: "+url);
}
@Override
public void adicionarNovaAba(){
    System.out.println("Abrindo nova aba:");
}
@Override
public void atualizarPagina(){
    System.out.println("Atualizar pagina:");
}




}


    