package HW_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class PersonalData {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String dateOfBirth;
    private long phoneNumber;
    private char gender;

    public PersonalData(String lastName, String firstName, String patronymic, String dateOfBirth, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + patronymic + " " + dateOfBirth + " " + phoneNumber + " " + gender;
    }
}

class UserDataApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user data (Last Name, First Name, Patronymic, Date of Birth, Phone Number, Gender):");
        String input = scanner.nextLine();

        String[] data = input.split(" ");
        int requiredDataCount = 6;

        if (data.length < requiredDataCount) {
            System.out.println("You entered less data than required.");
            return;
        } else if (data.length > requiredDataCount) {
            System.out.println("You entered more data than required.");
            return;
        }

        String lastName = data[0];
        String firstName = data[1];
        String patronymic = data[2];
        String dateOfBirth = data[3];
        long phoneNumber = 0;
        char gender = '\0';

        try {
            phoneNumber = Long.parseLong(data[4]);
            gender = data[5].charAt(0);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Invalid phone number or gender format.");
            return;
        }

        PersonalData personalData = new PersonalData(lastName, firstName, patronymic, dateOfBirth, phoneNumber, gender);

        String filename = lastName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(personalData.toString());
            writer.newLine();
            System.out.println("Data has been successfully written to the file: " + filename);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file:");
            e.printStackTrace();
        }
    }
}
