export function init() {
    const app = document.getElementById('app');
    app.innerHTML = `
        <h1>Vehicle Models</h1>
        <input type="text" id="makeInput" placeholder="Enter a car brand">
        <button id="searchButton">Search</button>
        <ul id="modelsList"></ul>
    `;

    const searchButton = document.getElementById('searchButton');
    const makeInput = document.getElementById('makeInput');
    const modelsList = document.getElementById('modelsList');
    

    searchButton.addEventListener('click', async () => {
        const make = makeInput.value.trim().toLowerCase();
        if (make) {
            modelsList.innerHTML = '<li>Loading...</li>';
            try {
                const response = await fetch(`https://vpic.nhtsa.dot.gov/api/vehicles/getmodelsformake/${make}?format=json`);
                const data = await response.json();

                modelsList.innerHTML = '';
                data.Results.forEach((vehicle) => {
                    const li = document.createElement('li');
                    li.textContent = vehicle.Model_Name;

                    li.addEventListener('click', () => {
                        const query = `${make} ${vehicle.Model_Name}`;
                        window.open(`https://www.google.com/search?q=${encodeURIComponent(query)}`, '_blank');
                    });

                    modelsList.appendChild(li);
                });
            } catch (error) {
                modelsList.innerHTML = '<li>Error fetching models</li>';
            }
        } else {
            alert('Please enter a car brand.');
        }
    });
}
