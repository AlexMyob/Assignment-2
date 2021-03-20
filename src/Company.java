public class Company {
    private String name;
    private String stockSymbol;
    private String industry;
    private String type; //As in public or private
    private int yearFounded;

    public Company(String name, String stockSymbol, String industry, String type, int yearFounded) {
        super();
        this.name = name;
        this.stockSymbol = stockSymbol;
        this.industry = industry;
        this.type = type;
        this.yearFounded = yearFounded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    @Override
    public String toString() {
        return "Company [name=" + name + ", stockSymbol=" + stockSymbol + ", industry=" + industry + ", type=" + type
                + ", yearFounded=" + yearFounded + "]";
    }

}
