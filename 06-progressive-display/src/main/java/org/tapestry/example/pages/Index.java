package org.tapestry.example.pages;


import org.apache.tapestry5.annotations.Property;



public class Index 
{
	
    @Property
    private int sleepTimeMillis;
    
    public void onProgressiveDisplayFromBlock() throws InterruptedException{
        Thread.sleep(2000);
        this.sleepTimeMillis = 3000;
    }
}
    