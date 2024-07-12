import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Header from './components/Header';
import About from './pages/About';
import Contact from './pages/Contact';
import Form from './pages/Form';
import BottleList from './components/BottleList';
import PickupChecklist from './components/PickupChecklist';

const App = () => (
    <Router>
        <Header />
        <Routes>
            <Route path="/" element={<BottleList />} />
            <Route path="/about" element={<About />} />
            <Route path="/contact" element={<Contact />} />
            <Route path="/form" element={<Form />} />
            <Route path="/checklist" element={<PickupChecklist />} />
        </Routes>
    </Router>
);

export default App;
