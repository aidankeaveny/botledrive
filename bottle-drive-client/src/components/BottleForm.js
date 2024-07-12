import React, { useState } from 'react';
import { addBottle } from '../api';

const BottleForm = () => {
    const [address, setAddress] = useState('');
    const [numberOfBottles, setNumberOfBottles] = useState('');

    const handleSubmit = async (e) => {
        e.preventDefault();
        await addBottle({ address, numberOfBottles });
        setAddress('');
        setNumberOfBottles('');
    };

    return (
        <form onSubmit={handleSubmit}>
            <label>
                Address:
                <input type="text" value={address} onChange={(e) => setAddress(e.target.value)} required />
            </label>
            <label>
                Number of Bottles:
                <input type="number" value={numberOfBottles} onChange={(e) => setNumberOfBottles(e.target.value)} required />
            </label>
            <button type="submit">Submit</button>
        </form>
    );
};

export default BottleForm;
