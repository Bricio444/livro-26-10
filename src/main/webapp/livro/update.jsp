<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />

        <title> editar</title> Livro</title>
      
    </head>
    <body>
        <h1> editar Livro</h1>
        <hr>
        <form action="/livro/update" method="post">
            <input type="hideen"name ="id"     value="${livro.id}"/>
            <label for="titulo">Título</label>
            <input type="text" name="titulo" value="${livro.titulo}"/>

            <a href="/livro/list">Voltar</a>
            <input type="submit" value="Salvar"/>
        </form>
        </body>
</html>