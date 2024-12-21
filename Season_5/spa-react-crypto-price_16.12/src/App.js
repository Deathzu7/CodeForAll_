import React from 'react';
import Header from './components/Header';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import MarketPrices from './pages/MarketPrices';

function App() {
    return (
        <Router>
            <div>
                <Header />
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/market" element={<MarketPrices />} />
                </Routes>
            </div>
        </Router>
    );
}

export default App;
