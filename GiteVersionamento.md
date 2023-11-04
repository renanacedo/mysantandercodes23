# Aula de Git e Versionamento - 10 aulas
    Os titulos não estao necessariamente separados por aula, apenas fui acrescentando por assunto e digitando somente o que achei relevante ou que precisava registrar para absorver melhor na memória. 

## Testando mudança de status no repositorio mapeado
    - Undtracked - Unmodified - Modified - Staged 

## Salvando alterções no GIT
    - git add <nome do arquivo> = passa de chenges para staged
    - git commit -m "mensagem da edição" = realiza o commit atualizando os arquivos/versionamento

## Removendo alterações no GIT
    git restore <nome do arquivo> //remove as alterações feitas no arquivo que está no *changes*
    git restore --staged <nome do arquivo> //retorna o arquivo do status *staged* para o *changes*

## Subindo o commit para o GITHub e de outros para o local
    git remote = para saber o remote ou repositorios que esta sendo usando
    git push <o remote> <branch> = no meu caso foi "git push origin main"
    git pull = puxa tudo que esta no repositorio remoto e soma ao seu
    git fetch = ele puxa do remoto mas não acrescenta, use o <git diff> para verificar
        as aterações e use o <git pull> para somar ao projeto. OU SEJA dar fetch e diff antes de 
        dar o pull para verificar as alterações e não dar problema

## Utilização de Branchs
    git branch = verifica as branchs disponiveis e qual você esta
    git branch <nome da nova branch> = cria uma branch
    git checkout <branch> = se move nas branchs
    git merge <branch> = ele mescla as branchs (no caso ele pega a branch citada no comando
        e mescla com a branch que você esta atualmente)