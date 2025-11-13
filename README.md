# MyApplication (Android + OpenCV)

## Features implemented
- Android app:
    - OpenCV integration
    - Simple UI test
- Web viewer (if applicable)

## Screenshots / GIF
![Screenshot](https://github.com/TeeshaSrivastava/MyApplication1/blob/master/res/screenshots/Screenshot%20(67).png)

## Setup Instructions
1. Clone the repository
2. Open in Android Studio
3. Ensure Android NDK is installed via SDK Tools
4. Ensure OpenCV SDK is in `third_party/opencv-android/sdk`
5. Build and run on emulator or device
6. For web part (if any):
    - Install Node.js + npm
    - Run `npm install` and `npm start`

## Architecture Overview
- Android: MainActivity.kt, uses OpenCVLoader to initialize OpenCV
- JNI: OpenCV native functions linked via `sdk` module
- Frame flow: UI → OpenCV processing → display results
- TypeScript (if any): handles web viewer
