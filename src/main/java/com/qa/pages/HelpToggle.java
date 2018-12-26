package com.qa.pages;

public class HelpToggle 
{
	
	CreateSTPPage create = new CreateSTPPage();
	
				public void helpToggleTest()
				{
					if((create.HelpText).isDisplayed())
					{
						System.out.println("Help Text present");
					}
					else
					{
						(create.HelpToggle).click();
						if((create.HelpText).isDisplayed())
						{
							System.out.println("Help Text present");
						}
						else
						{
							System.out.println("Help Text missing");
						}
						
					}	
				}
}