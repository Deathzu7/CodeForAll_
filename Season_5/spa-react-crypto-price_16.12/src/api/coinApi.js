const API_KEY = '9FF55325-DBD1-43D4-BB5F-0B524A11E9DE';
const API_URL = 'https://rest.coinapi.io/v1/assets';

export const fetchCryptoPrices = async (selectedAssets) => {
    try {
        const response = await fetch(API_URL, {
            headers: { 'X-CoinAPI-Key': API_KEY },
        });
        const data = await response.json();

        return data.filter((asset) =>
            selectedAssets.includes(asset.asset_id)
        );
    } catch (error) {
        console.error('Error fetching data:', error);
        return [];
    }
};
