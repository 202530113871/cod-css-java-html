<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal de Notícias Diárias</title>
    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            line-height: 1.6;
            background-color: #f7f9fa;
            color: #222;
        }
        header {
            background-color: #1a1a1a;
            color: #fff;
            padding: 20px;
            text-align: center;
            border-bottom: 5px solid #d32f2f;
        }
        header h1 {
            font-size: 2.5rem;
            letter-spacing: 1px;
        }
        .container {
            max-width: 1200px;
            margin: 20px auto;
            padding: 0 20px;
            display: grid;
            grid-template-columns: 2fr 1fr;
            gap: 30px;
        }
        @media (max-width: 768px) {
            .container {
                grid-template-columns: 1fr;
            }
        }
        .main-news {
            background: #fff;
            padding: 20px;
            border-radius: 6px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.05);
        }
        .main-news img {
            width: 100%;
            height: auto;
            border-radius: 4px;
            margin-bottom: 15px;
        }
        .category {
            display: inline-block;
            background-color: #d32f2f;
            color: #fff;
            font-size: 0.75rem;
            text-transform: uppercase;
            padding: 3px 8px;
            border-radius: 3px;
            font-weight: bold;
            margin-bottom: 10px;
        }
        .main-news h2 {
            font-size: 2rem;
            margin-bottom: 10px;
            color: #111;
        }
        .meta-info {
            font-size: 0.85rem;
            color: #666;
            margin-bottom: 15px;
        }
        .sidebar {
            display: flex;
            flex-direction: column;
            gap: 20px;
        }
        .sidebar-section-title {
            font-size: 1.2rem;
            border-bottom: 3px solid #1a1a1a;
            padding-bottom: 5px;
            margin-bottom: 10px;
        }
        .news-card {
            background: #fff;
            padding: 15px;
            border-radius: 6px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.05);
            transition: transform 0.2s;
        }
        .news-card:hover {
            transform: translateY(-2px);
        }
        .news-card h3 {
            font-size: 1.1rem;
            margin-bottom: 8px;
            color: #111;
        }
        footer {
            background-color: #1a1a1a;
            color: #ccc;
            text-align: center;
            padding: 20px;
            margin-top: 40px;
            font-size: 0.9rem;
        }

        /* --- ESTILOS ADICIONADOS PARA O SISTEMA DE CURTIDAS --- */
        .likes-container {
            margin-top: 25px;
            display: flex;
            align-items: center;
            gap: 15px;
            border-top: 1px solid #eee;
            padding-top: 20px;
        }
        .btn-curtir {
            background-color: #f0f2f5;
            color: #333;
            border: 1px solid #ddd;
            padding: 8px 18px;
            border-radius: 20px;
            cursor: pointer;
            font-weight: bold;
            transition: all 0.2s ease;
            font-size: 0.95rem;
            display: inline-flex;
            align-items: center;
            gap: 8px;
        }
        /* Quando curtir, o botão ganha a cor vermelha do jornal */
        .btn-curtir.ativo {
            background-color: #d32f2f;
            color: #fff;
            border-color: #d32f2f;
        }
        .btn-curtir:hover {
            transform: scale(1.03);
        }
        .contador-texto {
            font-size: 0.95rem;
            color: #555;
            font-weight: bold;
        }
    </style>
</head>
<body>

    <header>
        <h1>JORNAL TECH & MUNDO</h1>
    </header>

    <main class="container">
        <article class="main-news">
            <span class="category">Tecnologia</span>
            <h2>Nova Inteligência Artificial Revoluciona a Criação de Códigos e Sites</h2>
            <div class="meta-info">Publicado hoje às 14:30 • Por Redação</div>
            
            <img src="https://images.unsplash.com/photo-1542831371-29b0f74f9713?auto=format&fit=crop&w=800&q=80" alt="Tela de computador mostrando códigos">
            
            <p>Uma nova ferramenta promete transformar a rotina de desenvolvedores ao redor do mundo. Capaz de interpretar comandos simples em texto e convertê-los em estruturas complexas prontas para produção, o sistema reduz o tempo de deploy de novas aplicações em até 70%.</p>
            <br>
            <p>Especialistas da área apontam que a tecnologia não substituirá os programadores, mas servirá como um copiloto altamente eficiente, permitindo que os profissionais foquem em regras de negócio e arquiteturas mais robustas.</p>
            
            <div class="likes-container">
                <button id="btnCurtir" class="btn-curtir">
                    <span id="icone-curtida">👍</span> <span id="texto-botao">Curtir</span>
                </button>
                <span class="contador-texto">
                    <span id="contador-curtidas">254</span> curtidas
                </span>
            </div>
        </article>

        <aside class="sidebar">
            <h2 class="sidebar-section-title">Últimas Notícias</h2>
            
            <article class="news-card">
                <span class="category" style="background-color: #2e7d32;">Economia</span>
                <h3>Mercado financeiro fecha em alta após novos anúncios sobre inflação</h3>
                <div class="meta-info">Há 30 minutos</div>
            </article>

            <article class="news-card">
                <span class="category" style="background-color: #0288d1;">Ciência</span>
                <h3>Telescópio espacial descobre três novos planetas em zona habitável</h3>
                <div class="meta-info">Há 2 horas</div>
            </article>

            <article class="news-card">
                <span class="category" style="background-color: #f57c00;">Cultura</span>
                <h3>Festival internacional de cinema divulga lista de filmes selecionados</h3>
                <div class="meta-info">Há 4 horas</div>
            </article>
        </aside>
    </main>

    <footer>
        <p>&copy; 2026 Jornal Tech & Mundo. Todos os direitos reservados.</p>
    </footer>

    <script>
        const btnCurtir = document.getElementById('btnCurtir');
        const contadorCurtidas = document.getElementById('contador-curtidas');
        const iconeCurtida = document.getElementById('icone-curtida');
        const textoBotao = document.getElementById('texto-botao');

        // Um valor inicial de curtidas simulado para o jornal
        let totalCurtidasBase = 254; 

        // Lê se o usuário já tinha deixado o like salvo no navegador anteriormente
        let usuarioCurtiu = localStorage.getItem('usuarioCurtiuNoticia') === 'true';

        // Atualiza a interface gráfica dependendo se está curtido ou não
        function atualizarInterface() {
            if (usuarioCurtiu) {
                btnCurtir.classList.add('ativo');
                iconeCurtida.textContent = '❤️';
                textoBotao.textContent = 'Curtiu!';
                contadorCurtidas.textContent = totalCurtidasBase + 1; // Soma a curtida do usuário
            } else {
                btnCurtir.classList.remove('ativo');
                iconeCurtida.textContent = '👍';
                textoBotao.textContent = 'Curtir';
                contadorCurtidas.textContent = totalCurtidasBase;
            }
        }

        // Executa ao carregar a tela
        atualizarInterface();

        // Ouve o clique do botão
        btnCurtir.addEventListener('click', () => {
            // Inverte o estado (se era verdadeiro vira falso, e vice-versa)
            usuarioCurtiu = !usuarioCurtiu;
            
            // Grava a nova escolha no banco local do navegador
            localStorage.setItem('usuarioCurtiuNoticia', usuarioCurtiu);
            
            // Renderiza na tela
            atualizarInterface();
        });
    </script>

</body>
</html>
