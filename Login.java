class Login{
    
    //deklarasi
    private String username, password;
    
    //constructor
    public Login()
    {
        username = "Maulana Alfarel";
        password = "202113021";
    }
    public Login(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    //setter
    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    //getter
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
}