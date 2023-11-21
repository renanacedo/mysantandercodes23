#Aula de Redes e Sistemas - 10 Aulas

## 1 - Redes e Sistemas
    Redes: São dois ou mais dispositivos conectados entre eles que trocam informações. Atraves de cabos ou rede wirelles (ondas de radio)
    Origem: Guerra, necessidade de comunicação privada
        Darpa - Departamento de defesa do EUA, desenvolveu a comunicação em rede para troca de informações durante a guerra e posteriormente abraçado pelas universidades que aperfeiçoaram a rede até que se tornasse a internet como é hoje.
        Arpanet - 
        Orgãos reguladores surgiram para padronizar a comunicação. 
    Basicamente foi só isso.

## 2 - Infraestrutura de redes e os principais equipamentos
    NIC ( Network Interface Card )
        Função de receber o cabo que conecta o dispositivo a rede
        End Fisico (MAC)
        End Lógico (IP) 
    Hub 
        hardware que conecta em grupo os dispositivos nas redes (não consegue criar canais)
    Switch
        Substitui o Hub e permite criar canais, ou conexões diretas entre os dispositivos.
    Roteador
        Função de encontrar melhores rotas na internet para entregar pacotes.
    Modem
        É o equipamento responsável pela modulação e demodulação do sinal de internet. 
        Em ambientes residenciais acaba acumulando com as funções do switch e do roteador.

## 3 - Cabeamento estruturado
    Estruturação dos cabos que são utilizados nas redes (padronização por normas)
    Cabo de Par Trançado
        Cabo de cobre dividido em 8 fios, cada fio possui sua funcionalidade
        UTT - Não tem o isolamento
        STP - Possui o isolamento
        A grande diferença entre os dois tipos é o isolamento dos fios.
    Cabo coaxial
        Utilizado para os sinais de internet ou tv 
    Fibra Óptica
        Oferece maiores velocidades. Composta por pedaços de vidros que permite a propagação dos raios de luz que são convertidos. 
    Rack
        Armário para hospedar os equipamentos de hardware. Essencial em data centers e infraestruturas de redes.
    
## 4 - Modelos OSI e TCP/IP 
    OSI - Definição/Norma 
        Seguimentado em 7 camadas: (A comunicação entre a app e o dispositivo passando por essas camadas)
            1- Física
                Hardware. 
            2- Enlace
                Fragmenta o pacote recebido pela rede. Utiliza o endereço MAC para e enviar ao dispositivo final.
            3- Rede
                Onde acontece o envio dos dados (agora em forma de pacote não em segmentos) de um roteador para o outro
            4- Transporte
                Realiza a conexeção com o destino por meio de 2 protocolos:
                    TCP
                        Envia um dado (segmento) para o destino e realiza uma verificação 
                        Utilizado em bancos
                    UDP
                        Envia os dados sem verificação
                        Normalmente utilizado em streaming
            5- Sessão
                Estabelece uma sessão entre usuario e destino, estimula e define coisas como tempo de conexão
            6- Apresentação
                Começa a criptografia para segurança da informação
            7- Aplicação
                É a camada mais proxima do usuario
                Browser
                Protocolo DNS, SSH
    TCP/IP
        Seguimentado em apenas 4 camadas, funciona basicamente igual o OSI com a unica mudança sendo as seguimentaçoes
            Aplicação = Aplicação, Apresentação, Sessão
            Transporte = Transporte
            Internet = Rede
            Acesso a Rede = Enlace, Física

## 5 - IPV4 e IPV6
    IP (Internet Protocol) é o protocolo responsável pelo endereçamento dos pacotes de rede na camada 3 (rede) do modelo OSI. Gera um endereço ao roteador ou servidor.
        IPV4 : 192.168.0.1
            Criado na epoca da arpanet, decada de 80 e o mais usado extensamente no mundo atualmente. Limite de 40 bilhoes de dispositivos (que já foi atingido há anos)
            NAT - tem o IP publico no roteador e dentro da rede interna do roteador existe os dispositivos que o utilizam para fazer conexão com a internet, ou seja, todos os dispositivos conectados em determinado roteador utilizam do mesmo IP
            Formado de 32 bits dividido em 8 octetos

            bit = pulso eletricos (0 e 1)
            bite = 8 bits
        IPV6
            Formato de 128 bits dividido em 16 pares. Hexadecimal (numeros e letras)
            Permite 340 1 decilhoes de conexões
            Ainda não é amplamente utilizado pela dificuldade de implementação
            Não tem e nem precisa da utilização do NAT

## 6 - Cálculo de sub Rede
    Subnet/Subrede = Quebra da rede interna para acesso limitado 
        Ex: Departamentos de uma empresa: RH, Marketing, etc. 
            E assim "separa partes" da rede para cada departamento, seguimentando a rede principal em pequenas redes com disponibilidade de banda definidas e acesso limitado ao próprio departamento
        Tabela de Classes de endereço IP
        Classe -   1º Octeto  - Parte da rede e parte hosts -    Máscara      -    Nº Redes    -   End. por Rede
        A           1-127                  N,H,H,H             255.0.0.0         126(2^7-2)    16.777.214(2^24 -2)
        B           128-191                N,N,H,H             255.255.0.0       16.382(2^14-2)    65.534(2^16 -2)
        C           192-223                N,N,N,H             255.255.255.0     2.097.150(2^21-2)    254(2^8 -2)
        D           224-239                Multicast               N/A               N/A                 N/A
        E           240-255                Experimenal             N/A               N/A                 N/A
        *** Estudar mascara no gpt e youtube. Foi bem mal explicado o calculo de ip e mascara e calculo de hosts
            site24x7 .com = site para calculadora de rede para ipv4
        Um IP pode gerar determinada quantidade de subnets, em cada subnet tem um determinado numero de host que pode ser utilizado, cada subnet tera um broadcast address (ele nao explicou o que é broadcast address) e um address de gateway.
            Cada subnet tem um Address que mantem os 3 primeiros octetos do IP alterando somente o ultimo, no caso essa é a máscara.
            O mesmo para os hosts
    Essa materia foi bem complicada, o conteudo é bem *mal* resumido e passa só por cima do assunto.

## 7 - Domínios, DNS e latência
    Domínio
        Ao digitar um endereço no browser para acessar um site isso nada mais é que um "disfarce" para um endereço de IP
        DNS
            Dividor em servidores raizes que passam para os TLD
            TLD - Top Level Domain: .org - .com - .net
        https://       www.         umbler     .com         /br
        Protocolo  Subdominio      Dominio      TLD    Subdiretorio
            Aqui ainda pode existir um subdominio que fica anterior ao dominio EX: admin.umbler.com/br
                No caso o admin. antes do umbler é o subdominio
    Latência = tempo de duração da requisição da origem até o destino
        Quanto menor melhor
        Cache = Armazena informações em servidores mais proximos para diminuir a latencia. 
        *** Estudar mais sobre DNS, ficou muito vago

## 8 - Principais comandos de configuração
    ipconfig = informa as configurações de IP
    ipconfig /flushdns = limpa o cache DNS da maquina
    ping google.com = verificar a conexão com algum IP especifico
        ping = protocolo icnp - envia pacotes de uma origem ao destino para averiguar a conexão
    nslookup google.com = para verificar qual DNS estou acessando e o IP do destino
    tracert google.com = mapeia quantos saltos/roteadores estou percorrendo para acessar o servidor do destino
    route print = tabela de rotas/mapeamento que o roteador utiliza
    netstat = mapear quais portas estão sendo utilizadas no computador

## 9 - Segurança
    Física = Literalmente o que é físico, HD, ROTEADOR, SWITCH, COMPUTADOR etc
        Redundancia de Rede - Redirecionamento p/ outro servidor
        Acesso biometrico
        Desabilitar acesso de perifericos USB
    Lógica = Servidores e sistemas
        SSO: Mecanismo para que o usuario use a mesma senha para cada local/app
        Firewall: Portão que analisa os acessos ao sistema
        Conexão VPN: Criptografa os acessos pela internet de ponta a ponta
        Att sistema operacional 
        Senhas complexas
    Wireless - Ondas de radio frequencia
        Banda - Canais: possui frequencia, quanto maior a frequencia maior o trafego de dados
        Manter senha de wifi atualizado
        Isolar redes wifi - cliente / empresa / departamentos da empresa
        Atualizar o firmware do roteador

## 10 - Wireless
    Prática
        Cisco Packet Tracer - 
            Foi criado 2 redes, A e B, cada uma com 1 computador e 1 notebook conectados por um switch e foi conectado as redes através de um roteador. 
                Configuramos os IP, GateWay, ligamos os cabos e foi feito teste de envio de um pacote. 
            MUITO interessante ver na pratica essa parte física de rede, da uma noção de como funciona o visual dessa conexão de dispositivos numa rede. 

FIM 