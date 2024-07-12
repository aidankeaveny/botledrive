import axios from 'axios';

const api = axios.create({
    baseURL: 'http://localhost:8080/api',
});

export const getBottles = () => api.get('/bottles');
export const addBottle = (bottle) => api.post('/bottles', bottle);
export const deleteBottle = (id) => api.delete(`/bottles/${id}`);
export const updateBottle = (id, bottle) => api.put(`/bottles/${id}`, bottle);
