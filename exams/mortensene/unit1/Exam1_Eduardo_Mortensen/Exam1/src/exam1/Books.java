/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

/**
 *
 * @author pc
 */
public class Books {
    private String title;
    private String author;
    private String publisher;
    private String publicationyear;
        public Books(String title, String author,String publisher ,String publicationyear) {
        this.title=title;
        this.author=author;
        this.publisher= publisher;
        this.publicationyear=publicationyear;
        
       
    }

    Books() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the publicationyear
     */
    public String getPublicationyear() {
        return publicationyear;
    }

    /**
     * @param publicationyear the publicationyear to set
     */
    public void setPublicationyear(String publicationyear) {
        this.publicationyear = publicationyear;
    }
}
