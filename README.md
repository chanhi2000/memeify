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

## Broadcast Intents
```kotlin
val mediaScanIntent = Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE)
mediaScanIntent.data = Uri.fromFile(imageFile)
sendBroadcast(mediaScanIntent)
```
- uses `ACTION_MEDIA_SCANNER_SCAN_FILE` action to attach data (in a form of a Uri)
  to save image files to your local Android file system

## Intent Filtering
- Add intent-filter tag into your `AndroidManifest.xml`	for Android to be able to do different `ACTION` outside of App.
- For instance, this app uses `ACTION_SEND` action to get images directly from Photo/Gallery app
  

