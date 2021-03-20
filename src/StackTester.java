public class StackTester {

    public static void main(String[] args) {
        ArrayStack<Integer> numStack = new ArrayStack<>();
        ArrayStack<String> stringStack = new ArrayStack<>();
        ArrayStack<Company> companyStack = new ArrayStack<>();

        try {
            //Testing numStack
            numStack.push(0);
            numStack.push(1);
            numStack.push(2);
            numStack.push(3);
            numStack.push(4);

            System.out.println(numStack.peek());  // 4
            System.out.println(numStack.peek());  // 4

            System.out.println(numStack.pop());  // 4
            System.out.println(numStack.pop());  // 3
            System.out.println(numStack.pop());  // 2
            System.out.println(numStack.pop());  // 1

            //Testing stringStack
            stringStack.push("Hello");
            System.out.println(stringStack);

            stringStack.push("World");
            System.out.println(stringStack);

            stringStack.push("This");
            stringStack.push("Is");
            stringStack.push("A");
            stringStack.push("Test");

            System.out.println(stringStack);
            System.out.println("Length: " + stringStack.length());
            System.out.println("Peek: " + stringStack.peek());
            System.out.println(stringStack);
            System.out.println("Pop: " + stringStack.pop());
            System.out.println(stringStack + "\n");

            //Testing Companies
            Company company1 = new Company("Microsoft", "MSFT", "Technology", "Public", 1975);
            Company company2 = new Company("Amazon", "AMZN", "E-Commerce", "Public", 1994);
            Company company3 = new Company("Albertsons", "ACI", "Grocery", "Public", 1939);
            Company company4 = new Company("Koch Industries", "N/A", "Chemical Manufacturing", "Private", 1940);
            Company company5 = new Company("JPMorgan Chase", "JPM", "Banking", "Public", 2000);

            companyStack.push(company1);
            companyStack.push(company2);
            companyStack.push(company3);
            companyStack.push(company4);
            companyStack.push(company5);

            System.out.println("\n" + companyStack);
            System.out.println("Length: " + companyStack.length());
            System.out.println("Peek: " + companyStack.peek());
            System.out.println(companyStack);
            System.out.println("Pop: " + companyStack.pop());
            System.out.println(companyStack + "\n");
        } catch (CannotAddException e) {
            System.out.println(e);
        }
    }
}