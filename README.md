
The application has beautiful UI, it is very easy to use. User can easy to insert property data and store it to Phone database. User also upload image of property. The app is built using cordova framework, so it is very fast, because the entire source code of the application is written only in html, css and javascript. The application only use two plugin to save data and select image from phone so the process of building app will be very fast. The command to build or run app is very simple.


-	Screen 1: The home screen of application, we have the search box, button ADD to add new property and list of Property.
-	Screen 2: The adding screen, we have property type input text, bedrooms, … and button save to navigate to the Confirm Screen.
-	Screen 3: The confirm screen allow user review all data before save to database
-	Screen 4: The detail of property screen, show the name of property type, bedrooms, the reporter, … and image of property.
-	Screen 5: The Note add screen, allow user add note for property.

AAAACSUk0Bs:APA91bFhtEWE-AonTRjujLiEbfhKzUkOwfOgtpxCq2ceYiIfi3sKxp-jSlVH_8o48Ul3Is4ZXMhYnCJyYNlqNM2RuNqTdPWo_DmHOn0M0Hb8ZEV2uFtKPTzwvQxgwr4uVst95aDqWhOr


"cfDp4qC0Rm-GDBvxgmklRB:APA91bFRicdXypO78aDWim7DYgek6pDdbPmWi5R5VO5lanZaVNU8ftIk5Xdu9kIDQKFhyRZXtc4Y3Xik_WlJDFirAqCTkcIEV7Sgs4fiPxlGsfTDPp9ZRB5N5H3aRtwgX05a30CGgj2a"

"fqCwOGeDRMSDlygyq8ozcT:APA91bFzceux-mArtGBe7SSqPvlfgz-16KfAa-Ifp0AAmmL_zBmR4-YBkBayX2xKCFnQrgqN_MFXbAHmSKu-n99IbP4Ex4RP9dmfwcgGWRJ0EMwvSedj4gnkfukVZHameB7efCX2zgcQ"


"fqCwOGeDRMSDlygyq8ozcT:APA91bFzceux-mArtGBe7SSqPvlfgz-16KfAa-Ifp0AAmmL_zBmR4-YBkBayX2xKCFnQrgqN_MFXbAHmSKu-n99IbP4Ex4RP9dmfwcgGWRJ0EMwvSedj4gnkfukVZHameB7efCX2zgcQ"

"fHrg0ILvQE--VOhGqH-hCz:APA91bGG6vH6eClWBaTfvjm99oS0mP1to-hy0_hcOi2UVed-7bwK72rB023msMHVderxtW5iZfsopaPuxIIhGX4D6yKWjEahNJVi_RWRuKApTAPxpQzb2X1OtMwSgrPQCyQwiUVaqZ86"

"cfDp4qC0Rm-GDBvxgmklRB:APA91bFRicdXypO78aDWim7DYgek6pDdbPmWi5R5VO5lanZaVNU8ftIk5Xdu9kIDQKFhyRZXtc4Y3Xik_WlJDFirAqCTkcIEV7Sgs4fiPxlGsfTDPp9ZRB5N5H3aRtwgX05a30CGgj2a"

"fqCwOGeDRMSDlygyq8ozcT:APA91bFzceux-mArtGBe7SSqPvlfgz-16KfAa-Ifp0AAmmL_zBmR4-YBkBayX2xKCFnQrgqN_MFXbAHmSKu-n99IbP4Ex4RP9dmfwcgGWRJ0EMwvSedj4gnkfukVZHameB7efCX2zgcQ"

"cfDp4qC0Rm-GDBvxgmklRB:APA91bFRicdXypO78aDWim7DYgek6pDdbPmWi5R5VO5lanZaVNU8ftIk5Xdu9kIDQKFhyRZXtc4Y3Xik_WlJDFirAqCTkcIEV7Sgs4fiPxlGsfTDPp9ZRB5N5H3aRtwgX05a30CGgj2a"



"fHrg0ILvQE--VOhGqH-hCz:APA91bGG6vH6eClWBaTfvjm99oS0mP1to-hy0_hcOi2UVed-7bwK72rB023msMHVderxtW5iZfsopaPuxIIhGX4D6yKWjEahNJVi_RWRuKApTAPxpQzb2X1OtMwSgrPQCyQwiUVaqZ86"
















Index: app/src/main/java/com/norae/spotlight/login/SignUpActivity.java
IDEA additional info:
Subsystem: com.intellij.openapi.diff.impl.patch.CharsetEP
<+>UTF-8
===================================================================
diff --git a/app/src/main/java/com/norae/spotlight/login/SignUpActivity.java b/app/src/main/java/com/norae/spotlight/login/SignUpActivity.java
--- a/app/src/main/java/com/norae/spotlight/login/SignUpActivity.java	(revision bca381da5abc8f870617a9539d46cb470961510e)
+++ b/app/src/main/java/com/norae/spotlight/login/SignUpActivity.java	(date 1639361702626)
@@ -20,10 +20,13 @@
 import com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler;
 import com.norae.spotlight.MainActivity;
 import com.norae.spotlight.R;
+import com.norae.spotlight.SocialLogin;
 import com.norae.spotlight.bus.BusEvent;
 import com.norae.spotlight.bus.RxBus;
 import com.norae.spotlight.settings.PrivacyPolicy;
 import com.norae.spotlight.songs.search.ProgressDialogFragment;
+import com.norae.spotlight.ui.featureddetail.DanceChallengeFragment;
+import com.norae.spotlight.utils.IntentSenderUtils;
 
 import io.reactivex.disposables.Disposable;
 import io.reactivex.functions.Consumer;
@@ -37,6 +40,8 @@
     private Disposable mSubscription;
     DialogFragment mProgressViewFragment;
 
+    private boolean isFromChallengeFragment = false;
+
     private class SignUpProviderResultHandlerImpl implements SignInProviderResultHandler {
         /**
          * Receives the successful sign-in result and starts the main activity.
@@ -95,6 +100,7 @@
     public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_signup_new);
+        isFromChallengeFragment = getIntent() != null && getIntent().getExtras() != null && getIntent().getExtras().getString("start_activity", "").equals(SocialLogin.class.toString());
 //        final TextInputEditText usernameInput = findViewById(R.id.input_username);
         EditText usernameInput = findViewById(R.id.input_username);
         usernameInput.addTextChangedListener(new TextWatcher() {
@@ -137,9 +143,13 @@
         findViewById(R.id.link_to_sign_in).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
-                // Finish the registration screen and return to the Login activity
-                Intent signinIntent = new Intent(activityContext, SignInActivity.class);
-                startActivity(signinIntent);
+                if (isFromChallengeFragment) {
+                    IntentSenderUtils.startSignInActivity(SignUpActivity.this, SignUpActivity.class.toString());
+                } else {
+                    // Finish the registration screen and return to the Login activity
+                    Intent signinIntent = new Intent(activityContext, SignInActivity.class);
+                    startActivity(signinIntent);
+                }
                 finish();
             }
         });
Index: app/src/main/java/com/norae/spotlight/login/SignInActivity.java
IDEA additional info:
Subsystem: com.intellij.openapi.diff.impl.patch.CharsetEP
<+>UTF-8
===================================================================
diff --git a/app/src/main/java/com/norae/spotlight/login/SignInActivity.java b/app/src/main/java/com/norae/spotlight/login/SignInActivity.java
--- a/app/src/main/java/com/norae/spotlight/login/SignInActivity.java	(revision bca381da5abc8f870617a9539d46cb470961510e)
+++ b/app/src/main/java/com/norae/spotlight/login/SignInActivity.java	(date 1639362527132)
@@ -17,6 +17,7 @@
 import com.amazonaws.mobile.auth.core.signin.SignInProviderResultHandler;
 import com.norae.spotlight.MainActivity;
 import com.norae.spotlight.R;
+import com.norae.spotlight.SocialLogin;
 import com.norae.spotlight.bus.BusEvent;
 import com.norae.spotlight.bus.RxBus;
 import com.norae.spotlight.songs.search.ProgressDialogFragment;
@@ -35,6 +36,7 @@
     DialogFragment mProgressViewFragment;
     private CompositeDisposable mSubscription;
 
+    private boolean isFromChallengeFragment = false;
 
     private class SignInProviderResultHandlerImpl implements SignInProviderResultHandler {
         /**
@@ -47,9 +49,11 @@
             Log.i(LOG_TAG, "Signin succeeded");
             mProgressViewFragment.dismiss();
 
-            Intent intent = new Intent(SignInActivity.this, MainActivity.class);
-            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
-            startActivity(intent);
+            if (!isFromChallengeFragment) {
+                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
+                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
+                startActivity(intent);
+            }
             finish();
         }
 
@@ -84,6 +88,9 @@
     public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_sign_in);
+
+        isFromChallengeFragment = getIntent() != null && getIntent().getExtras() != null && (getIntent().getExtras().getString("start_activity", "").equals(SignUpActivity.class.toString()) || getIntent().getExtras().getString("start_activity", "").equals(SocialLogin.class.toString()));
+
         mSubscription = new CompositeDisposable();
 
         mSigninButton = findViewById(R.id.btn_signin);
Index: app/src/main/java/com/norae/spotlight/SocialLogin.java
IDEA additional info:
Subsystem: com.intellij.openapi.diff.impl.patch.CharsetEP
<+>UTF-8
===================================================================
diff --git a/app/src/main/java/com/norae/spotlight/SocialLogin.java b/app/src/main/java/com/norae/spotlight/SocialLogin.java
--- a/app/src/main/java/com/norae/spotlight/SocialLogin.java	(revision bca381da5abc8f870617a9539d46cb470961510e)
+++ b/app/src/main/java/com/norae/spotlight/SocialLogin.java	(date 1639362527160)
@@ -42,6 +42,7 @@
 import com.norae.spotlight.ui.featureddetail.DanceChallengeFragment;
 import com.norae.spotlight.users.User;
 import com.norae.spotlight.users.UserId;
+import com.norae.spotlight.utils.IntentSenderUtils;
 import com.norae.spotlight.utils.SharedPreferenceUtils;
 
 import amazonaws.mobile.util.ViewHelper;
@@ -106,9 +107,14 @@
                 finish();
                 break;
             case R.id.bt_loginEmail: {
-                Intent intent = new Intent(context, SignUpActivity.class);
-                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
-                startActivity(intent);
+                if (isFromChallengeFragment) {
+                    IntentSenderUtils.startSignUpActivity(SocialLogin.this, SocialLogin.class.toString());
+                    finish();
+                } else {
+                    Intent intent = new Intent(context, SignUpActivity.class);
+                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
+                    startActivity(intent);
+                }
                 break;
             }
             case R.id.bt_loginFacebook:
@@ -359,8 +365,12 @@
         if (view.getId() == R.id.tv_alreadysigned) {
             switch (motionEvent.getAction()) {
                 case MotionEvent.ACTION_UP:
-                    Intent signinIntent = new Intent(this, SignInActivity.class);
-                    startActivity(signinIntent);
+                    if (isFromChallengeFragment) {
+                        IntentSenderUtils.startSignInActivity(SocialLogin.this, SocialLogin.class.toString());
+                    } else {
+                        Intent signinIntent = new Intent(this, SignInActivity.class);
+                        startActivity(signinIntent);
+                    }
                     finish();
                     break;
 
Index: app/src/main/java/com/norae/spotlight/utils/IntentSenderUtils.java
IDEA additional info:
Subsystem: com.intellij.openapi.diff.impl.patch.CharsetEP
<+>UTF-8
===================================================================
diff --git a/app/src/main/java/com/norae/spotlight/utils/IntentSenderUtils.java b/app/src/main/java/com/norae/spotlight/utils/IntentSenderUtils.java
--- a/app/src/main/java/com/norae/spotlight/utils/IntentSenderUtils.java	(revision bca381da5abc8f870617a9539d46cb470961510e)
+++ b/app/src/main/java/com/norae/spotlight/utils/IntentSenderUtils.java	(date 1639361702672)
@@ -5,6 +5,8 @@
 import android.os.Bundle;
 
 import com.norae.spotlight.SocialLogin;
+import com.norae.spotlight.login.SignInActivity;
+import com.norae.spotlight.login.SignUpActivity;
 
 public class IntentSenderUtils {
     public static int DANCE_CHALLENGE_REQUEST_CODE = 1001;
@@ -18,4 +20,24 @@
             activity.startActivityForResult(intent, DANCE_CHALLENGE_REQUEST_CODE);
         }
     }
+
+    public static void startSignUpActivity(Activity activity, String TAG) {
+        if (activity != null) {
+            Bundle bundle = new Bundle();
+            bundle.putString("start_activity", TAG);
+            Intent intent = new Intent(activity, SignUpActivity.class);
+            intent.putExtras(bundle);
+            activity.startActivityForResult(intent, DANCE_CHALLENGE_REQUEST_CODE);
+        }
+    }
+
+    public static void startSignInActivity(Activity activity, String TAG) {
+        if (activity != null) {
+            Bundle bundle = new Bundle();
+            bundle.putString("start_activity", TAG);
+            Intent intent = new Intent(activity, SignInActivity.class);
+            intent.putExtras(bundle);
+            activity.startActivityForResult(intent, DANCE_CHALLENGE_REQUEST_CODE);
+        }
+    }
 }




