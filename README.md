# Vibebox

<p align="center">
  <strong>Vibebox</strong> é um projeto Java que simula uma aplicação de <strong>streaming de áudio</strong>, permitindo gerenciar músicas, podcasts e favoritos de forma simples.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-8%2B-007396?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge" />
  <img src="https://img.shields.io/badge/License-MIT-blue?style=for-the-badge" />
</p>

## Estrutura do Projeto

```
Vibebox.iml
src/
  Main.java
  br/
    com/
      vibebox/
        model/
          Audio.java
          Favorites.java
          Podcast.java
          Song.java
```

- **Main.java**: Ponto de entrada da aplicação.
- **Audio.java**: Classe base para tipos de áudio.
- **Song.java**: Representa uma música.
- **Podcast.java**: Representa um podcast.
- **Favorites.java**: Gerencia a lista de favoritos.

## ✨ Funcionalidades
- ➕ **Adicionar** músicas e podcasts
- 📋 **Listar** músicas e podcasts
- ❤️ **Curtir** faixas
- ⭐ **Gerenciar** lista de favoritos

---

## Como Executar

1. Certifique-se de ter o Java instalado (JDK 8+).
2. Compile os arquivos:
   ```
   javac src/Main.java src/br/com/vibebox/model/*.java
   ```
3. Execute o programa:
   ```
   java -cp src Main
   ```

## Requisitos

- Java 8 ou superior

## Exemplos de Uso

- Adicionar uma música:
  ```java
  Song musica = new Song("Nome", "Artista", 2024);
  ```
- Adicionar um podcast:
  ```java
  Podcast podcast = new Podcast("Título", "Host", 10);
  ```
- Adicionar aos favoritos:
  ```java
  Favorites favoritos = new Favorites();
  favoritos.add(musica);
  favoritos.add(podcast);
  ```

## Contribuição

Pull requests são bem-vindos! Para grandes mudanças, abra uma issue primeiro para discutir o que deseja modificar.

## Licença

Este projeto está sob a licença MIT.

