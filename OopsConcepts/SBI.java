public class SBI implements Bank{
    @Override
    public void getInterestRate() {
        System.out.println("7.1%" + repoRate);
    }

    @Override
    public String printBankName(String name) {
        return name;
    }
}
