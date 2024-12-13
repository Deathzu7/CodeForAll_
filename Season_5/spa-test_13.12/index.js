// Função para buscar os modelos de veículos pela marca
async function getVehicleModels(make) {
    try {
        const response = await fetch(`https://vpic.nhtsa.dot.gov/api/vehicles/getmodelsformake/${make}?format=json`);
        
        if (!response.ok) {
            throw new Error('Erro ao buscar dados da API');
        }

        const data = await response.json();
        console.log(data);

        // Processar e exibir os modelos
        data.Results.forEach((vehicle) => {
            console.log(`Modelo: ${vehicle.Model_Name}`);
        });

    } catch (error) {
        console.error('Erro:', error);
    }
}

// Exemplo de uso
getVehicleModels('toyota');
