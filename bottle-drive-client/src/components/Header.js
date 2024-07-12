import React from 'react';
import { Link } from 'react-router-dom';

const Header = () => (
    <nav>
        <ul>
            <li><Link to="/">Home</Link></li>
            <li><Link to="/about">About</Link></li>
            <li><Link to="/contact">Contact</Link></li>
            <li><Link to="/form">Form</Link></li>
            <li><Link to="/checklist">Checklist</Link></li>
        </ul>
    </nav>
);

export default Header;
