## Pokémon List Android Application

 This Android application allows you to view a list of Pokémon and their basic information. The application retrieves data from an HTTP API to display the list.
 <div>
 <img src="https://user-images.githubusercontent.com/118699556/231904723-314300cf-b426-4998-bf65-3de6ac49b385.png" width="300">
 <img src="https://user-images.githubusercontent.com/118699556/231904736-2cfb2e62-7337-4e90-9aff-d62531f24d40.png" width="300">
 </div>

## Features

View a list of Pokémon with their images, names, and types
Filter the list by Pokémon type
Click on a Pokémon to view more detailed information, including its stats and moves

  
## Libraries

     - 'com.squareup.picasso:picasso:2.71828'
     
     - 'fileTree(dir: 'libs', include: ['*.jar'])'
     
     - 'androidx.appcompat:appcompat:1.1.0'
     
     - 'androidx.constraintlayout:constraintlayout:1.1.3'
     
     - 'junit:junit:4.12'
     
     - 'androidx.constraintlayout:constraintlayout:1.1.3'
     
     - 'androidx.test.ext:junit:1.1.1'
     
     - 'androidx.test.espresso:espresso-core:3.2.0'
     
     - 'androidx.cardview:cardview:1.0.0'
     
     - 'androidx.legacy:legacy-support-v4:1.0.0'
     
## Why the Http API ?

     - The application doesn't need to store all the Pokémon data locally, which can save space on the user's device.
     
     - The application can retrieve the latest Pokémon data from the API, ensuring that the information is up-to-date.
     
     - The API provides a standardized way of accessing and exchanging data, making it easier to maintain and update the application in the future.


## Getting Started

To run this application, you will need to have the following:

Android Studio installed on your computer
An Android device or emulator running Android 5.0 or higher

To get started, follow these steps:

  - Clone this repository to your local machine.
 
  - Open Android Studio and import the project from the cloned repository.
 
  - Build and run the application on your Android device or emulator.


## Usage

When you open the application, you will see a list of Pokémon. 

Clicking on a Pokémon in the list will take you to a detail view with more information about the selected Pokémon.


