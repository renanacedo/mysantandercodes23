# mysantandercodes23
Um repositorio para as etapas do santander codes 2023.2/BackEnd

# Aula de Git e Versionamento - 10 aulas
    Os titulos não estao necessariamente separados por aula, apenas fui acrescentando por assunto e digitando somente o que achei relevante ou que precisava registrar para absorver melhor na memória. 

## Testando mudança de status no repositorio mapeado
    - Undtracked - Unmodified - Modified - Staged 

## Salvando alterções no GIT
    - git add .nomedoarquivo = passa de chenges para staged
    - git commit -m "mensagem da edição" = realiza o commit atualizando os arquivos/versionamento

## Removendo alterações no GIT
    git restore .nomedoarquivo //remove as alterações feitas no arquivo que está no *changes*
    git restore --staged .nomedoarquivo //retorna o arquivo do status *staged* para o *changes*

## Subindo o commit para o GITHub 
    git remote = para saber o remote ou repositorios que esta sendo usando
    git push .oremote .abranchqueestausando = no meu caso foi "git push origin main"