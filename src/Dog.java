class Dog{


    //instance variables
    //#1 make variables for int age, String name, and String breed
    int age;
    String name;
    String breed;

    //constructor
    public Dog(int age_, String name_, String breed_){
        //#2 assign each parameter to each instance variable
        age = age_;
        name = name_;
        breed = breed_;
    }


    //instance methods
    //#3 write a method called bark that prints a barking sound like "ruff". There are no parameters.

    public void bark() {
        System.out.println("ruff");
    }


    //#4 write a method called toString that returns a String describing the dog (basically, return a String with the dog's instance variables). There are no parameters.
    public String toString(){
        if (age < 10) {
            return "This is " + age + " years old. It's name is " + name + ", and it is the " + breed + " breed.";
        }
        else {
            return "This dog is " + age + " years old. It's name is " + name + ", and it is the " + breed + " breed.";
        }

    }

}
