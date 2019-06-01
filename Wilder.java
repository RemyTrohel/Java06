class Wilder{
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstName(){
        return firstname;
    }

    public boolean getAware(){
        return aware;
    }

    public void setFirstName(String firstname){
        this.firstname = firstname;
    }

    public void setAware(boolean aware){
        this.aware = aware;
    }

    public String whoAmi(){
        String iAm = "Je m\'appelle "+getFirstName()+" et je";
        if(getAware()){
            iAm = iAm+" suis aware";
        }
        else{
            iAm = iAm+" ne suis pas aware";
        }
        return iAm;
    }

}