# Recipe App

![App Screenshot](screenshot.png)

## Description

This is a recipe app built using Kotlin. It utilizes fragments to provide different screens including a category screen, home screen, favorites screen, and the ability to watch recipe videos on YouTube. The app integrates RoomDB for local storage and Retrofit for making API calls to a food database.

## Features

- Browse recipes by categories
- Mark recipes as favorites
- Watch recipe videos on YouTube
- Search for specific recipes
- Save favorite recipes locally
- ...

## Technologies Used

- Kotlin
- Android Fragments
- RoomDB
- Retrofit
- Food API
- ...

## Architecture Plan

The app follows the MVVM (Model-View-ViewModel) architecture pattern for clean separation of concerns:

- **Model**: This layer holds the data and business logic of the application. It includes data classes, Room Database entities, and the repository pattern for handling data operations.

- **View**: This layer represents the UI components of the app. It includes the layout files (XML) for fragments and activities.

- **ViewModel**: This layer acts as a bridge between the Model and the View. It holds the UI-related data and provides methods for updating the UI. It also communicates with the repository to fetch data.

- **Repository**: The repository is responsible for managing the data operations. It provides a clean API to access data from various sources (e.g., RoomDB, Retrofit).

## Screenshots

![Screenshot 1](screenshot1.png)
![Screenshot 2](screenshot2.png)
![Screenshot 3](screenshot3.png)

## Getting Started

### Prerequisites

- Android Studio
- Emulator or Android device

### Installation

1. Clone the repository.
2. Open the project in Android Studio.
3. Set up an emulator or connect an Android device.
4. Build and run the application.

## Usage

- Open the app.
- Explore recipes by selecting categories from the Category screen.
- Mark recipes as favorites by tapping the heart icon.
- Watch recipe videos by navigating to the YouTube screen.
- ...

## Contributing

If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch.
3. Make your changes and commit them.
4. Push to your fork and submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgements

- [Food API](https://spoonacular.com/food-api)


---

Feel free to replace the placeholder content with your actual information. This README will serve as a valuable resource for anyone who wants to understand, use, or contribute to your Recipe App.
