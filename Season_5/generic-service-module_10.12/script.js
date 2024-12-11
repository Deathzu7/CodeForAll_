class Selection {
    constructor() {
        this.clients = [];
    }

    add(name) {
        this.clients.push(name);
    }

    remove(id) {
        if (id >= 0 && id < this.clients.length) {
            this.clients.splice(id, 1);
        } else {
            console.error("ID inválido");
        }
    }

    update(id, newName) {
        if (id >= 0 && id < this.clients.length) {
            this.clients[id] = newName;
        } else {
            console.error("ID inválido");
        }
    }


    destroy() {
        this.clients = [];
    }

    get(id) {
        if (id >= 0 && id < this.clients.length) {
            return this.clients[id];
        } else {
            return "ID inválido";
        }
    }

    get list() {
        return this.clients;
    }
}

const selection = new Selection();
selection.add("John");
selection.add("Bob");
selection.add("Jane");
selection.add("Alice");

console.log(selection.list);

selection.update(0, "John Doe");
console.log(selection.list);
console.log(selection.get(0));

selection.remove(1);
console.log(selection.list);

selection.destroy();
console.log(selection.list);


        