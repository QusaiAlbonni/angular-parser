import {majd as King } from "utilmode"
class Person {
    name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name; // initializing the name property
    }

    displayInfo() {
        console.log('Name: ${this.name}, Age: ${this.age}');
    }
}

const person1 = new Person("Alice", 30);

person1.displayInfo()