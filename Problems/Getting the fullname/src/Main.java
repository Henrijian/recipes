class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            this.lastName = "";
        } else {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        String fullName;
        boolean firstNameSet = !"".equals(firstName);
        boolean lastNameSet = !"".equals(lastName);
        if (firstNameSet && lastNameSet) {
            fullName = String.format("%s %s", firstName, lastName);
        } else if (!firstNameSet && !lastNameSet) {
            fullName = "Unknown";
        } else {
            if (firstNameSet) {
                fullName = firstName;
            } else {
                fullName = lastName;
            }
        }
        return fullName;
    }
}