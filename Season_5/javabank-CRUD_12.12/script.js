const apiUrl = "http://localhost:8080/javabank5/api/customer";

const tableBody = document.getElementById("customerTable");
const addBtn = document.querySelector(".btn-success");
const firstNameInput = document.getElementById("firstName");
const lastNameInput = document.getElementById("lastName");
const emailInput = document.getElementById("email");
const phoneInput = document.getElementById("phoneNumber");


function getData(url) {
    fetch(url)
        .then((response) => response.json())
        .then((data) => {
            populateTable(data);
        })
        .catch((error) => console.error("Erro ao buscar os dados:", error));
}
getData(apiUrl);


function populateTable(customers) {
    tableBody.innerHTML = "";

    customers.forEach((customer) => {
        const row = document.createElement("tr");

        const firstNameCell = document.createElement("td");
        const lastNameCell = document.createElement("td");
        const emailCell = document.createElement("td");
        const phoneCell = document.createElement("td");
        const actionsCell = document.createElement("td");

        firstNameCell.textContent = customer.firstName || "N/A";
        lastNameCell.textContent = customer.lastName || "N/A";
        emailCell.textContent = customer.email || "N/A";
        phoneCell.textContent = customer.phone || "N/A";

        const editButton = document.createElement("button");
        editButton.textContent = "Edit";
        editButton.className = "btn btn-warning btn-sm";
        editButton.addEventListener("click", () => editCustomer(customer));

        const deleteButton = document.createElement("button");
        deleteButton.textContent = "Delete";
        deleteButton.className = "btn btn-danger btn-sm";
        deleteButton.addEventListener("click", () => deleteCustomer(customer.id));

        actionsCell.appendChild(editButton);
        actionsCell.appendChild(deleteButton);

        row.appendChild(firstNameCell);
        row.appendChild(lastNameCell);
        row.appendChild(emailCell);
        row.appendChild(phoneCell);
        row.appendChild(actionsCell);

        tableBody.appendChild(row);
    });
}

addBtn.addEventListener("click", async () => {
    const customer = {
        firstName: firstNameInput.value,
        lastName: lastNameInput.value,
        email: emailInput.value,
        phone: phoneInput.value,
    };

    await fetch(apiUrl, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(customer),
    });

    getData(apiUrl);
    resetForm();
});

function resetForm() {
    firstNameInput.value = "";
    lastNameInput.value = "";
    emailInput.value = "";
    phoneInput.value = "";
}

// Editar cliente
function editCustomer(customer) {
    firstNameInput.value = customer.firstName;
    lastNameInput.value = customer.lastName;
    emailInput.value = customer.email;
    phoneInput.value = customer.phone;

    // Atualizar o cliente
    const updateBtn = document.querySelector(".btn-primary");
    updateBtn.disabled = false;

    updateBtn.addEventListener("click", async () => {
        await fetch(`${apiUrl}/${customer.id}`, {
            method: "PUT",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({
                firstName: firstNameInput.value,
                lastName: lastNameInput.value,
                email: emailInput.value,
                phone: phoneInput.value,
            }),
        });

        getData(apiUrl);
        resetForm();
        updateBtn.disabled = true;
    });
}

// Deletar cliente
async function deleteCustomer(id) {
    await fetch(`${apiUrl}/${id}`, {
        method: "DELETE",
    });

    getData(apiUrl);
}

