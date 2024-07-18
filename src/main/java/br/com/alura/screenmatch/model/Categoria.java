package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action", "Acao"),
    ANIMACAO("Animation", "Animacao"),
    AVENTURA("Adventure", "Aventura"),
    COMEDIA("Comedy", "Comedia"),
    DRAMA("Drama", "Drama"),
    FANTASIA("Fantasy", "Fantasia"),
    FICCAO("Sci-Fi", "Ficcao"),
    MUSICAL("Musical", "Musical"),
    SUSPENSE("Thriller", "Suspense"),
    TERROR("Horror", "Terror");


    private String categoriaOmdb;

    private String categoriaEmPortugues;

    Categoria(String categoriaOmdb, String categoriaEmPortugues) {
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaEmPortugues = categoriaEmPortugues;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaEmPortugues.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

}
