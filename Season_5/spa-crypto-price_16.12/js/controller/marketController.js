export async function init() {
    const app = document.getElementById('app');
    app.innerHTML = `
        <h1>Loading Market Prices...</h1>
        <div id="loader" class="spinner"></div>
    `;

    const API_KEY = '9FF55325-DBD1-43D4-BB5F-0B524A11E9DE';
    const url = 'https://rest.coinapi.io/v1/assets';

    const selectedAssets = ['BTC', 'ETH','SOL','BREET', 'DOGE', 'XRP'];

    try {

        const response = await fetch(url, {
            headers: { 'X-CoinAPI-Key': API_KEY }
        });

        if (!response.ok) {
            throw new Error(`Erro na API: ${response.status}`);
        }

        const data = await response.json();


        const cryptoData = data.filter(asset =>
            selectedAssets.includes(asset.asset_id)
        );

        app.innerHTML = `
            <h1>Market Prices</h1>
            <ul id="crypto-list" class="crypto-list"></ul>
        `;

        const list = document.getElementById('crypto-list');
        cryptoData.forEach(asset => {
            const li = document.createElement('li');
            li.classList.add('crypto-item');
            li.innerHTML = `
                <strong>${asset.name} (${asset.asset_id})</strong>: 
                ${asset.price_usd ? `$${asset.price_usd.toFixed(2)}` : 'N/A'}
            `;
            list.appendChild(li);
        });

        if (cryptoData.length === 0) {
            list.innerHTML = '<li>No selected cryptocurrencies available.</li>';
        }
    } catch (error) {
        console.error('Erro ao buscar dados:', error);
        app.innerHTML = `
            <h1>Error</h1>
            <p>Failed to load market prices. Please try again later.</p>
        `;
    }
}
