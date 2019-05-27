# MCCClubHub
Mobile Device Application for the use of club members in various clubs at Miracosta Community College

# App Features

## Splash Screen 
* Intro to the app
* Gradient background in Miracosta College Colors (Maybe?)
* Logo of app in center
* When finished "loading" the logo does a small bouncing animation and then heads to the top and disappears off screen

## Log-In Activity
* Logo comes down and settles in position
* EditText for entering student ID number
* EditText for entering Password
* Sign up option and forgot password button below 
* remember me checkbox available

## Main Activity
* First seen when logged into the app
* Has a navigation menu
* Current club name at top
* Brief club summary right below
* Current club announcements follow
* Last is list of events for that month

## Profile Activity
* Also has navigation menu
* User's picture in a circle at the top
* Student name in bold below picture
* Same profile will be used for any clubs that the user is a part of 
* Various student info follows

## Calendar Activity
* Also has navigation menu
* Alert's the user of events for the current club
* 2 Fragments:
* Fragment 1 has Calendar view which will display events for a specific selected day
* Fragment 2 has list view that will display all events of the current club by date. Will only
list the events for the current date and on

## Check in Activity
* Allows the user to sign in or "check in" to a club meeting simply by opening the app at the location of the meeting
* App takes user's location and verifies that it is the same location as the meeting
* Club icon is shown at the center (maybe does an animation as the user is checked in)
* User can only check in once a day
* If user has already checked in that day this activity will simply say that they have already checked in and that they can try
again tomorrow
* If user tries to check in but they are not in the proper location app will tell user that they are not at the proper location so they 
cannot be checked in 

## Projects Activity
* Allows the user to create, join, and view projects in the club
* Has a create new project button at the top (does not mean an official project is created because it must first be approved)
* Has list view of existing projects which shows the name of the project, the current number of members (there can also be a listed 
cap on number of project members), and a picture to describe the project (possibly just give generic picture options instead of having user submit a picture)




