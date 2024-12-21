import React from 'react';
import { Link } from 'react-router-dom';

const Header = () => (
    <nav className="navbar">
        <Link to="/">Home</Link>
        <Link to="/market">Market Prices</Link>
    </nav>
);

export default Header;
