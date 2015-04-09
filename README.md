# swing-components
Automatically exported from code.google.com/p/swing-components

Swing Components is library that provides common user interface controls that aren't in the standard Swing toolkit.

Controls currently in the library

 1. JSplitButton
 2. JCalendarWidget
 3. JDatePicker
 4. JButtonMenuItem
 5. JIPTextField
 6. JCheckboxList
 7. Column Manager
 
**JSplitButton**

![](http://4.bp.blogspot.com/_cEtIZPdSTf0/TO1UYDOiJFI/AAAAAAAAANI/Js2Dq_rplO4/s1600/JSplitButton-GTK.png)
![](http://2.bp.blogspot.com/_cEtIZPdSTf0/TO1UpqVznOI/AAAAAAAAANM/QFelpE5Zabs/s1600/JSplitButton-Nimbus.png)

A simple implementation of the split button control in Java. This control raises two events.

```java 
     buttonClicked(e)
     splitButtonClicked(e) 
     ```

The buttonClicked event is raised when the button is clicked, the left part, which will not trigger the dropdown menu. Whereas the splitButtonClicked event is raised when the split part of the button is clicked and displays a popup menu.

Usage:
```java
    //first instantiate the control
    JSplitButton splitButton = new JSplitButton();
    //register for listener
    splitButton.addSplitButtonActionListener(new SplitButtonActionListener() {
    
                public void buttonClicked(ActionEvent e) {
                  System.out.println("Button Clicked");
                }
    
                public void splitButtonClicked(ActionEvent e) {
                  System.out.println("Split Part licked");
                }
            });
    //add popup menu
    splitButton.add(popupMenu);
    //add this control to panel
    panel.add(splitButton);
```


**JCalendar &amp; JDatepicker**

JCalendarWidget is a highly customizable, multi lingual Calendar component for graphically picking a date.It renders a calendar including the days of the week, the weeks of the year, and the days of the month and can be easily used in GUI builders.

![](http://2.bp.blogspot.com/-lUTsmIWOtnA/Tay3O7nsp5I/AAAAAAAAAOs/nacWZMtjFT8/s1600/_2011-04-04_00-12-29.png)
![](http://4.bp.blogspot.com/-vp-8Fqmp45o/Tay3PFRJjRI/AAAAAAAAAO0/FCHIAq0DUJU/s1600/_2011-04-04_00-30-07.png)
![](http://2.bp.blogspot.com/-RfmmqiGAs-o/Tay3OrRtJmI/AAAAAAAAAOc/pT7-0QyCnpM/s1600/_2011-04-02_01-45-58.png)
![](http://2.bp.blogspot.com/-IM3wNRzGHIo/Tay3O_3U5dI/AAAAAAAAAOk/KR6RQ3t5PzQ/s1600/_2011-04-02_01-46-42.png)
![](http://3.bp.blogspot.com/-wFsmI9kUFio/Tay5P43OrtI/AAAAAAAAAO8/F2Xav-MM2UA/s1600/datepicker.PNG)

Usage:
```java
//instantiate the JCalendarWidget
JCalendarWidget widget = new JCalendarWidget();
// JDatePicker has overloaded constructor to specify the dateFormat
//will use DateFormat.LONG as default
JDatePicker picker = new JDatePicker();
//customize the widget
widget.setHolidayForeground(Color.RED);
widget.setHighlightHoliday(true);
widget.setDatesFromPreviousAndNextMonthShown(true);

//add the widget to datepicker
picker.setCalendarWidet(picker);
```

**JButtonMenuItem**

JButtonMenuItem is a swing component to add buttons to the JMenuItem, like the edit MenuItem? in Google Chrome. This is an easy to use control and can be added to the NetBeans? palette. This control fires an buttonClicked event, if the button on the JButtonMenuItem is fired. The getActionCommand method of the event returns the text of the button pressed.

To handle the event you need to subscribe to JButtonMenuItemListener. 

Usage:
```java
// Create a menubar for a JFrame
JMenuBar menuBar = new JMenuBar();
        
// Add the menubar to the frame
setJMenuBar(menuBar);
        
// Define and add drop down menus to the menubar
JMenu fileMenu = new JMenu("File");
JMenu editMenu = new JMenu("Edit");
menuBar.add(fileMenu);
menuBar.add(editMenu);
        
// Create and add simple menu item to one of the drop down menu
JMenuItem mi = new JMenuItem("Item 1");
fileMenu.add(mi);

//get the images
ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource("Edit_16x16.png")));

Image cutIcon = (Toolkit.getDefaultToolkit().createImage(getClass().getResource("Cut_16x16.png")));

Image copyIcon = Toolkit.getDefaultToolkit().createImage(getClass().getResource("Copy_16x16.png"));

Image pasteIcon = Toolkit.getDefaultToolkit().createImage(getClass().getResource("Paste_16x16.png"));

//create and add JButtonMenuItem to the dropdown
JButtonMenuItem mi1 = new JButtonMenuItem("Edit",icon);

//set the button style
mi1.setButtonStyle(new ButtonStyle(mi1, ButtonStyle.ROUNDED_CORNERS, ButtonStyle.ImageOrText.DISPLAY_ICON  ));

//set the buttons
mi1.setButtons(new Button[] { new Button("Cut", "Cut", cutIcon),new Button("Copy", "Copy", copyIcon),new Button("Paste", "Paste", pasteIcon)});

//subscribe to the listener
mi1.addJButtonMenuItemListener(new JButtonMenuItemListener() {
    public void buttonClicked(ActionEvent e) {
          System.out.println(e.getActionCommand());
            }
        });
fileMenu.add(mi1);
```

![](http://1.bp.blogspot.com/_cEtIZPdSTf0/TR5AaeZC9VI/AAAAAAAAAOE/tKp_rhYj99M/s1600/JButtonMenuItem1.png)
![](http://1.bp.blogspot.com/_cEtIZPdSTf0/TR5AbH3DJyI/AAAAAAAAAOI/r0dmxbil1H0/s1600/JButtonMenuItem2.png)
![](http://1.bp.blogspot.com/_cEtIZPdSTf0/TR5Absa4HTI/AAAAAAAAAOM/jE0scNar8XE/s1600/JButtonMenuItem3.png)
![](http://3.bp.blogspot.com/_cEtIZPdSTf0/TR5AcKnRr9I/AAAAAAAAAOQ/Ei_itwaaDlQ/s1600/JButtonMenuItem4.png)

**JIPTextField:**
 
JIPTextField is IP Address Control supporting both IPV4 &amp; IPV6. The functionality of JIPTextField is similar to the IP Address control found in Windows. For an example, if the value entered is greater than 255 then it defaults to 255. Also, you can use Tab to navigate from one octet to another within the JIPTextField.

Screenshots:

![](http://4.bp.blogspot.com/-K3FdG2uVzVU/TdrbQArGyGI/AAAAAAAAAPI/defr5GfaM-k/s320/JIpTextField1.png)
![](http://3.bp.blogspot.com/-pyKcTau8snA/TdrbQwREXxI/AAAAAAAAAPM/NA8eLBVcVk4/s320/JIpTextField2.png)


Usage:
```java
JIpTextField ipField = new JIpTextField();
//add it to GUI

//set ip address
ipField.setText("192.168.1.1");
//or 
ipField.setAddress(Inet4Address.getByName("192.168.1.1"));

//get the ip address
int[] octects = ipField.getOctects();
//returns -&gt; octects[0] = 192;octects[1] = 168;octects[2] = 1;octects[3] = 1;

//to get the ip address as string
String ip = ipField.getText();
String ip1 = ipField.getIpAddressString();

//to get the ip as an instance of InetAddress
InetAddress addr  = ipField.getIpAddress();
```

**JCheckboxList**

A list where each item has a checkbox in it. With each item in a list being an instance of JCheckbox, the list selection is independent to checkbox selection. As with all the other visible beans in this library, this can be added to the IDE's palette.

Use ```getCheckedIndices()``` and ```getCheckedItems()``` to get the items that are checked in the CheckboxList. For a screenshot of, see screenshot 2 of Column Manager.

**Column Manager**

Table Column Chooser attaches a popup menu on the JTable header, when the user right-clicks on the header a popup menu appears allowing the user to show or hide columns from the view, resize the columns and  arrange the columns.

Screenshots: 

![](http://3.bp.blogspot.com/-UDEgho3B1Uc/TdLz3EVNI-I/AAAAAAAAAPA/ps69Dh0devs/s1600/TableColumnManager1.png)
![](http://3.bp.blogspot.com/-UDEgho3B1Uc/TdLz3EVNI-I/AAAAAAAAAPA/ps69Dh0devs/s200/TableColumnManager1.png)

Usage:
```java
//thats all there is to it!
TableColumnChooser tableColumnChooser = new TableColumnChooser(jTable.getTableHeader());
tableColumnChooser.install();
```
The popupmenu that appears allows users to show and hide columns in the table.A column can be shown or hidden through the popup menu, as well as programmatically. To resize all columns to fit within the current viewport, select Size All Columns to Fit from the popup. Programmatically, you can do this using the packAll() and  packColumn(int vColIndex, int margin) methods.
```java
// true to show the column, false to hide it.
tableColumnChooser.toggleColumnVisibility("Title1",true); 
```
