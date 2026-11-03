# HealthTrack Pro — Android starter

This project packages a self-contained, offline-first HealthTrack Pro tracker in an Android WebView.
It is a **starter MVP**, not a medically validated product.

## Build an APK without a local computer
1. Create a GitHub account and a **public** repository named `HealthTrackPro-Android`.
2. Upload the contents of this folder to the repository root (not the ZIP itself).
3. GitHub → Actions → approve workflows if prompted.
4. Open the workflow named **Build HealthTrack Pro APK** and select **Run workflow**.
5. After it completes, open the run → Artifacts → download `HealthTrackPro-debug-apk`.
6. Extract the ZIP and install `app-debug.apk` on your Samsung Galaxy A16. Android may prompt you to allow installing from that browser/file manager.

The workflow builds a debug APK using GitHub-hosted runners. Debug APKs are suitable for testing/direct installation, not Play Store production release.

## Current features
- Dashboard with daily calorie/macro/water summary
- Add food diary entries
- Add workout records
- Log water
- Log body weight and view recent entries
- Persistent browser storage (WebView local storage)
- Data export to JSON
- Responsive mobile interface; offline because assets are bundled

## Limitations / next steps
- Records are local to this installation; no account, cloud sync, or cross-device backup.
- Food calories/macros are user-entered and are not a verified nutrition database.
- No medical diagnosis, treatment or validated recommendations.
- To publish to Google Play, the app needs release signing, policy/privacy documentation, target SDK compliance and store listing. Play Console account registration currently has a fee.
