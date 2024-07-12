import React, { useEffect, useState } from 'react';
import { getBottles, updateBottle } from '../api';

const PickupChecklist = () => {
    const [bottles, setBottles] = useState([]);

    useEffect(() => {
        const fetchBottles = async () => {
            const response = await getBottles();
            setBottles(response.data);
        };

        fetchBottles();
    }, []);

    const handlePickup = async (id) => {
        const bottle = bottles.find(b => b.id === id);
        await updateBottle(id, { ...bottle, pickedUp: true });
        setBottles(bottles.map(b => b.id === id ? { ...b, pickedUp: true } : b));
    };

    return (
        <ul>
            {bottles.map(bottle => (
                <li key={bottle.id}>
                    {bottle.address} - {bottle.numberOfBottles} bottles
                    <button onClick={() => handlePickup(bottle.id)} disabled={bottle.pickedUp}>
                        {bottle.pickedUp ? 'Picked Up' : 'Mark as Picked Up'}
                    </button>
                </li>
            ))}
        </ul>
    );
};

export default PickupChecklist;
