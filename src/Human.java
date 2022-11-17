public class Human {
    private String name;
    private int yearOfBirth;
    private String cityOfResidence;
    private String job;

    public Human(String name, int yearOfBirth, String cityOfResidence, String job) {
        this.name = (name.isEmpty() || name.equals(" ") || name == null) ? "Информация не указана" : name;
        this.yearOfBirth = (yearOfBirth <= 0) ? 0 : yearOfBirth;
        this.cityOfResidence = (cityOfResidence.isEmpty() || cityOfResidence.equals(" ") || cityOfResidence == null) ? "Информация не указана" : cityOfResidence;
        this.job = (job.isEmpty() || job.equals(" ") || job == null) ? "Информация не указана" : job;
    }
    public String getName() {
        return this.name;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getCityOfResidence() {
        return this.cityOfResidence;
    }

    public String getJob() {
        return this.job;
    }

    public void greeting() {
        System.out.println("Привет! Меня зовут "+this.getName()+". " +
                           "Я из города "+this.getCityOfResidence()+". " +
                           "Я родился в "+this.getYearOfBirth()+" году. " +
                           "Я работаю на должности "+this.getJob()+". Будем знакомы!");
    }
}
