import React, { useEffect, useState } from 'react';
import { getBottles, deleteBottle } from '../api';

const BottleList = () => {
    const [bottles, setBottles] = useState([]);

    useEffect(() => {
        const fetchBottles = async () => {
            const response = await getBottles();
            setBottles(response.data);
        };

        fetchBottles();
    }, []);

    const handleDelete = async (id) => {
        await deleteBottle(id);
        setBottles(bottles.filter(bottle => bottle.id !== id));
    };

    return (
        <ul>
            {bottles.map(bottle => (
                <li key={bottle.id}>
                    {bottle.address} - {bottle.numberOfBottles} bottles
                    <button onClick={() => handleDelete(bottle.id)}>Delete</button>
                </li>
            ))}
        </ul>
    );
};

export default BottleList;
