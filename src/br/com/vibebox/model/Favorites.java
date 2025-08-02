package br.com.vibebox.model;

public class Favorites {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println("Incluindo " + audio.getTitulo() + " nos favoritos.");
        } else {
            System.out.println("Não é possível incluir " + audio.getTitulo() + " nos favoritos, pois a classificação é inferior a 9.");
        }
    }
}
