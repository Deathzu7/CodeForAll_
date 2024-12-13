function getData(url) {
    fetch(url)
        .then((response) => response.json())
        .then((data) => populateTable(data))
        .catch((error) => console.error(error));
}
getData("http://localhost:8080/javabank5/api/customer");

function populateTable(data) {
    const tableBody = document.getElementById("customersTable").getElementsByTagName("tbody")[0];

    data.forEach((customer) => {
        const row = document.createElement("tr");


        const firstNameCell = document.createElement("td");
        firstNameCell.textContent = customer.firstName;

        const lastNameCell = document.createElement("td");
        lastNameCell.textContent = customer.lastName;

        const emailCell = document.createElement("td");
        emailCell.textContent = customer.email;

        const phoneCell = document.createElement("td");
        phoneCell.textContent = customer.phone;

        row.appendChild(firstNameCell);
        row.appendChild(lastNameCell);
        row.appendChild(emailCell);
        row.appendChild(phoneCell);

        tableBody.appendChild(row);

    })
}