import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer[] = new Customer[100];
        Employee employee[] = new Employee[100];
        fuelType fueltype[] = new fuelType[100];
        Station station[] = new Station[100];
        Transaction transaction[] = new Transaction[100];

        int employeeCount = 0;
        int customerCount = 0;
        int fuelCount = 0;
        int transactionCount = 0;
        int stationCount = 0;
        int v, w, x, y, z;
        int employeeId;
        int customerId;
        int fuelId;
        int stationId;
        int choice1, choice2, choice3, choice4, choice5, choice6, choice7;

        for (int i = 0; i < 100; i++) {
            customer[i] = new Customer();
            employee[i] = new Employee();
            fueltype[i] = new fuelType();
            station[i] = new Station();
            transaction[i] = new Transaction();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("**** Welcome to Petrol Management System *****");

        do {
            System.out.println("1. MANAGE DATA");
            System.out.println("2. SEARCH ");
            System.out.println("3. REPORTS");
            System.out.println("4. Exit");

            System.out.println("Enter The Choice : ");
            choice1 = sc.nextInt();

            switch (choice1) {
                case 1:
                    do {
                        System.out.println("1. MANAGE EMPLOYEE");
                        System.out.println("2. MANAGE CUSTOMER");
                        System.out.println("3. MANAGE FUEL TYPE ");
                        System.out.println("4. MANAGE PETROL STATION");
                        System.out.println("5. MANAGE TRANSACTION");
                        System.out.println("Enter the Choice : ");
                        choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1:
                                do {
                                    System.out.println("EMPLOYEE MANAGEMENT ");
                                    System.out.println("1. ADD EMPLOYEE");
                                    System.out.println("2. UPDATE EMPLOYEE");
                                    System.out.println("3. DELETE EMPLOYEE");
                                    System.out.println("4. DISPLAY EMPLOYEE");
                                    System.out.println("5. EXIT");
                                    System.out.println("Enter the Choice : ");
                                    choice3 = sc.nextInt();
                                    switch (choice3) {
                                        case 1:
                                            if (employeeCount >= 100) {
                                                System.out.println("FULL CAPACITY! TRY AGAIN...");
                                            } else {
                                                employee[employeeCount].setter();
                                                employeeCount++;
                                            }
                                            break;

                                        case 2:
                                            System.out.println("ENTER EMPLOYEE ID TO UPDATE : ");
                                            employeeId = sc.nextInt();

                                            boolean found = false;
                                            for (int i = 0; i < employeeCount; i++) {
                                                if (employee[i].getEmployeeID() == employeeId) {
                                                    found = true;
                                                    employee[i].setter();
                                                    System.out.println("EMPLOYEE UPDATED SUCCESSFULLY");
                                                    break;
                                                }
                                            }
                                            if (!found) {
                                                System.out.println("EMPLOYEE IS NOT FOUND PLEASE TRY AGAIN WITH CORRECT EMPLOYEE ID");
                                            }
                                            break;

                                        case 3:
                                            System.out.println("ENTER EMPLOYEE ID TO DELETE : ");
                                            employeeId = sc.nextInt();

                                            int found1 = -1;
                                            for (int i = 0; i < employeeCount; i++) {
                                                if (employee[i].getEmployeeID() == employeeId) {
                                                    found1 = i;
                                                    break;
                                                }
                                            }
                                            for (int j = found1; j < employeeCount - 1; j++) {
                                                employee[j] = employee[j + 1];
                                            }
                                            employeeCount--;
                                            System.out.println("EMPLOYEE IS DELETED SUCCESSFULLY");
                                            break;

                                        case 4:
                                            System.out.println("ENTER EMPLOYEE ID TO DISPLAY : ");
                                            employeeId = sc.nextInt();
                                            for (int i = 0; i < employeeCount; i++) {
                                                if (employee[i].getEmployeeID() == employeeId) {
                                                    employee[i].display();
                                                }
                                            }
                                            break;

                                        case 5:
                                            break;

                                        default:
                                            System.out.println("INVALID INPUT TRY AGAIN WITH CORRECT EMPLOYEE ID ");
                                            break;
                                    }
                                } while (choice3 != 5);
                                break;

                            case 2:
                                do {
                                    System.out.println("CUSTOMER MANAGEMENT");
                                    System.out.println("1. ADD CUSTOMER");
                                    System.out.println("2. UPDATE CUSTOMER");
                                    System.out.println("3. DELETE CUSTOMER");
                                    System.out.println("4. DISPLAY CUSTOMER");
                                    System.out.println("5. EXIT...");
                                    System.out.println("Enter the Choice ");
                                    choice4 = sc.nextInt();
                                    switch (choice4) {
                                        case 1:
                                            if (customerCount >= 100) {
                                                System.out.println("FULL CAPACITY! TRY AGAIN...");
                                            } else {
                                                customer[customerCount].setter();
                                                customerCount++;
                                            }
                                            break;

                                        case 2:
                                            System.out.println("ENTER THE CUSTOMER ID TO UPDATE : ");
                                            customerId = sc.nextInt();
                                           boolean found = false;
                                            for (int i = 0; i < customerCount; i++) {
                                                if (customer[i].getCustomerID() == customerId) {
                                                    found = true;
                                                    customer[i].setter();
                                                    System.out.println("CUSTOMER UPDATED SUCCESSFULLY");
                                                    break;
                                                }
                                            }
                                            if (!found) {
                                                System.out.println("CUSTOMER IS NOT FOUND PLEASE TRY AGAIN WITH CORRECT CUSTOMER ID");
                                            }
                                            break;

                                        case 3:
                                            System.out.println("ENTER THE CUSTOMER ID TO DELETE : ");
                                            customerId = sc.nextInt();
                                            int found2 = -1;
                                            for (int i = 0; i < customerCount; i++) {
                                                if (customer[i].getCustomerID() == customerId) {
                                                    found2 = i;
                                                    break;
                                                }
                                            }
                                            for (int j = found2; j < customerCount - 1; j++) {
                                                customer[j] = customer[j + 1];
                                            }
                                            customerCount--;
                                            System.out.println("CUSTOMER IS DELETED SUCCESSFULLY");
                                            break;

                                        case 4:
                                            System.out.println("ENTER THE CUSTOMER ID TO DISPLAY : ");
                                            customerId = sc.nextInt();
                                            for (int i = 0; i < customerCount; i++) {
                                                customer[i].display();
                                            }
                                            break;

                                        case 5:
                                            break;

                                        default:
                                            System.out.println("INVALID INPUT TRY AGAIN WITH CORRECT CUSTOMER ID ");
                                            break;
                                    }
                                } while (choice4 != 5);
                                break;

                            case 3:
                                do {
                                    System.out.println("STATION MANAGEMENT");
                                    System.out.println("1. ADD STATION");
                                    System.out.println("2. UPDATE STATION");
                                    System.out.println("3. DELETE STATION");
                                    System.out.println("4. DISPLAY STATION");
                                    System.out.println("5. EXIT ");
                                    System.out.println("Enter the Choice : ");
                                    choice5 = sc.nextInt();
                                    switch (choice5) {
                                        case 1:
                                            if (stationCount >= 100) {
                                                System.out.println("CAPACITY FULL! TRY AGAIN");
                                            } else {
                                                station[stationCount].setter();
                                                stationCount++;
                                            }
                                            break;

                                        case 2:
                                            System.out.println("ENTER THE STATION ID TO UPDATE : ");
                                            stationId = sc.nextInt();
                                           boolean found = false;
                                            for (int i = 0; i < stationCount; i++) {
                                                if (station[i].getStationID() == stationId) {
                                                    found = true;
                                                    station[i].setter();
                                                    System.out.println("STATION IS UPDATED SUCCESSFULLY");
                                                    break;
                                                }
                                            }
                                            if (!found) {
                                                System.out.println("STATION IS NOT FOUND PLEASE TRY AGAIN WITH CORRECT STATION ID");
                                            }
                                            break;

                                        case 3:
                                            System.out.println("ENTER THE STATION ID TO DELETE : ");
                                            stationId = sc.nextInt();
                                            int found3 = -1;
                                            for (int i = 0; i < stationCount; i++) {
                                                if (station[i].getStationID() == stationId) {
                                                    found3 = i;
                                                    break;
                                                }
                                            }
                                            for (int j = found3; j < stationCount - 1; j++) {
                                                station[j] = station[j + 1];
                                            }
                                            stationCount--;
                                            System.out.println("STATION IS DELETED SUCCESSFULLY");
                                            break;

                                        case 4:
                                            System.out.println("ENTER THE STATION ID TO DISPLAY : ");
                                            stationId = sc.nextInt();
                                            for (int i = 0; i < stationCount; i++) {
                                                if (station[i].getStationID() == stationId) {
                                                    station[i].display();
                                                }
                                            }
                                            break;

                                        case 5:
                                            break;

                                        default:
                                            System.out.println("INVALID INPUT TRY AGAIN WITH CORRECT STATION ID");
                                            break;
                                    }
                                } while (choice5 != 5);
                                break;

                            case 4:
                                do {
                                    System.out.println("FUEL MANAGEMENT");
                                    System.out.println("1. ADD FUEL TYPE");
                                    System.out.println("2. UPDATE FUEL TYPE");
                                    System.out.println("3. DELETE FUEL TYPE");
                                    System.out.println("4. DISPLAY FUEL TYPE");
                                    System.out.println("5. EXIT");
                                    System.out.println("Enter the Choice : ");
                                    choice6 = sc.nextInt();
                                    switch (choice6) {
                                        case 1:
                                            if (fuelCount >= 100) {
                                                System.out.println("CAPACITY FULL! TRY AGAIN");
                                            } else {
                                                fueltype[fuelCount].setter();
                                                fuelCount++;
                                            }
                                            break;

                                        case 2:
                                            System.out.println("ENTER THE FUEL ID TO UPDATE : ");
                                            fuelId = sc.nextInt();
                                            for (int i = 0; i < fuelCount; i++) {
                                                if (fueltype[i].getFuelID() == fuelId) {
                                                    fueltype[i].setter();
                                                    System.out.println("FUEL IS UPDATED SUCCESSFULLY");
                                                }
                                            }
                                            break;

                                        case 3:
                                            System.out.println("ENTER THE FUEL ID TO DELETE : ");
                                            fuelId = sc.nextInt();
                                            int found4 = -1;
                                            for (int i = 0; i < fuelCount; i++) {
                                                if (fueltype[i].getFuelID() == fuelId) {
                                                    found4 = i;
                                                    break;
                                                }
                                            }
                                            for (int j = found4; j < fuelCount - 1; j++) {
                                                fueltype[j] = fueltype[j + 1];
                                            }
                                            fuelCount--;
                                            System.out.println("FUEL TYPE IS DELETED SUCCESSFULLY");
                                            break;

                                        case 4:
                                            System.out.println("ENTER THE FUEL ID TO DISPLAY : ");
                                            fuelId = sc.nextInt();
                                            for (int i = 0; i < fuelCount; i++) {
                                                if (fueltype[i].getFuelID() == fuelId) {
                                                    fueltype[i].display();
                                                }
                                            }
                                            break;

                                        case 5:
                                            break;

                                        default:
                                            System.out.println("INVALID INPUT TRY AGAIN WITH CORRECT FUEL ID ");
                                            break;
                                    }
                                } while (choice6 != 5);
                                break;

                            case 5:
                                do {
                                    System.out.println("TRANSACTION MANAGEMENT");
                                    System.out.println("1. ADD TRANSACTION");
                                    System.out.println("2. UPDATE TRANSACTION");
                                    System.out.println("3. DELETE TRANSACTION");
                                    System.out.println("4. DISPLAY TRANSACTION");
                                    System.out.println("5. EXIT");
                                    System.out.println("Enter the Choice : ");
                                    choice7 = sc.nextInt();
                                    switch (choice7) {
                                        case 1:
                                            x = transaction[transactionCount].setter(customer, employee, station, fueltype, fuelCount, employeeCount, customerCount, stationCount);
                                            if (x == 1) {
                                                transactionCount++;
                                            }
                                            break;

                                        case 2:
                                            System.out.println("ENTER THE TRANSACTION ID TO UPDATE : ");
                                            int transactionId = sc.nextInt();
                                            for (int i = 0; i < transactionCount; i++) {
                                                if (transaction[i].getTransactionID() == transactionId) {
                                                    transaction[i].setter(customer, employee, station, fueltype, fuelCount, employeeCount, customerCount, stationCount);
                                                    System.out.println("TRANSACTION IS UPDATED SUCCESSFULLY");
                                                }
                                            }
                                            break;

                                        case 3:
                                            System.out.println("ENTER TRANSACTION ID TO DELETE : ");
                                            transactionId = sc.nextInt();
                                            int found5 = -1;
                                            for (int i = 0; i < transactionCount; i++) {
                                                if (transaction[i].getTransactionID() == transactionId) {
                                                    found5 = i;
                                                    break;
                                                }
                                            }
                                            for (int j = found5; j < transactionCount - 1; j++) {
                                                transaction[j] = transaction[j + 1];
                                            }
                                            transactionCount--;
                                            System.out.println("TRANSACTION IS DELETED SUCCESSFULLY");
                                            break;

                                        case 4:
                                            System.out.println("ENTER THE TRANSACTION ID TO DISPLAY : ");
                                            transactionId = sc.nextInt();
                                            for (int i = 0; i < transactionCount; i++) {
                                                if (transaction[i].getTransactionID() == transactionId) {
                                                    transaction[i].display();
                                                }
                                            }
                                            break;

                                        case 5:
                                            break;

                                        default:
                                            System.out.println("INVALID INPUT! TRY AGAIN");
                                            break;
                                    }
                                } while (choice7 != 5);
                                break;
                        }
                    } while (choice2 != 5);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("INVALID INPUT! TRY AGAIN.");
            }
        } while (choice1 != 4);
    }
}
