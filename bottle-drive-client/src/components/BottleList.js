import React, { useEffect, useState } from 'react';
import { getBottles } from '../api';

function BottleList() {
  const [bottles, setBottles] = useState([]);

  useEffect(() => {
    fetchBottles();
  }, []);

  const fetchBottles = async () => {
    try {
      const response = await getBottles();
      setBottles(response.data);
    } catch (error) {
      console.error('Error fetching bottles:', error);
    }
  };

  return (
    <div>
      <h2>Bottle List</h2>
      <ul>
        {bottles.map((bottle) => (
          <li key={bottle.id}>
            {bottle.address} - {bottle.numberOfBottles} bottle(s)
          </li>
        ))}
      </ul>
    </div>
  );
}

export default BottleList;
