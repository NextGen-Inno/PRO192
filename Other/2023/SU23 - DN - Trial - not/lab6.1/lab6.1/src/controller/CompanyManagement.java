package controller;

import java.awt.BorderLayout;
import java.text.*;
import java.util.*;
import model.Company;
import static model.Company.list;
import model.Customer;
import view.Menu;

public class CompanyManagement extends Menu<String> {

    static String[] menu = {"Read text file to load data", "Add new customer", "Search Customer by different criteria", "Write data in customer1.txt", "Print customer list", "Sort customer", "Delete by ID", "Update info", "Exit"};
    private Company customerList = new Company();
    private Validate check = new Validate();
//------------------------------------------------------------------------------------------------------------------    

    public CompanyManagement() {
        super("Company Management System!!!", menu);
    }
//------------------------------------------------------------------------------------------------------------------   

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                customerList.readFile("C:\\Users\\tuan6\\Documents\\NetBeansProjects\\lab6.1\\src\\file\\customer.txt");
                customerList.displayList();
                break;
            case 2:
                customerList.addCustomer(enterCustomer());
                break;
            case 3:
                customerSearching();
                break;
            case 4:
                customerList.writeFile(list, "C:\\Users\\tuan6\\Documents\\NetBeansProjects\\lab6.1\\src\\file\\customer1.txt");
                break;
            case 5:
                displayCustomers();
                break;
            case 6:
                sortCustomerDescending();
                break;
            case 7:
                deleteById();
                break;
            case 8:
                String idFind = check.inputString("Enter custome's ID you want to update info ");
                String checkId = check.checkIDExisted(idFind);
                if (checkId == null) {
                    if (idFind != null) {
                        updateInfo(idFind);
                    }
                } else {
                    System.out.println("ID not found");
                }
                break;
            case 9:
                System.out.println("Exiting.. ");
        }
    }
//------------------------------------------------------------------------------------------------------------------    

    public void customerSearching() {
        String[] mSearch = {"Find by CustomerID", "Find by Name", "Find by phone", "Find by date of birth", "Exit"};
        Menu m = new Menu("Customer Searching", mSearch) {
            @Override
            public void execute(int n) {
                ArrayList<Customer> rs = null;
                switch (n) {
                    case 1:
                        String val = check.inputString("Enter CustomerID: ");
                        rs = customerList.search(c -> c.getId().equalsIgnoreCase(val));
                        if (rs.isEmpty()) {
                            System.out.println("Not found data");
                        } else {
                            for (Customer r : rs) {
                                System.out.println(r);
                            }
                        }
                        break;
                    case 2:
                        val = check.inputString("Enter Customer's name: ");
                        rs = customerList.search(c -> c.getName().contains(val));
                        if (rs.isEmpty()) {
                            System.out.println("Not found data");
                        } else {
                            for (Customer r : rs) {
                                System.out.println(r);
                            }
                        }

                        break;
                    case 3:
                        val = check.inputString("Enter phone number: ");
                        rs = customerList.search(c -> c.getPhone().equals(val));
                        if (rs.isEmpty()) {
                            System.out.println("Not found data");
                        } else {
                            for (Customer r : rs) {
                                System.out.println(r);
                            }
                        }

                        break;
                    case 4:
                        val = check.inputString("Enter dob: ");
                        rs = customerList.search(c -> c.equals(val));
                        if (rs.isEmpty()) {
                            System.out.println("Not found data");
                        } else {
                            for (Customer r : rs) {
                                System.out.println(r);
                            }
                        }

                        break;
                }
            }

        };
        m.execute(m.getSelected());
        m.run();
    }
//------------------------------------------------------------------------------------------------------------------    

    public Customer enterCustomer() {

        String ID = check.checkID(check.inputString("Enter ID "));
        String IDCheck = check.checkIDExisted(ID);
        while (true) {
            if (IDCheck == null) {
                System.out.println("ID has existed");
                System.out.println("Please enter again");
                ID = check.checkID(check.inputString("Enter ID "));
                IDCheck = check.checkIDExisted(ID);
            } else {
                break;
            }
        }

        while (true) {
            if (ID == null) {
                System.out.println("Please enter ID (KHxx) again");
                ID = check.checkID(check.inputString("Enter ID "));
            } else {
                break;
            }
        }

        String name = check.checkName(check.inputString("Enter name "));
        while (true) {
            if (name == null) {
                System.out.println("Please enter name again. Not include any number or special character");
                name = check.checkName(check.inputString("Enter name "));
            } else {
                break;
            }
        }

        String phone = check.checkPhoneNumber(check.inputString("Enter phone number "));
        while (true) {
            if (phone == null) {
                System.out.println("Please enter phone number again. Must length is 10 and start with 09");
                phone = check.checkPhoneNumber(check.inputString("Enter phone number "));
            } else {
                break;
            }
        }
        Date date = check.checkDOB(check.inputString("Enter dob "));
        while (true) {
            if (date == null) {
                System.out.println("Please enter dob. Must correct format dd/MM/yyyy");
                date = check.checkDOB(check.inputString("Enter dob "));
            } else {
                break;
            }
        }

        return new Customer(ID, name, phone, date);

    }
//------------------------------------------------------------------------------------------------------------------     

    public void displayCustomers() {
        System.out.println("---Customer List---");
        customerList.displayList();
        System.out.println("");
    }
//------------------------------------------------------------------------------------------------------------------    

    public void sortCustomer() {
        String[] mSearch = {"Sort by CustomerID", "Sort by Name", "Sort by phone", "Sort by date of birth", "Exit"};
        Menu m = new Menu("Customer sort", mSearch) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                        Collections.sort(list, new Comparator<Customer>() {
                            @Override
                            public int compare(Customer o1, Customer o2) {
                                return o1.getId().compareTo(o2.getId());
                            }
                        });
                        for (Customer c : list) {
                            System.out.println(c.toString());
                        }
                        System.out.println("");
                        break;
                    case 2:
                        Collections.sort(list, new Comparator<Customer>() {
                            @Override
                            public int compare(Customer o1, Customer o2) {
                                return o1.getName().compareTo(o2.getName());
                            }
                        });
                        for (Customer c : list) {
                            System.out.println(c.toString());
                        }
                        System.out.println("");

                        break;
                    case 3:
                        Collections.sort(list, new Comparator<Customer>() {
                            @Override
                            public int compare(Customer o1, Customer o2) {
                                return o1.getPhone().compareTo(o2.getPhone());
                            }
                        });
                        for (Customer c : list) {
                            System.out.println(c.toString());
                        }
                        System.out.println("");

                        break;
                    case 4:
                        Collections.sort(list, new Comparator<Customer>() {
                            @Override
                            public int compare(Customer o1, Customer o2) {
                                return o1.getDob().compareTo(o2.getDob());
                            }
                        });
                        for (Customer c : list) {
                            System.out.println(c.toString());
                        }
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("Exiting..");
                        System.out.println("");
                        break;

                }
            }
        };
        m.execute(m.getSelected());
        m.run();

    }
//------------------------------------------------------------------------------------------------------------------   

    public void sortCustomerDescending() {
        String[] mSearch = {"Sort by CustomerID", "Sort by Name", "Sort by phone", "Sort by date of birth", "Exit"};
        Menu m = new Menu("Customer sort", mSearch) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                        Collections.sort(list, new Comparator<Customer>() {
                            @Override
                            public int compare(Customer o1, Customer o2) {
                                return -o1.getId().compareTo(o2.getId());
                            }
                        });
                        for (Customer c : list) {
                            System.out.println(c.toString());
                        }
                        System.out.println("");
                        break;
                    case 2:
                        Collections.sort(list, new Comparator<Customer>() {
                            @Override
                            public int compare(Customer o1, Customer o2) {
                                return -o1.getName().compareTo(o2.getName());
                            }
                        });
                        for (Customer c : list) {
                            System.out.println(c.toString());
                        }
                        System.out.println("");

                        break;
                    case 3:
                        Collections.sort(list, new Comparator<Customer>() {
                            @Override
                            public int compare(Customer o1, Customer o2) {
                                return -o1.getPhone().compareTo(o2.getPhone());
                            }
                        });
                        for (Customer c : list) {
                            System.out.println(c.toString());
                        }
                        System.out.println("");

                        break;
                    case 4:
                        Collections.sort(list, new Comparator<Customer>() {
                            @Override
                            public int compare(Customer o1, Customer o2) {
                                return -o1.getDob().compareTo(o2.getDob());
                            }
                        });
                        for (Customer c : list) {
                            System.out.println(c.toString());
                        }
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("Exiting..");
                        System.out.println("");
                        break;

                }
            }
        };
        m.execute(m.getSelected());
        m.run();

    }
//------------------------------------------------------------------------------------------------------------------    

    public void deleteById() {
        String ID = check.inputString("Enter ID ");
        customerList.delete(ID);

    }
//------------------------------------------------------------------------------------------------------------------        

    public void updateInfo(String idFind) {
        String[] mSearch = {"Update phone", "Update date of birth", "Exit"};
        Menu m = new Menu("Customer update", mSearch) {
            @Override
            public void execute(int n) {

                switch (n) {
                    case 1:
                        for (Customer a : list) {
                            if (a.getId().equals(idFind)) {
                                String phoneNew = check.checkPhoneNumber(check.inputString("Input new phone of " + idFind + " "));

                                if (phoneNew != null) {
                                    System.out.println("Update successfully");
                                    a.setPhone(phoneNew);
                                    System.out.println("");
                                    break;
                                } else {
                                    System.out.println("Update fail");
                                    System.out.println("");
                                    break;

                                }

                            }

                        }
                        break;
                    case 2:
                        for (Customer a : list) {
                            if (a.getId().equals(idFind)) {
                                Date DOBnew = check.checkDOB(check.inputString("Input new dob of " + idFind + " "));
                                if (DOBnew != null) {
                                    System.out.println("Update successfully");
                                    a.setDob(DOBnew);
                                    System.out.println("");
                                    break;
                                } else {
                                    System.out.println("Update fail");
                                    System.out.println("");
                                    break;
                                }
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Exiting..");
                        System.out.println("");
                        break;
                }
            }
        };
        m.execute(m.getSelected());
        m.run();
    }
}
