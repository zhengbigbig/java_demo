package com.company;

public class News {
    protected String title;  //拓展子类功能，使用protected
    protected String content;

    public News(String title,String content){
        this.title = title;
        this.content = content;
    }

    protected News () {

    }
    /* 阻止改动title
    public void setTitle(String title) {
        this.title = title;
    }
    */
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    //控制显示
    public String display(){
        return title + "\n" + content;
    }
}
