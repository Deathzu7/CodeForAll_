import React, { useState, useEffect } from 'react';
import { fetchCryptoPrices } from '../api/coinApi';
import CryptoCard from '../components/CryptoCard';
import Loader from '../components/Loader';

const MarketPrices = () => {
    const [cryptoData, setCryptoData] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        const getData = async () => {
            const selectedAssets = ['BTC', 'ETH', 'ADA', 'DOGE'];
            const data = await fetchCryptoPrices(selectedAssets);
            setCryptoData(data);
            setLoading(false);
        };
        getData();
    }, []);

    return (
        <div className="market">
            <h1>Market Prices</h1>
            {loading ? (
                <Loader />
            ) : (
                <div className="crypto-container">
                    {cryptoData.map((crypto) => (
                        <CryptoCard
                            key={crypto.asset_id}
                            name={crypto.name}
                            price={crypto.price_usd}
                        />
                    ))}
                </div>
            )}
        </div>
    );
};

export default MarketPrices;
