public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = " ";
        int counter = 0;

        while (counter < personArray.length ){

            Person currentPerson = personArray[counter];
            String strrp = currentPerson.toString();
            //System.out.println(currentPerson);
            result += strrp;
            counter++;
        }
        // create a `counter`
        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for(int counter = 0; counter < personArray.length; counter++){
            Person currentPerson =  personArray[counter];
            String strrp = currentPerson.toString();
            result += strrp;
        }
        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for(Person counter: personArray) {
            String strrp = counter.toString();
            result += strrp;
            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
