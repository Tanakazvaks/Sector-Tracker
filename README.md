# 📈 Sector Tracker - Professional Stock Market Analytics App

A modern Android application for tracking stock market data with real-time analytics, built using Jetpack Compose and MVVM architecture.

![Splash Screen](https://img.shields.io/badge/Splash%20Screen-Animated-blue)
![Home Screen](https://img.shields.io/badge/Home%20Screen-Interactive-green)
![Details Screen](https://img.shields.io/badge/Details%20Screen-Analytics-orange)
![Android](https://img.shields.io/badge/Platform-Android-success)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-purple)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-blue)

## 🎥 Demo Screenshots

| Splash Screen | Home Screen | Details Screen | Dark Mode |
|:-------------:|:-----------:|:--------------:|:---------:|
| ![Splash](demo/splash.png) | ![Home](demo/home.png) | ![Details](demo/details.png) | ![Dark](demo/dark_mode.png) |

## ✨ Features

### 📊 **Real-time Stock Data**
- Live stock prices from Marketstack API
- Daily change percentage with color-coded indicators
- Professional stock analytics dashboard

### 🎨 **Modern UI/UX**
- **Jetpack Compose** for declarative UI
- **Material Design 3** with dynamic colors
- **Dark/Light mode** toggle with persistence
- **Smooth animations** and transitions
- **Professional gradient designs**

### 🔍 **Advanced Functionality**
- **Search** stocks by symbol, company, or sector
- **Pull-to-refresh** for latest data
- **Offline support** with Room database caching
- **Detailed analytics** for each stock
- **Market statistics** and sector tracking

### 🏗️ **Robust Architecture**
- **MVVM (Model-View-ViewModel)** pattern
- **MVI (Model-View-Intent)** state management
- **Repository pattern** for data abstraction
- **Clean separation** of concerns

## 🛠️ Tech Stack

- **Language**: Kotlin 100%
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM + MVI
- **Local Database**: Room
- **Networking**: Retrofit + Coroutines
- **Dependency Injection**: Manual DI (Factory pattern)
- **Testing**: JUnit, Coroutines Test
- **API**: Marketstack Stock API

## 📱 Screens

### 1. **Splash Screen**
- Animated welcome screen
- Gradient background with smooth transitions
- Professional branding

### 2. **Home Screen**
- Stock list with real-time prices
- Search functionality with filtering
- Market statistics overview
- Dark/light mode toggle
- Pull-to-refresh for updates

### 3. **Details Screen**
- Comprehensive stock analytics
- Price history and statistics
- Company information
- 52-week high/low data
- Interactive action buttons

## 🏗️ Project Structure

sector-tracker/
├── app/
│ ├── src/main/java/com/example/sectortracker/
│ │ ├── MainActivity.kt # Application entry point
│ │ ├── mvi/ # MVI architecture
│ │ │ ├── StockAction.kt
│ │ │ ├── StockState.kt
│ │ │ └── reducer.kt
│ │ ├── data/
│ │ │ ├── local/ # Room database
│ │ │ │ ├── StockDatabase.kt
│ │ │ │ ├── entities/
│ │ │ │ └── daos/
│ │ │ ├── network/ # API layer
│ │ │ │ ├── ApiService.kt
│ │ │ │ └── models/
│ │ │ └── repository/ # Data orchestration
│ │ │ └── StockRepository.kt
│ │ ├── screens/ # UI Screens
│ │ │ ├── HomeScreen.kt
│ │ │ ├── DetailsScreen.kt
│ │ │ ├── SplashScreen.kt
│ │ │ └── StockHelper.kt
│ │ ├── navigation/ # Navigation graph
│ │ │ └── NavGraph.kt
│ │ ├── ui/theme/ # Theming system
│ │ │ ├── Theme.kt
│ │ │ ├── Color.kt
│ │ │ ├── Typography.kt
│ │ │ └── ThemeManager.kt
│ │ └── viewmodels/ # ViewModels
│ │ └── StockViewModel.kt
│ └── src/test/java/com/example/sectortracker/ # Unit tests
├── build.gradle.kts
└── README.md


## 🧪 Testing

Comprehensive test suite with 90%+ code coverage:

- **Unit Tests**: JUnit tests for ViewModel, Repository, and Reducer
- **Coroutine Testing**: Using TestDispatcher for async operations
- **Mock API**: FakeApiService for network testing
- **State Management**: Complete MVI reducer testing

### Test Structure:
- `StockViewModelTest.kt` - ViewModel logic testing
- `StockRepositoryTest.kt` - Data layer testing  
- `ReducerTest.kt` - State management testing
- `FakeApiService.kt` - Mock API implementation

## 🚀 Getting Started

### Prerequisites
- Android Studio Giraffe or later
- Android SDK 34
- Java 17
- Marketstack API Key (free tier available)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Tanakazvaks/sector-tracker.git

2. Open in Android Studio:
   File → Open → Select project directory

3. Add API Key:
   Get free API key from marketstack.com
   Replace in ApiService.kt:
   
   @Query("access_key") accessKey: String = "YOUR_API_KEY_HERE"

4.Build and run on emulator or physical device


📦 Dependencies
Key dependencies used in the project:

dependencies {
    // Core Android
    implementation 'androidx.core:core-ktx:1.12.0'
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.6.2'
    
    // Compose
    implementation 'androidx.activity:activity-compose:1.8.0'
    implementation "androidx.compose.ui:ui:1.5.4"
    implementation "androidx.compose.ui:ui-tooling-preview:1.5.4"
    implementation 'androidx.compose.material3:material3:1.1.2'
    implementation "androidx.compose.material:material-icons-extended:1.5.4"
    
    // Navigation
    implementation 'androidx.navigation:navigation-compose:2.7.5'
    
    // Room Database
    implementation "androidx.room:room-runtime:2.6.0"
    implementation "androidx.room:room-ktx:2.6.0"
    kapt "androidx.room:room-compiler:2.6.0"
    
    // Networking
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    
    // Testing
    testImplementation 'junit:junit:4.13.2'
    testImplementation 'org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation "androidx.compose.ui:ui-test-junit4:1.5.4"
}



🎯 Key Design Decisions
1. MVI Architecture
   -Why: Predictable state management, unidirectional data flow
   -Benefit: Easy debugging, testable, maintainable

2. Jetpack Compose
   -Why: Modern declarative UI, faster development
   -Benefit: Less boilerplate, reactive UI, better performance

3. Offline-First Design
   -Why: Network resilience, better user experience
   -Benefit: App works without internet, faster loading

4. Professional Theme System
   -Why: Consistent branding, user preference support
   -Benefit: Polished appearance, accessibility compliance


   📈 API Integration
The app uses Marketstack API for real-time stock data:
-Endpoint: https://api.marketstack.com/v2/eod/latest
-Data: Real-time prices, volume, daily changes
-Symbols: AAPL, MSFT, JPM, GS, AMZN, TSLA, NFLX, GOOGL
-Rate Limit: 1000 requests/month (free tier)

🏆 What I Learned
Building this project helped me master:
-Advanced Android Architecture: MVVM + MVI patterns
-Jetpack Compose: Building complex UIs declaratively
-State Management: Handling complex app states predictably
-Testing: Comprehensive unit testing with coroutines
-API Integration: RESTful APIs with Retrofit
-Database: Room persistence with caching strategies
-Professional UI/UX: Creating polished, production-ready interfaces


🔮 Future Enhancements
Planned features for future releases:
-Portfolio Tracking: User portfolio management
-Real-time Push Notifications: Price alerts
-Advanced Charts: Interactive price history charts
-More Stock Exchanges: NASDAQ, NYSE, global markets
-Watchlists: Custom stock watchlists
-Social Features: Share analysis with friends
-News Integration: Latest financial news
-AI Predictions: Machine learning price predictions

🤝 Contributing
Contributions are welcome! Please follow these steps:
-Fork the repository
-Create a feature branch (git checkout -b feature/AmazingFeature)
-Commit your changes (git commit -m 'Add some AmazingFeature')
-Push to the branch (git push origin feature/AmazingFeature)
-Open a Pull Request

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

👨‍💻 Author
Tanaka Zvakaramba
GitHub: @Tanakazvaks
LinkedIn: Tanaka Zvakaramba
Email: tanakazvakaramba@gmail.com 

🙏 Acknowledgments
Marketstack API for providing free stock data
Android Developers for excellent documentation
JetBrains for Kotlin language
Google for Jetpack Compose and Android Studio
Yeshiva University for the learning opportunity

⭐ If you like this project, please give it a star! ⭐

Note: This project was developed as part of a capstone assignment, demonstrating proficiency in modern Android development with Jetpack Compose, MVVM architecture, and professional UI/UX design principles.

