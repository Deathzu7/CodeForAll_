import React from 'react';

const CryptoCard = ({ name, price }) => (
    <div className="crypto-card">
        <h3>{name}</h3>
        <p>Price: ${price ? price.toFixed(2) : 'N/A'}</p>
    </div>
);

export default CryptoCard;
