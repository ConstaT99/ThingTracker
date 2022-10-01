# ThingTracker


## Group:
Dongheng Li (dl29), Jiahao Zhang(jiahao4), Ruining Tao (rtao6)

## TOPIC: 
Thing Tracker

## MOTIVATION: 

We are always curious about how tracking devices like airtag and tile work. As one of the most commonly seen IoT devices in our daily life, tracking devices have greatly facilitated our life. According to statista, the FindMy application of Apple currently has 1.8 million active users, which indicates that tracking devices are becoming a rigid demand in people’s daily life. However, there exist some problems with these devices.

Almost all retail tracking devices are relatively expensive (>=30 dollars), and some even require a software subscription after purchasing the hardware. Therefore, we came up with the idea of developing a cheap tracking device (<30 dollars) that includes all priority features of current retailing tracking products. 

Additionally, because of the powerful capabilities of these retailing track devices, many are worried that this tracking system is violating their privacy. Since the majority of the users of Airtag only use some main features to keep track of their belongings, there is no need for features like using the large ios user network to get users’ personal information.

To improve the user experience, we would like to develop an android application for our devices. The features include controlling the buzzer to make sound, using wifi module to get the distance between two devices, and sending notifications if the bluetooth connection is either unstable or unsuccessful. We would optimize the user interface to allow users to easily find their device. We can apply course materials about WiFi signal processing to a real-life project.

## TIMELINE:

Week 5: Buy all necessary hardware and install all necessary software
Week 6 and 7: start to assemble hardwares and install linux on arduino
Week 8 & 9: Program phone application and Implement functionality
Week 10 & 11:  Program phone application and Implement functionality
Week 12 & 13: Test all hardware and software function and ready for video presentation
Week 14 & 15: 12/11 project deliver 

## DEVICES:
Mini Nano V3.0
https://www.amazon.com/AITRIP-Arduino-ATmega328P-Controller-ArduinoIDE/dp/B08C9ZVF51/ref=sr_1_5?crid=3EUGSFWAN4PG7&keywords=evaluation%2Bboard%2C%2Bmcu%2B8-bit%2C%2Barduino%2Bnano%2C%2Bavr%2C%2Batmega328&qid=1664654898&qu=eyJxc2MiOiIxLjQ5IiwicXNhIjoiMS4zNSIsInFzcCI6IjEuMDAifQ%3D%3D&s=electronics&sprefix=Evaluation%2BBoard%2C%2BMCU%2B8-Bit%2C%2BArduino%2BNano%2C%2BAVR%2C%2BATmega328%2Celectronics%2C57&sr=1-5&th=1

Bluetooth Module
https://www.amazon.com/HiLetgo-Wireless-Bluetooth-Transceiver-Arduino/dp/B071YJG8DR

WiFi Module
https://www.amazon.com/HiLetgo-Wireless-Transceiver-Development-Compatible/dp/B010N1ROQS/ref=sr_1_1_sspa?crid=23ZJ9M3RV8A7L&keywords=esp8266&qid=1664655523&qu=eyJxc2MiOiI1LjIzIiwicXNhIjoiNC41NCIsInFzcCI6IjQuMzgifQ%3D%3D&s=electronics&sprefix=esp8266%2Celectronics%2C101&sr=1-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExNzlKNFQ4OTlVMFFMJmVuY3J5cHRlZElkPUEwMjQxMzQzMTFWT0xKRThXSFBZOCZlbmNyeXB0ZWRBZElkPUEwMDc0Nzc2MUUyTFpMTExUNjZFWCZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=

Buzzer
https://www.amazon.com/tatoko-Electronic-Buzzer-Sounder-Continuous/dp/B07QBP1W5L/ref=sr_1_1_sspa?crid=24H0B4FCRA1H0&keywords=Buzzer&qid=1664656047&qu=eyJxc2MiOiI1LjYwIiwicXNhIjoiNC42MCIsInFzcCI6IjQuNDQifQ%3D%3D&s=electronics&sprefix=buzzer%2Celectronics%2C83&sr=1-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyWDhFTEtUWDRVVDdZJmVuY3J5cHRlZElkPUEwNTI3OTczMlhBOEtENVMzVE1UJmVuY3J5cHRlZEFkSWQ9QTA5NDMyMDkyVkcwM1BNREJHWEExJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==

Battery
https://www.amazon.com/Battery-Packs-Lithium-Polymer-100mAh/dp/B0137KTPP0/ref=sr_1_4?crid=OQRI3B0GZ5CH&keywords=lithium+ion+polymer+battery+-+3.7v+100mah&qid=1664655900&qu=eyJxc2MiOiIxLjg1IiwicXNhIjoiMS4yNyIsInFzcCI6IjEuMjcifQ%3D%3D&s=electronics&sprefix=Lithium+Ion+Polymer+Battery+-+3.7v+100mAh%2Celectronics%2C73&sr=1-4


## Other Tools & Software: 
### IDE: Intellj and Arduino
### GitHub Link: https://github.com/ConstaT99/ThingTracker
### Programming language: C++ & Java

## Core Features:
Sound:	
If the tracker is covered by the cloth or hidden in a hard-to-find place, sound will help users to find their things.
Users can turn on and turn off the buzz.
WiFi distance detect:
By using the wifi module, we can detect distance and angle between smartphone and the tracker. So that we can use this information to help users find their things.
BlueTooth disconnect reminder:
Usually this kind of function is included in subscriptions, now it's free for us
Once the user selected the reminder button. Once the tracker is disconnected with the phone, the application will send a notification to the user to remind them, things might be lost so that they can return to the place and find them.

## Possible Features:
     location:
By using wifi information to provide an accurate location for users to find their things.
Using wifi network to provide a general location 





