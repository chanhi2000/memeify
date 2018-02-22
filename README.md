# Memeify
A RayWenderlich Android Project for practicing Intent with Kotlin

## Implicit Intents
- informs Android taht it needs an app to handle the intent's actoin when it starts.  - The Android system then compares the given intent against all apps installed on the device to see which ones can handle that action, 
- process the intent (if more than one can handle the intent, the user is prompt to choose one)

### Implicit Intent: `MediaStore.ACTION_IMAGE_CAPTURE`
It's used to retrieve image data captured from camera.


## Explicit Intents
 Compared to implicit intents, explicit intents are a lot more conservative.
 - describes a specific component that will be created and used
 - typically used for transferring 'explicit' data to another activity

## Handling Intents
 - For `Uri`, uses `intent.getParcelable<Uri>(TAG)`
 - For `Int`, uses `intent.getIntExtra(TAG, defaultValue)` 


