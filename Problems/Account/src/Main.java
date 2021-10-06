class Account {

    private long balance;
    private String ownerName;
    private boolean locked;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return String.copyValueOf(ownerName.toCharArray());
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = new String(ownerName);
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}