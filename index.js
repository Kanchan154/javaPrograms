import React from "react";
import { ReactDOM } from "react";
import './index.css';
import App from './App';
import reportWebVitals from './reportWebvitals';
import Headers from "./header";
import all from './header.css';



const root=ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <React.StrictMode>
        <Headers/>
    </React.StrictMode>
);


reportWebVitals();



